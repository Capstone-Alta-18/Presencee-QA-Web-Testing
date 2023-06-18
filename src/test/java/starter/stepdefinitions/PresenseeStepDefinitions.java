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
}




