package lt.vcs.pom.page.ltglink;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.LtgLink.LoginPage.*;

public class LoginPage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://ltglink.lt/");
        HomePage.ManoPaskyra();
    }

    public static void enterUserEmail(String email) {
        Common.sendKeysToElement(inputUserName, email);
    }

    public static void enterUserPassword(String password) {
        Common.sendKeysToElement(inputPassword, password);
    }

    public static void clickOnButtonPatvirtinti() {
        Common.clickOnElement(buttonPatvirtinti);
    }

    public static String readErrorMessageNeteisingiDuomenys() {
        Common.waitElementToBeVisible(classContentError, 10);
        return Common.getTextFromElement(classContentError);
    }

    public static String readErrorMessageInformacijaPrivaloma() {
        Common.waitElementToBeVisible(classContentErrorMessage, 10);
        return Common.getTextFromElement(classContentErrorMessage);
    }

    public static String readErrorMessageIveskiteSlaptazodi() {
        return Common.getTextFromElement(classErrorText);
    }

    public static void login(String userEmail, String userPassword) {
        open();
        enterUserEmail(userEmail);
        enterUserPassword(userPassword);
        clickOnButtonPatvirtinti();
    }
}
