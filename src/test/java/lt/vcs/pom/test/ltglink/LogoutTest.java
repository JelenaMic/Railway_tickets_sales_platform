package lt.vcs.pom.test.ltglink;

import lt.vcs.pom.page.ltglink.HomePage;
import lt.vcs.pom.page.ltglink.LoginPage;
import lt.vcs.pom.page.ltglink.AccountPage;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String userEmail = "jellena.michaliova@gmail.com";
        String userPassword = "bilietaiLTG2024!";
        LoginPage.login(userEmail, userPassword);
    }

    @Test
    public void testPositiveLogout() {
        String expectedResultUrl = "https://bilietas.ltglink.lt/";
        String actualResultUrl;
        String expectedLabelManoPaskyra = "Mano paskyra";
        String actualLabelManoPaskyra;

        AccountPage.clickAccountDropdown();
        AccountPage.clickLogoutLink();

        actualResultUrl = HomePage.readHomePageUrl();
        actualLabelManoPaskyra = HomePage.readLabelManoPaskyra();

        Assert.assertTrue(actualResultUrl.contains(expectedResultUrl),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualResultUrl, expectedResultUrl));

        Assert.assertTrue(actualLabelManoPaskyra.contains(expectedLabelManoPaskyra),
                "\nActual: %s\nExpected contains: %s"
                        .formatted(actualLabelManoPaskyra, expectedLabelManoPaskyra));
    }
}
