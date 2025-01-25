package lt.vcs.pom.page;

import org.openqa.selenium.By;

public class Locator {
    public static class LtgLink {
        public static class HomePage {
            public static final By buttonManoPaskyra = By.xpath("//button[@class='shared-icon-button ']");
            public static final By divClassFrom = By.xpath("(//div[@class='sc-141eqry-3 hkDtMt'])[1]");
            public static final By ulStopSearchFrom = By.xpath
                    ("//ul[@id='stop-search-select-list-ticket-origin']//li[.//span[text()='Klaipėda']]");
            public static final By divClassTo = By.xpath("(//div[@class='sc-141eqry-3 hkDtMt'])[2]");
            public static final By ulStopSearchTo = By.xpath
                    ("//ul[@id='stop-search-select-list-ticket-destination']//li[.//span[text()='Vilnius']]");
            public static final By spanIsvykimoData = By.xpath
                    ("(//span[@class='sc-4eytme-3 dyKPpp' and contains(text(),'Išvykimo data')])[1]");
            public static final By divAriaLabelData = By.xpath
                    ("//div[@aria-label='Ant 2024 m. gruodžio 31 d.']");
            public static final By spanGrizimoData = By.xpath
                    ("(//span[@class='sc-4eytme-3 dyKPpp' and contains(text(),'Grįžimo data')])[1]");
            public static final By divAriaLabelDataBackward = By.xpath
                    ("//div[@aria-label='Pen 2025 m. sausio 3 d.']");
            public static final By spanKeleiviai = By.xpath("(//span)[10]");
            public static final By buttonSumazinti = By.xpath("(//button[@aria-label='Sumažinti'])[1]");
            public static final By buttonPadidinti = By.xpath("(//button[@aria-label='Padidinti'])[1]");
            public static final By spanIeskoti = By.xpath("//span[@class='sc-2p7noq-1 jmwamq']");
        }

        public static class AccountPage {
            public static final By spanUserName = By.xpath
                    ("//span[@class='username' and contains(text(),'Jelena')]");
            public static final By aClassLink = By.xpath("(//a[@class='_link'])[2]");
            public static final By divLabelPirktiBilietus = By.xpath
                    ("//div[@class='label' and contains(text(), 'Pirkti bilietus')]");
        }

        public static class JourneysPage {
            public static final By spanPirmaKlase = By.xpath
                    ("(//div[@class='name ' and contains(text(),'1 klasė')])[1]");
            public static final By spanSutikti = By.xpath
                    ("//span[@class='btn-children' and contains(text(),'Sutinku su visais')]");
            public static final By buttonToPayment = By.xpath("//button[@class='skip-to-payment btn']");
            public static final By buttonTestiUzsakyma = By.xpath("//button[@class='choose-classes btn']");
        }

        public static class LoginPage {
            public static final By inputUserName = By.xpath("//input[@id='username-input']");
            public static final By inputPassword = By.xpath("//input[@id='password-input']");
            public static final By buttonPatvirtinti = By.xpath("//button[@class='btn btn-primary   ']");
            public static final By classContentError = By.xpath
                    ("//div[@class='_content' and contains(text(),'Neteisingi prisijungimo duomenys')]");
            public static final By classContentErrorMessage = By.xpath
                    ("//div[@class='_content' and contains(text()," +
                            "'Informacija privalomame laukelyje pateikta nepilna arba klaidingai užpildyta," +
                            " prašome peržiūrėti ir pakoreguoti.')]");
            public static final By classErrorText = By.xpath
                    ("//div[@id='password-error' and contains(text(), 'Įveskite teisingą slaptažodį.')]");
        }

        public static class PayPage {
            public static final By spanRouteFromToForward = By.xpath
                    ("//span[@class='route' and contains(text(),'Klaipėda - Vilnius')]");
            public static final By spanRouteFromToBackward = By.xpath
                    ("//span[@class='route' and contains(text(),'Vilnius - Klaipėda')]");
        }
    }
}
