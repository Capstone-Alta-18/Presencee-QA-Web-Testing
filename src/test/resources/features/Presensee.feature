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