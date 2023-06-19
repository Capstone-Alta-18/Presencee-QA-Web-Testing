package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;


public class PresenseeStepDefinitions {
    Dotenv dotenv = Dotenv.load();

    @Given("{actor} is on Presensee landing page")
    public void userIsOnPresenseeLandingPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePresenseeLandingPage());
    }
    @Then("{actor} choose home page")
    public void userChooseHomePage(Actor actor) {
        actor.attemptsTo(DoAnAction.clickHome());
    }
    @Then("{actor} choose feature page")
    public void userChooseFeaturePage(Actor actor) {
        actor.attemptsTo(DoAnAction.clickFeature());
    }
    @And("{actor} click on feature presensi sidik jari")
    public void userClickOnFeaturePresensiSidikJari(Actor actor) {
        actor.attemptsTo(DoAnAction.clickFeaturePresensiSidikJari());
    }
    @And("{actor} click on feature jadwal")
    public void userClickOnFeatureJadwal(Actor actor) {
        actor.attemptsTo(DoAnAction.clickFeatureJadwal());
    }
    @And("{actor} click on feature histori presensi")
    public void userClickOnFeatureHistoriPresensi(Actor actor) {
        actor.attemptsTo(DoAnAction.clickFeatureHistoriPresensi());
    }
    @And("{actor} click on feature presensi kamera")
    public void userClickOnFeaturePresensiKamera(Actor actor) {
        actor.attemptsTo(DoAnAction.clickFeaturePresensiKamera());
    }
    @Then("{actor} on faq page")
    public void userChooseOnFaqPage(Actor actor) {
        actor.attemptsTo(DoAnAction.onFAQPage());
    }
    @And("{actor} click on faq apa itu absensi online ?")
    public void userClickOnFAQApaItuAbsensiOnline(Actor actor) {
        actor.attemptsTo(DoAnAction.onFAQPage1());
    }
    @And("{actor} click on faq kenapa harus presensee ?")
    public void userClickOnFAQKenapaHarusPresensee(Actor actor) {
        actor.attemptsTo(DoAnAction.onFAQPage2());
    }
    @And("{actor} click on faq bagaimana cara presensee memvalidasi kehadiran ?")
    public void userClickOnFAQBagaimanaCaraPresenseeMemvalidasiKehadiran(Actor actor) {
        actor.attemptsTo(DoAnAction.onFAQPage3());
    }
    @And("{actor} click on faq bagaimana jika universitas saya ingin bekerja sama dengan presensee ?")
    public void userClickOnFAQBagaimanaJikaUniversitasSayaInginBekerjaSamaDenganPresensee(Actor actor) {
        actor.attemptsTo(DoAnAction.onFAQPage4());
    }
    @Then("{actor} on help page")
    public void userOnHelpPage(Actor actor) {
        actor.attemptsTo(DoAnAction.onHelpPage());
    }
    @And("{actor} click on contact us")
    public void userClickOnContactUs(Actor actor) {
        actor.attemptsTo(DoAnAction.clickContactUs());
    }
    @Then("{actor} on about us page")
    public void userOnAboutUsPage(Actor actor) {
        actor.attemptsTo(DoAnAction.onAboutUsPage());
    }

    @And("{actor} click on portal")
    public void userClickOnPortal(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPortal());
    }

    @Then("{actor} click on portal admin")
    public void userClickOnPortalAdmin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPortalAdmin());
    }

    @Then("{actor} is on portal admin page")
    public void userIsOnPortalAdminPage(Actor actor) {
        actor.attemptsTo(DoAnAction.onPortalAdmin());
    }

    @Then("{actor} click on portal dosen")
    public void userClickOnPortalDosen(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPortalDosen());
    }

    @Then("{actor} is on portal dosen page")
    public void userIsOnPortalDosenPage(Actor actor) {
        actor.attemptsTo(DoAnAction.onPortalDosen());
    }

    @Then("{actor} input valid Email {string}")
    public void userInputValidEmail(Actor actor, String Email) {
        actor.attemptsTo(DoAnAction.fillEmailFieldWithValue(dotenv.get(Email)));
    }

    @Then("{actor} input valid Password {string}")
    public void userInputValidPassword(Actor actor, String Password) {
        actor.attemptsTo(DoAnAction.fillPasswordFieldWithValue(dotenv.get(Password)));
    }

    @Then("{actor} click enter")
    public void userClickEnter(Actor actor) {
        actor.attemptsTo(DoAnAction.clickEnter());
    }

    @Then("{actor} directed to admin page dashboard")
    public void userDirectedToAdminPageDashboard(Actor actor) {
        actor.attemptsTo(DoAnAction.onAdminPageDashboard());
    }

    @Then("{actor} want to visible their password")
    public void userWantToVisibleTheirPassword(Actor actor) {
        actor.attemptsTo(DoAnAction.WantToVisibleTheirPassword());
    }

    @Then("{actor} input correct Email {string}")
    public void userInputCorrectEmail(Actor actor, String Email) {
        actor.attemptsTo(DoAnAction.fillingEmailFieldWithValue(dotenv.get(Email)));
    }

    @Then("{actor} input correct Password {string}")
    public void userInputCorrectPassword(Actor actor, String Password) {
        actor.attemptsTo(DoAnAction.fillingPasswordFieldWithValue(dotenv.get(Password)));
    }

    @Then("{actor} click login")
    public void userClickLogin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLogin());
    }

    @Then("{actor} directed to dosen page dashboard")
    public void userDirectedToDosenPageDashboard(Actor actor) {
        actor.attemptsTo(DoAnAction.onDosenPageDashboard());
    }
}




