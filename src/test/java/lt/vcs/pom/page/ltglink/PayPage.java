package lt.vcs.pom.page.ltglink;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.LtgLink.PayPage.*;

public class PayPage {

    public static String readUrlPay() {
        Common.waitElementToBeVisible(spanRouteFromToForward, 20);
        return Common.getCurrentUrl();
    }

    public static String readRouteFromToForward() {
        Common.waitElementToBeVisible(spanRouteFromToForward, 20);
        return Common.getTextFromElement(spanRouteFromToForward);
    }

    public static String readRouteFromToBackward() {
        Common.waitElementToBeVisible(spanRouteFromToBackward, 30);
        return Common.getTextFromElement(spanRouteFromToBackward);
    }
}
