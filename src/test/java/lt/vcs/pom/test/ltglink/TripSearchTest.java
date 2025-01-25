package lt.vcs.pom.test.ltglink;

import lt.vcs.pom.page.ltglink.*;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TripSearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String userEmail = "jellena.michaliova@gmail.com";
        String userPassword = "bilietaiLTG2024!";
        LoginPage.login(userEmail, userPassword);
    }

    @Test
    public void testPositiveTripSearchOneWay() {
        String expectedResultUrl = "https://bilietas.ltglink.lt/pay";
        String actualResultUrl;
        String expectedRouteForward = "Klaipėda - Vilnius";
        String actualRouteForward;

        AccountPage.clickBuyTickets();
        HomePage.selectTripFrom();
        HomePage.selectTripTo();
        HomePage.selectTripData();
        HomePage.selectPassengerType();
        HomePage.clickToSearch();
        JourneysPage.clickTravelClassOption();
        JourneysPage.clickToPayment();

        actualResultUrl = PayPage.readUrlPay();
        actualRouteForward = PayPage.readRouteFromToForward();

        Assert.assertTrue(actualResultUrl.contains(expectedResultUrl),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualResultUrl, expectedResultUrl));

        Assert.assertTrue(actualRouteForward.contains(expectedRouteForward),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualRouteForward, expectedRouteForward));
    }

    @Test
    public void testPositiveTripSearchTwoWays() {
        String expectedResultUrl = "https://bilietas.ltglink.lt/pay";
        String actualResultUrl;
        String expectedRouteForward = "Klaipėda - Vilnius";
        String actualRouteForward;
        String expectedRouteBackward = "Vilnius - Klaipėda";
        String actualRouteBackward;

        AccountPage.clickBuyTickets();
        HomePage.selectTripFrom();
        HomePage.selectTripTo();
        HomePage.selectTripData();
        HomePage.selectTripDataBackward();
        HomePage.selectPassengerType();
        HomePage.clickToSearch();
        JourneysPage.clickTravelClassOption();
        JourneysPage.clickContinueOrdering();
        JourneysPage.clickTravelClassOption();
        JourneysPage.clickToPaymentFromTo();

        actualResultUrl = PayPage.readUrlPay();
        actualRouteForward = PayPage.readRouteFromToForward();
        actualRouteBackward = PayPage.readRouteFromToBackward();

        Assert.assertTrue(actualResultUrl.contains(expectedResultUrl),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualResultUrl, expectedResultUrl));

        Assert.assertTrue(actualRouteForward.contains(expectedRouteForward),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualRouteForward, expectedRouteForward));

        Assert.assertTrue(actualRouteBackward.contains(expectedRouteBackward),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualRouteBackward, expectedRouteBackward));
    }
}
