package starter.helpers;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://presencee.netlify.app/")
class PresenseePage extends PageObject {
    public static Target Click_Home = Target.the("Home Button").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[1]");
    public static Target Click_Feature = Target.the("Feature Button").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[2]");
    public static Target Click_Feature_Presensi_Sidik_Jari = Target.the("Presensi sidik jari Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[1]");
    public static Target Click_Feature_Jadwal = Target.the("Jadwal Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[2]");
    public static Target Click_Feature_Histori_Presensi = Target.the("Histori Presensi Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[3]");
    public static Target Click_Feature_Presensi_Kamera = Target.the("Presensi Kamera Button").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div[4]");

}
