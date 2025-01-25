package lt.vcs.pom.page.ltglink;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.LtgLink.AccountPage.*;

public class AccountPage {

    public static String readUrlAccountPage() {
        Common.waitElementToBeVisible(spanUserName, 20);
        return Common.getCurrentUrl();
    }

    public static String readAccountName() {
        Common.waitElementToBeVisible(spanUserName, 10);
        return Common.getTextFromElement(spanUserName);
    }

    public static void clickAccountDropdown() {
        Common.waitElementToBeVisible(spanUserName, 20);
        Common.clickOnElement(spanUserName);
    }

    public static void clickLogoutLink() {
        Common.clickOnElement(aClassLink);
    }

    public static void clickBuyTickets() {
        Common.waitElementToBeVisible(divLabelPirktiBilietus, 30);
        Common.clickOnElement(divLabelPirktiBilietus);
    }
}
