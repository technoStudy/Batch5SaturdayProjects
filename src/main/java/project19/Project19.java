package project19;

/*
API Endpoint for GET, POST and PUT: "/school-service/api/notifications"
API Endpoint for DELETE: "/school-service/api/notifications/{notification_id}"

Test 1: Create Notification
        Inside body, you need to provide:
          name: (Name is up to you)
          description: ( description is up to you)
          type: ( "STUDENT_PAYMENT_TIME" )
          schoolId: (" 5c5aa8551ad17423a4f6ef1d ")

        Verify that the Status Code is 201

Test 2: (Try to) Re-create the same notification (Negative Testing)
        Verify that the Status Code is 400

Test 3: Edit the name of the created Notification
        Verify that the Status Code is 200

Test 4: Delete the created Notification
        Verify that the Status Code is 200

Test 5: (Try to) Delete a previous deleted Notification (Negative Testing)
        Verify that the Status Code is 404
*/

/*
Notes:
- You need to authenticate at the beginning of your test class
- You do NOT need to use cucumber (TestNG and RestAssured are enough)
- Code any pojo class(es) you may need
- Optionally you may use hamcrest matchers
- Do not forget to add the necessary dependencies to your project pom.xml
 */
public class Project19 {
}
