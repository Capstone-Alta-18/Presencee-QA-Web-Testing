package starter.helpers;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DoAnAction {
    public static Performable clickHome() {
        return Task.where("{0} click home button",
                Click.on(PresenseePage.Click_Home)
        );
    }
    public static Performable clickFeature() {
        return Task.where("{0} click feature button",
                Click.on(PresenseePage.Click_Feature)
        );
    }
    public static Performable clickFeaturePresensiSidikJari() {
        return Task.where("{0} click feature presensi sidik jari",
                Click.on(PresenseePage.Click_Feature_Presensi_Sidik_Jari)
        );
    }
    public static Performable clickFeatureJadwal() {
        return Task.where("{0} click feature jadwal",
                Click.on(PresenseePage.Click_Feature_Jadwal)
        );
    }
    public static Performable clickFeatureHistoriPresensi() {
        return Task.where("{0} click feature histori presensi",
                Click.on(PresenseePage.Click_Feature_Histori_Presensi)
        );
    }
    public static Performable clickFeaturePresensiKamera() {
        return Task.where("{0} click feature presensi kamera",
                Click.on(PresenseePage.Click_Feature_Presensi_Kamera)
        );
    }
    public static Performable onFAQPage() {
        return Task.where("{0} click faq page",
                Click.on(PresenseePage.On_Faq_page)
        );
    }
    public static Performable onFAQPage1() {
        return Task.where("{0} click faq page 1",
                Click.on(PresenseePage.On_Faq_page_1)
        );
    }
    public static Performable onFAQPage2() {
        return Task.where("{0} click faq page 2",
                Click.on(PresenseePage.On_Faq_page_2)
        );
    }
    public static Performable onFAQPage3() {
        return Task.where("{0} click faq page 3",
                Click.on(PresenseePage.On_Faq_page_3)
        );
    }
    public static Performable onFAQPage4() {
        return Task.where("{0} click faq page 4",
                Click.on(PresenseePage.On_Faq_page_4)
        );
    }
    public static Performable onHelpPage() {
        return Task.where("{0} click help page",
                Click.on(PresenseePage.On_Help_Page)
        );
    }
    public static Performable clickContactUs() {
        return Task.where("{0} click contact us",
                Click.on(PresenseePage.Click_Contact_Us)
        );
    }
    public static Performable onAboutUsPage() {
        return Task.where("{0} click about us",
                Click.on(PresenseePage.Click_About_Us)
        );
    }
    public static Performable clickPortal() {
        return Task.where("{0} click portal",
                Click.on(PresenseePage.Click_Portal)
        );
    }
    public static Performable clickPortalAdmin() {
        return Task.where("{0} click portal admin",
                Click.on(PresenseePage.Click_Portal_Admin)
        );
    }
    public static Performable onPortalAdmin() {
        return Task.where("{0} on portal admin page",
                Click.on(PresenseePage.on_Portal_Admin)
        );
    }
    public static Performable clickPortalDosen() {
        return Task.where("{0} click portal dosen",
                Click.on(PresenseePage.Click_Portal_Dosen)
        );
    }
    public static Performable onPortalDosen() {
        return Task.where("{0} on portal dosen page",
                Click.on(PresenseePage.on_Portal_Dosen)
        );
    }
    public static Performable fillEmailFieldWithValue(String email) {
        return Task.where("{0} fill Email field with " + email,
                Enter.theValue(email).into(PresenseePage.Email_Field)
                                .then(WaitUntil.the(PresenseePage.Email_Field, isCurrentlyVisible())
                                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }
    public static Performable fillPasswordFieldWithValue(String password) {
        return Task.where("{0} fill Email field with " + password,
                Enter.theValue(password).into(PresenseePage.Password_Field)
                        .then(WaitUntil.the(PresenseePage.Password_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }
    public static Performable clickEnter() {
        return Task.where("{0} click enter",
                Click.on(PresenseePage.Click_Enter)
        );
    }
    public static Performable onAdminPageDashboard() {
        return Task.where("{0} on admin page dashboard",
                Click.on(PresenseePage.on_Admin_Page_Dashboard)
        );
    }
    public static Performable WantToVisibleTheirPassword() {
        return Task.where("{0} want to visible their password",
                Click.on(PresenseePage.Visible_Password)
        );
    }
    public static Performable fillingEmailFieldWithValue(String EMAIL) {
        return Task.where("{0} fill Email field with " + EMAIL,
                Enter.theValue(EMAIL).into(PresenseePage.Filling_Email_Field)
                        .then(WaitUntil.the(PresenseePage.Filling_Email_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }
    public static Performable fillingPasswordFieldWithValue(String PASSWORD) {
        return Task.where("{0} fill Email field with " + PASSWORD,
                Enter.theValue(PASSWORD).into(PresenseePage.Filling_Password_Field)
                        .then(WaitUntil.the(PresenseePage.Filling_Password_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }
    public static Performable clickLogin() {
        return Task.where("{0} click login button",
                Click.on(PresenseePage.Click_Login)
        );
    }
    public static Performable onDosenPageDashboard() {
        return Task.where("{0} on dosen page dashboard",
                Click.on(PresenseePage.on_Dosen_Page_Dashboard)
        );
    }
    public static Performable onJadwalKuliah() {
        return Task.where("{0} on jadwal kuliah page",
                Click.on(PresenseePage.on_Jadwal_Kuliah)
        );
    }
    public static Performable clickOnTambahkan() {
        return Task.where("{0} on tambahkan page",
                Click.on(PresenseePage.Click_On_Tambahkan)
        );
    }
    public static Performable clickOnDataMahasiswa() {
        return Task.where("{0} on Data Mahasiswa page",
                Click.on(PresenseePage.Click_On_Data_Mahasiswa)
        );
    }
    public static Performable chooseOnDataMahasiswa() {
        return Task.where("{0} choose Data Mahasiswa",
                Click.on(PresenseePage.Choose_On_Data_Mahasiswa)
        );
    }
    public static Performable clickOnRightSign() {
        return Task.where("{0} on first list of data mahasiswa",
                Click.on(PresenseePage.Click_On_Right_Sign)
        );
    }
    public static Performable clickOnNextSign() {
        return Task.where("{0} on second list of data mahasiswa",
                Click.on(PresenseePage.Click_On_Next_Sign)
        );
    }
    public static Performable clickOnThirdSign() {
        return Task.where("{0} on third list of data mahasiswa",
                Click.on(PresenseePage.Click_On_Third_Sign)
        );
    }
    public static Performable clickOnLastSign() {
        return Task.where("{0} on last list of data mahasiswa",
                Click.on(PresenseePage.Click_On_Last_Sign)
        );
    }
    public static Performable searchNamaMahasiswa() {
        return Task.where("{0} on search column of mahasiswa",
                Click.on(PresenseePage.Search_Nama_Mahasiswa)
        );
    }
    public static Performable fillingNamaMahasiswaFieldWithValue(String Nama) {
        return Task.where("{0} fill Nama Mahasiswa field with " + Nama,
                Enter.theValue(Nama).into(PresenseePage.Filling_Nama_Mahasiswa_Field)
                        .then(WaitUntil.the(PresenseePage.Filling_Nama_Mahasiswa_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }
    public static Performable clickOnDetailButton() {
        return Task.where("{0} click detail button",
                Click.on(PresenseePage.Click_Detail_Button)
        );
    }
    public static Performable clickOnKembaliButton() {
        return Task.where("{0} click Kembali button",
                Click.on(PresenseePage.Kembali_Button)
        );
    }
    public static Performable chooseOnDataDosen() {
        return Task.where("{0} choose data dosen",
                Click.on(PresenseePage.Choose_On_Data_Dosen)
        );
    }
    public static Performable clickonFirstSign() {
        return Task.where("{0} click next button",
                Click.on(PresenseePage.Choose_On_First_Sign)
        );
    }
    public static Performable clickonSecondSign() {
        return Task.where("{0} click next button",
                Click.on(PresenseePage.Choose_On_Second_Sign)
        );
    }
    public static Performable searchNamaDosen() {
        return Task.where("{0} on search column of dosen",
                Click.on(PresenseePage.Search_Nama_Dosen)
        );
    }
    public static Performable fillingNamaDosenFieldWithValue(String Nama) {
        return Task.where("{0} fill Nama Mahasiswa field with " + Nama,
                Enter.theValue(Nama).into(PresenseePage.Filling_Nama_Dosen_Field)
                        .then(WaitUntil.the(PresenseePage.Filling_Nama_Dosen_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }
    public static Performable clickOnDetailButtonFromDosenList() {
        return Task.where("{0} click detail button from dosen list",
                Click.on(PresenseePage.Click_Detail_Button_From_Dosen_List)
        );
    }
    public static Performable seeDetailOfDosen() {
        return Task.where("{0} see detail of dosen",
                Click.on(PresenseePage.See_Detail_Of_Dosen)
        );
    }
    public static Performable clickOnBackButton() {
        return Task.where("{0} click back button",
                Click.on(PresenseePage.Back_Button)
        );
    }
    public static Performable clickOnRiwayatPresensi() {
        return Task.where("{0} click riwayat presensi",
                Click.on(PresenseePage.Riwayat_Presensi)
        );
    }
    public static Performable clickOnLogout() {
        return Task.where("{0} click log out",
                Click.on(PresenseePage.Click_Log_Out)
        );
    }
    public static Performable clickJadwalKuliah() {
        return Task.where("{0} click jadwal kuliah",
                Click.on(PresenseePage.Click_Jadwal_Kuliah)
        );
    }
    public static Performable clickLogoutFromDosen() {
        return Task.where("{0} click jadwal kuliah",
                Click.on(PresenseePage.Click_Logout_From_Dosen_Page)
        );
    }
    public static Performable onDataMahasiswaAlexander() {
        return Task.where("{0} on alexander dashboard",
                Click.on(PresenseePage.On_Data_Mahasiswa_Alexander)
        );
    }
    public static Performable changeTahunMasuk() {
        return Task.where("{0} on tahun masuk",
                Click.on(PresenseePage.Change_Tahun_Masuk)
        );
    }
    public static Performable clickOnNewEnteringYear() {
        return Task.where("{0} click on new entering year",
                Click.on(PresenseePage.Click_On_New_Entering_Year)
        );
    }
    public static Performable changeFakultas() {
        return Task.where("{0} change fakultas",
                Click.on(PresenseePage.Change_Fakultas)
        );
    }
    public static Performable clickOnFakultasEkonomi() {
        return Task.where("{0} click on fakultas ekonomi",
                Click.on(PresenseePage.Click_On_Fakultas_Ekonomi)
        );
    }
    public static Performable changeJurusan() {
        return Task.where("{0} change jurusan",
                Click.on(PresenseePage.Change_Jurusan)
        );
    }
    public static Performable clickOnJurusanAstronomi() {
        return Task.where("{0} click on jurusan astronomi",
                Click.on(PresenseePage.Click_On_Jurusan_Astronomi)
        );
    }
    public static Performable clickOnUpdateButton() {
        return Task.where("{0} click on update button",
                Click.on(PresenseePage.Click_On_Update_Button)
        );
    }
    public static Performable clickOnBackButtonToListOfMahasiswa() {
        return Task.where("{0} click on back button to list of mahasiswa",
                Click.on(PresenseePage.Click_On_Back_Button_To_List_Of_Mahasiswa)
        );
    }
}

