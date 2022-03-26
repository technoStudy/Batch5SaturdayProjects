package project19.solution;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class NotificationApiTests {

    private Cookies loginCookie;
    private final String BASE_URL = "https://test.mersys.io";
    private final Notification notification = new Notification();
    private String notificationId;
    private RequestSpecification requestSpec;

    @BeforeClass
    public void createLoginCookie() {
        Map<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put("username", "i.muratov");
        loginCredentials.put("password", "QWEasd@1901");
        loginCookie =
                given()
                        .contentType(ContentType.JSON)
                        .body(loginCredentials)
                        .when()
                        .post(BASE_URL.concat("/auth/login"))
                        .then()
                        .statusCode(200)
                        .extract().response().
                        getDetailedCookies()
        ;
    }

    @Test
    public void createNotification() {
        notification.name = "This is for creating notification test";
        notification.type = "STUDENT_PAYMENT_TIME";
        notification.description = "API Testing for Notification functionality";
        notification.schoolId = "5c5aa8551ad17423a4f6ef1d";

        requestSpec = new RequestSpecBuilder()
                .addCookies(loginCookie)
                .setContentType(ContentType.JSON)
                .setBody(notification)
                .build();

        notificationId =
                given()
                        .spec(requestSpec)
                        .when()
                        .post(BASE_URL.concat("/school-service/api/notifications"))
                        .then()
                        .statusCode(201)
                        .log().body()
                        .extract()
                        .jsonPath()
                        .getString("id")
        ;
    }

    @Test(dependsOnMethods = "createNotification")
    public void createNotificationNegativeTest() {
        given()
                .spec(requestSpec)
                .when()
                .put(BASE_URL.concat("/school-service/api/notifications"))
                .then()
                .statusCode(400);
    }

    @Test(dependsOnMethods = "createNotificationNegativeTest")
    public void updateNotificationTest() {
        notification.name = "This is the updated notification name";
        notification.id = notificationId;
        given()
                .cookies(loginCookie)
                .contentType(ContentType.JSON)
                .body(notification)
                .when()
                .put(BASE_URL.concat("/school-service/api/notifications"))
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test(dependsOnMethods = "updateNotificationTest")
    public void deleteNotificationTest() {
        given()
                .cookies(loginCookie)
                .contentType(ContentType.JSON)
                .when()
                .delete(BASE_URL.concat("/school-service/api/notifications/").concat(notificationId))
                .then()
                .statusCode(200);
    }

    @Test(dependsOnMethods = "deleteNotificationTest")
    public void deleteNotificationNegativeTest() {
        given()
                .spec(requestSpec)
                .when()
                .delete(BASE_URL.concat("/school-service/api/notifications").concat(notificationId))
                .then()
                .statusCode(404);
    }
}
