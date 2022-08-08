package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US003_RegisterPage {

    public US003_RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement userIcon;


    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement RegisterNewPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement registerConfirmPasswordBox;

    @FindBy(xpath = "//*[@style='background-color: rgb(255, 0, 0);']")
    public static WebElement passwordStrenght1;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[2]")
    public static WebElement passwordStrenght2;

    @FindBy(xpath = "(//*[@style='background-color: rgb(255, 153, 0);'])[2]")
    public static WebElement passwordStrenght3;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[3]")
    public static WebElement passwordStrength3;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[4]")
    public static WebElement passwordStrength4;

    @FindBy(xpath = "(//*[@style='background-color: rgb(153, 255, 0);'])[5]")
    public static WebElement passwordStrength5;







}


