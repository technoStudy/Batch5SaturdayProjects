package project14.groupSolutions.group1.tests;

public enum ProjectConstants {
    SIGN_IN_URL("http://automationpractice.com/"),
    SIGN_IN_EMAIL("emailfake@gmail.com"),
    SIGN_IN_PASSWORD("PASSWORD123");

    private final String text;

    ProjectConstants(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
