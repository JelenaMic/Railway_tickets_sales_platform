package lt.vcs.pom.page.ltglink;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.LtgLink.JourneysPage.*;

public class JourneysPage {

    public static void clickTravelClassOption() {
        Common.waitElementToBeVisible(spanPirmaKlase, 20);
        Common.clickOnElement(spanPirmaKlase);
    }

    public static void clickToPayment() {
        Common.clickOnElement(spanSutikti);
        Common.waitElementToBeVisible(buttonToPayment, 10);
        Common.clickOnElement(buttonToPayment);
    }

    public static void clickContinueOrdering() {
        Common.clickOnElement(spanSutikti);
        Common.waitElementToBeVisible(buttonTestiUzsakyma, 10);
        Common.clickOnElement(buttonTestiUzsakyma);
    }

    public static void clickToPaymentFromTo() {
        Common.waitElementToBeVisible(buttonToPayment, 10);
        Common.clickOnElement(buttonToPayment);
    }
}
