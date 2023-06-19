@PresenseePage
Feature: Presensee Page

  @Home @NormalPositive @HomePresenseePageSuccess
  Scenario: User on Presensee home page
    Given User is on Presensee landing page
    Then User choose home page

  @Feature @NormalPositive @FeaturesPresenseePageSuccess
  Scenario: User on Presensee feature page
    Given User is on Presensee landing page
    Then User choose feature page

  @Feature @PresensiSidikJari @NormalPositive @FeaturesPresenseeSidikJariPageSuccess
  Scenario: User on Presensee feature presensi sidik jari page
    Given User is on Presensee landing page
    Then User choose feature page
    And User click on feature presensi sidik jari

  @Feature @Jadwal @NormalPositive @FeaturesPresenseeJadwalPageSuccess
  Scenario: User on Presensee feature jadwal page
    Given User is on Presensee landing page
    Then User choose feature page
    And User click on feature jadwal

  @Feature @HistoriPresensi @NormalPositive @FeaturesPresenseeHistoriPresensiPageSuccess
  Scenario: User on Presensee feature histori presensi page
    Given User is on Presensee landing page
    Then User choose feature page
    And User click on feature histori presensi

  @Feature @PresensiKamera @NormalPositive @FeaturesPresenseePresensiKameraPageSuccess
  Scenario: User on Presensee feature presensi kamera page
    Given User is on Presensee landing page
    Then User choose feature page
    And User click on feature presensi kamera

  @FAQ @Apaituabsensionline? @NormalPositive @FAQPresenseePageSuccess
  Scenario: User on Presensee faq page Apa itu absensi online ?
    Given User is on Presensee landing page
    Then User on faq page
    And User click on faq apa itu absensi online ?

  @FAQ @KenapaharusPresensee? @NormalPositive @FAQPresenseePageSuccess
  Scenario: User on Presensee faq page Kenapa harus Presensee ?
    Given User is on Presensee landing page
    Then User on faq page
    And User click on faq kenapa harus presensee ?

  @FAQ @BagaimanacaraPresenseememvalidasikehadiran? @NormalPositive @FAQPresenseePageSuccess
  Scenario: User on Presensee faq page Bagaimana cara Presensee memvalidasi kehadiran ?
    Given User is on Presensee landing page
    Then User on faq page
    And User click on faq bagaimana cara presensee memvalidasi kehadiran ?

  @FAQ @Bagaimanajikauniversitassayainginbekerjasamadenganpresensee? @NormalPositive @FAQPresenseePageSuccess
  Scenario: User on Presensee faq page Bagaimana jika universitas saya ingin bekerja sama dengan presensee ?
    Given User is on Presensee landing page
    Then User on faq page
    And User click on faq bagaimana jika universitas saya ingin bekerja sama dengan presensee ?

  @Help @ContactUs @NormalPositive @HelpPresenseePageSuccess
  Scenario: User on Presensee help page
    Given User is on Presensee landing page
    Then User on help page
    And User click on contact us

  @AboutUs @NormalPositive @AboutUsPresenseePageSuccess
  Scenario: User on Presensee about us page
    Given User is on Presensee landing page
    Then User on about us page

  @Portal @PortalAdmin @NormalPositive @PortalPresenseePageSuccess
  Scenario: User on Portal Admin page
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page

