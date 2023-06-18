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
}

