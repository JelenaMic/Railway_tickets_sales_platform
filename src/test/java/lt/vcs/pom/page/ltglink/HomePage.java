package lt.vcs.pom.page.ltglink;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.LtgLink.HomePage.*;

public class HomePage {

    public static void ManoPaskyra() {
        Common.clickOnElement(buttonManoPaskyra);
    }

    public static String readHomePageUrl() {
        Common.waitElementToBeVisible(buttonManoPaskyra, 10);
        return Common.getCurrentUrl();
    }

    public static String readLabelManoPaskyra() {
        Common.waitElementToBeVisible(buttonManoPaskyra, 10);
        return Common.getTextFromElement(buttonManoPaskyra);
    }

    public static void selectTripFrom() {
        Common.clickOnElement(divClassFrom);
        Common.clickOnElement(ulStopSearchFrom);
    }

    public static void selectTripTo() {
        Common.clickOnElement(divClassTo);
        Common.waitElementToBeVisible(ulStopSearchTo, 5);
        Common.clickOnElement(ulStopSearchTo);
    }

    public static void selectTripData() {
        Common.clickOnElement(spanIsvykimoData);
        Common.clickOnElement(divAriaLabelData);
    }

    public static void selectTripDataBackward() {
        Common.waitElementToBeVisible(spanGrizimoData, 20);
        Common.clickOnElement(spanGrizimoData);
        Common.waitElementToBeVisible(divAriaLabelDataBackward, 30);
        Common.clickOnElement(divAriaLabelDataBackward);
    }

    public static void selectPassengerType() {
        Common.clickOnElement(spanKeleiviai);
        Common.clickOnElement(buttonSumazinti);
        Common.clickOnElement(buttonPadidinti);
    }

    public static void clickToSearch() {
        Common.clickOnElement(spanIeskoti);
    }
}
