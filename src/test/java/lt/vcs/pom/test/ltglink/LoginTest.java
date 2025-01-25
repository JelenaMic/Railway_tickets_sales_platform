package lt.vcs.pom.test.ltglink;

import lt.vcs.pom.page.ltglink.LoginPage;
import lt.vcs.pom.page.ltglink.AccountPage;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
    }

    @Test
    public void testPositiveLoginValidUserEmailAndPassword() {
        String userEmail = "jellena.michaliova@gmail.com";
        String userPassword = "bilietaiLTG2024!";
        String expectedResultUrl = "https://bilietas.ltglink.lt/account/dashboard/tickets/future";
        String actualResultUrl;
        String expectedAccountName = "Jelena";
        String actualAccountName;

        LoginPage.enterUserEmail(userEmail);
        LoginPage.enterUserPassword(userPassword);
        LoginPage.clickOnButtonPatvirtinti();

        actualResultUrl = AccountPage.readUrlAccountPage();
        actualAccountName = AccountPage.readAccountName();

        Assert.assertTrue(actualResultUrl.contains(expectedResultUrl),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualResultUrl, expectedResultUrl));

        Assert.assertTrue(actualAccountName.contains(expectedAccountName),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualAccountName, expectedAccountName));
    }

    @Test
    public void testNegativeLoginNoUserEmail() {
        String userPassword = "bilietaiLTG2024!";
        String expectedResulErrorMessage = "Neteisingi prisijungimo duomenys";
        String actualResultErrorMessage;

        LoginPage.enterUserPassword(userPassword);
        LoginPage.clickOnButtonPatvirtinti();

        actualResultErrorMessage = LoginPage.readErrorMessageNeteisingiDuomenys();

        Assert.assertTrue(actualResultErrorMessage.contains(expectedResulErrorMessage),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualResultErrorMessage, expectedResulErrorMessage));
    }

    @Test
    public void testNegativeLoginNoUserPassword() {
        String userEmail = "jellena.michaliova@gmail.com";
        String expectedResulErrorMessage = "Informacija privalomame laukelyje pateikta nepilna arba klaidingai užpildyta, prašome peržiūrėti ir pakoreguoti.";
        String actualResultErrorMessage;
        String expectedErrorMessage = "Įveskite teisingą slaptažodį.";
        String actualErrorMessage;

        LoginPage.enterUserEmail(userEmail);
        LoginPage.clickOnButtonPatvirtinti();

        actualResultErrorMessage = LoginPage.readErrorMessageInformacijaPrivaloma();
        actualErrorMessage = LoginPage.readErrorMessageIveskiteSlaptazodi();

        Assert.assertTrue(actualResultErrorMessage.contains(expectedResulErrorMessage),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualResultErrorMessage, expectedResulErrorMessage));

        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualErrorMessage, expectedErrorMessage));
    }
}
