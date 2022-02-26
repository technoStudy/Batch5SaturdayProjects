package project15.groupSolutions.group1.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchoolListPage extends Base {

    public SchoolListPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[text()='High School889900']")
    private WebElement highSchoolInList;

    @FindBy(xpath = "//td[text()='Junior classes']")
    private WebElement juniorClassesInList;

    @FindBy(xpath = "//td[text()='Senior Classes']")
    private WebElement seniorClassesInList;

    @FindBy(xpath = "//td[text()='High School Classes8899002']")
    private WebElement afterEditHighSchoolList;

    @FindBy(xpath = "//td[text()=' HSC-18899002 ']")
    private WebElement afterEditSchoolCode;

    public String getTextOfHighSchool(){
        return getTextOf(highSchoolInList);
    }
    public void clickHighScool(){
        clickOnElement(highSchoolInList);
    }

    public String getTextOfJuniorClasses(){
        return getTextOf(juniorClassesInList);
    }
    public String getTextOfSeniorClasses(){
        return getTextOf(seniorClassesInList);
    }
    public String getTextOfEditHighSchool(){
        return getTextOf(afterEditHighSchoolList);
    }
    public String getTextOfEditSchoolCode(){
        return getTextOf(afterEditSchoolCode);
    }
}

