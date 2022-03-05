package project15;

public class Project15 {
        //        NOTE-1: You are expected to use TestNG
        //        NOTE-3: Use Page Object Model. Because we will use your classes in the next projects !!!

        // Navigate to https://test.mersys.io/

        // Dismiss the cookie message (if it pops up for the first time)
        // Change the website language to English if needed.

        // Login by the credentials (username = "i.muratov" and password = "QWEasd@1901")

        // Click on "More" in the top menu (also known as hamburger button)
        // Click on Setup
        // Click on School Setup
        // Click on Departments

        // Click on "+" button to add a school department

        // On the modal window, type "High School" for the name of the department and "HS-1" for the code.

        // Click on "Section" tab

        // Type "Junior Classes" for the name of the section and "Juniors" for the short name and click on "Add" button to create the section.

        // Create another section with the name "Senior Classes" and the short name "Seniors" similarly.

        // Click on "Save" for creating the school department.

        // Verify if the department with the name "High School" created.

        // Verify if the two Sections were created too.

        // Click on "x" to dismiss the modal window.
        // Click on "+" button to add a school department AGAIN

        // On the modal window, type "High School" for the name of the department and "HS-1" for the code AGAIN
        // Click on "Save" for TRYING to create a school department WITH THE SAME NAME AND CODE.
        // Verify that a dialog box occurs with a message "There is already Department with "High School" name!".

        // On the modal window, type "High School" for the name of the department and "HSC-1" for the code AGAIN
        // Click on "Save" for TRYING to create a school department WITH THE SAME NAME BUT A DIFFERENT CODE.
        // Verify that a dialog box occurs with a message "There is already Department with "High School" name!".

        // On the modal window, type "High School Classes" for the name of the department and "HS-1" for the code AGAIN
        // Click on "Save" for TRYING to create a school department WITH A DIFFERENT NAME BUT THE SAME CODE.
        // Verify that a dialog box occurs with a message "There is already Department with "HS-1" code!".

        // Click on "x" to dismiss the modal window.

        // Click on edit button (or the row) of the "High School" department to edit it.

        // Edit the school department name as "High School Classes" and department code as "HSC-1" and click on "Save"

        // Verify if the department name was edited as "High School Classes" and department code was edited as "HSC-1"

        // Go to Section tab of this school department (High School Classes) and add 3 more sections (you may name them as you wish)

        // Dismiss the modal window and click on corresponding trash icon in order to delete "High School Classes"

        // Click on "Delete" for deleting the school department.

        // Verify the department is deleted. (it should not be present in the table anymore)

        // Close the browser
}
