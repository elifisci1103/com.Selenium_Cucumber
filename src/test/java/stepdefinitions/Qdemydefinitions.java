package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QdemyPage;
import utilities.ConfigReader;

public class Qdemydefinitions {
    QdemyPage qdemyPage = new QdemyPage();
    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qdemyPage.ilkLoginLinki.click();
    }
    @Then("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        qdemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qdemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qdemyPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qdemyPage.emailKutusu.isEnabled());
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basariliOlarakGirisYapildiginiTestEder() {

        Assert.assertTrue(qdemyPage.basariliGirisElementi.isDisplayed());
    }

    @And("username olarak examples dan {string} girer")
    public void usernameOlarakExamplesDanGirer(String username) {
        qdemyPage.emailKutusu.sendKeys(username);
    }

    @And("password olarak examples dan {string} girer")
    public void passwordOlarakExamplesDanGirer(String password) {
        qdemyPage.passwordKutusu.sendKeys(password);
    }
}
