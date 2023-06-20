package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

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
    public void userInputCorrectEmail(Actor actor, String EMAIL) {
        actor.attemptsTo(DoAnAction.fillingEmailFieldWithValue(dotenv.get(EMAIL)));
    }

    @Then("{actor} input correct Password {string}")
    public void userInputCorrectPassword(Actor actor, String PASSWORD) {
        actor.attemptsTo(DoAnAction.fillingPasswordFieldWithValue(dotenv.get(PASSWORD)));
    }

    @Then("{actor} click login")
    public void userClickLogin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLogin());
    }

    @Then("{actor} directed to dosen page dashboard")
    public void userDirectedToDosenPageDashboard(Actor actor) {
        actor.attemptsTo(DoAnAction.onDosenPageDashboard());
    }

    @Then("{actor} click on Jadwal Kuliah")
    public void userClickOnJadwalKuliah(Actor actor) {
        actor.attemptsTo(DoAnAction.onJadwalKuliah());
    }

    @Then("{actor} click on Tambahkan")
    public void userClickOnTambahkan(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnTambahkan());
    }

    @Then("{actor} click on Data mahasiswa")
    public void userClickOnDataMahasiswa(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnDataMahasiswa());
    }

    @Then("{actor} click on Manage Data Data Mahasiswa")
    public void userClickOnManageDataDataMahasiswa(Actor actor) {
        actor.attemptsTo(DoAnAction.chooseOnDataMahasiswa());
    }

    @Then("{actor} see first data mahasiswa list")
    public void userSeeFirstDataMahasiswaList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnRightSign());
    }

    @Then("{actor} see second data mahasiswa list")
    public void userSeeSecondDataMahasiswaList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnNextSign());
    }

    @Then("{actor} see third data mahasiswa list")
    public void userSeeThirdDataMahasiswaList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnThirdSign());
    }

    @Then("{actor} see forth data mahasiswa list")
    public void userSeeForthDataMahasiswaList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnLastSign());
    }

    @Then("{actor} search mahasiswa in cari nama mahasiswa")
    public void userSearchMahasiswaInCariNamaMahasiswa(Actor actor) {
        actor.attemptsTo(DoAnAction.searchNamaMahasiswa());
    }

    @Then("{actor} input mahasiswa name {string}")
    public void userInputMahasiswaNameInCariNamaMahasiswa(Actor actor, String Nama) {
        actor.attemptsTo(DoAnAction.fillingNamaMahasiswaFieldWithValue(dotenv.get(Nama)));
    }

    @Then("{actor} click on Detail button")
    public void userClickOnDetailButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnDetailButton());
    }

    @Then("{actor} click on Kembali button")
    public void userClickOnKembaliButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnKembaliButton());
    }

    @Then("{actor} click on Manage Data Data Dosen")
    public void userClickOnManageDataDataDosen(Actor actor) {
        actor.attemptsTo(DoAnAction.chooseOnDataDosen());
    }

    @Then("{actor} see first data dosen list")
    public void userSeeFirstDataDosenList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickonFirstSign());
    }

    @Then("{actor} see last data dosen list")
    public void userSeeLastDataDosenList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickonSecondSign());
    }

    @Then("{actor} search dosen in cari nama Dosen")
    public void userSearchDosenInCariNamaDosen(Actor actor) {
        actor.attemptsTo(DoAnAction.searchNamaDosen());
    }

    @Then("{actor} input dosen name {string}")
    public void userInputDosenNameInCariNamaDosen(Actor actor, String Nama) {
        actor.attemptsTo(DoAnAction.fillingNamaDosenFieldWithValue(dotenv.get(Nama)));
    }

    @Then("{actor} click on detail button from dosen list")
    public void userClickOnDetailButtonFromDosenList(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnDetailButtonFromDosenList());
    }

    @Then("{actor} see detail of dosen")
    public void userSeeDetailOfDosen(Actor actor) {
        actor.attemptsTo(DoAnAction.seeDetailOfDosen());
    }

    @Then("{actor} click on Back button")
    public void userClickOnReturnButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnBackButton());
    }
    @Then("{actor} click on riwayat presensi")
    public void userClickOnRiwayatPresensi(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnRiwayatPresensi());
    }

    @Then("{actor} click logout")
    public void userClickLogout(Actor actor) {
        actor.attemptsTo(DoAnAction.clickOnLogout());
    }

    @Then("{actor} click on jadwal kuliah for lecturing")
    public void userClickOnJadwalKuliahForLecturing(Actor actor) {
        actor.attemptsTo(DoAnAction.clickJadwalKuliah());
    }

    @Then("{actor} click logout from dosen page dashboard")
    public void userClickOnLogoutFromDosenPageDashboard(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLogoutFromDosen());
    }
}




