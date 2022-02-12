package project13.solution.tests;

public enum ProjectConstants {
    SIGN_IN_URL("http://a.testaddressbook.com/sign_in"),
    SIGN_IN_EMAIL("project14@pp.com"),
    SIGN_IN_PASSWORD("12345");

    private final String text;

    ProjectConstants(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
