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
}

