package project15.groupSolutions.group1.Test;

public enum ProjectConstants {
    SIGN_IN_URL("https://test.mersys.io"),
    SIGN_IN_Username("i.muratov"),
    SIGN_IN_PASSWORD("QWEasd@1901");

    private final String text;

    ProjectConstants(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}
