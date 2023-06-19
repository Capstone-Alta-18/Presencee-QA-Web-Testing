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
    public static Target On_Faq_page = Target.the("F.A.Q Page").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]");
    public static Target On_Faq_page_1 = Target.the("F.A.Q Page 1").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[1]");
    public static Target On_Faq_page_2 = Target.the("F.A.Q Page 2").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[2]");
    public static Target On_Faq_page_3 = Target.the("F.A.Q Page 3").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[3]");
    public static Target On_Faq_page_4 = Target.the("F.A.Q Page 4").locatedBy("//*[@id=\"root\"]/div/div/div/div[4]/div/div/div[4]");
    public static Target On_Help_Page = Target.the("Help Page").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[3]/span/a");
    public static Target Click_Contact_Us = Target.the("Contact Us").locatedBy("//*[@id=\"contact\"]/div[1]/button/span");
    public static Target Click_About_Us = Target.the("About Us").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/ul/li[4]/span/a");
    public static Target Click_Portal = Target.the("Portal").locatedBy("//*[@id=\"root\"]/div/div/div/nav/div/button[1]");
    public static Target Click_Portal_Admin = Target.the("Portal Admin").locatedBy("/html/body/div[2]/div/ul/li[1]/span/a");
    public static Target on_Portal_Admin = Target.the("Portal Admin Page").locatedBy("//*[@id=\"root\"]/div/div/div/div[3]");
}
