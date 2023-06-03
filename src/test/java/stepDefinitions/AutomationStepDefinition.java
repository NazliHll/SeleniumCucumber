package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinition {
    AutomationPage automationPage=new AutomationPage();
    Faker faker=new Faker();
    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        automationPage.signinButton.click();
    }

    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());

    }

    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        automationPage.createAccountButton.click();
    }

    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(automationPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("30")
                .sendKeys(Keys.TAB)
                .sendKeys("June")
                .sendKeys(Keys.TAB)
                .sendKeys("1998")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys("ALSK").perform();


    }

    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {
        automationPage.registerButton.click();
    }

    @Then("hesap olustugunu dogrular")
    public void hesapOlustugunuDogrular() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }
}
