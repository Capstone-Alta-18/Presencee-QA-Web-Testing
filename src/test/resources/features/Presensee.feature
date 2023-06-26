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

  @Portal @PortalDosen @NormalPositive @PortalPresenseePageSuccess
  Scenario: User on Portal Dosen page
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal dosen
    Then User is on portal dosen page

  @AdminPage @Dashboard @NormalPositive @AdminPresenseePageDashboardSuccess
  Scenario: User on Admin page dashboard
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard

  @AdminPage @Eyes @NormalPositive @AdminPresenseePageDashboardSuccess
  Scenario: User on Admin page dashboard
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User want to visible their password
    Then User click enter
    Then User directed to admin page dashboard

  @DosenPage @Dashboard @NormalPositive @DosenPresenseePageDashboardSuccess
  Scenario: User on Portal Dosen page dashboard
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal dosen
    Then User is on portal dosen page
    Then User input correct Email "EMAIL"
    Then User input correct Password "PASSWORD"
    Then User click login
    Then User directed to dosen page dashboard

  @AdminDashboard @JadwalKuliah @NormalPositive @PresenseeJadwalKuliahSuccess
  Scenario: Admin wanted to added a student schedule in jadwal kuliah
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Jadwal Kuliah
    Then User click on Tambahkan

  @AdminDashboard @DataMahasiswa @NormalPositive @PresenseeDataMahasiswaSuccess
  Scenario: Admin wanted to see list of data mahasiswa
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Mahasiswa
    Then User see first data mahasiswa list
    Then User see second data mahasiswa list
    Then User see third data mahasiswa list
    Then User see forth data mahasiswa list

  @AdminDashboard @DataMahasiswa @MahasiswaDashboard @AlexanderInformation @NormalPositive @PresenseeDataMahasiswaSuccess
  Scenario: Admin wanted to change information of alexander on data mahasiswa
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Mahasiswa
    Then User click on Detail button
    Then User directed to data mahasiswa alexander
    Then User change tahun masuk
    Then User click on new entering year
    Then User change Fakultas
    Then User click on fakultas ekonomi
    Then User change jurusan
    Then User click on jurusan astronomi
    Then User click on update button

  @AdminDashboard @DataMahasiswa @MahasiswaDashboard @AlexanderInformation @DetailBackButtonInsideAlexanderInformation @DetailButtonMahasiswa @BackButtonInside @NormalPositive @PresenseeDataMahasiswaSuccess
  Scenario: Admin wanted to click back button that inside of mahasiswa dashboard
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Mahasiswa
    Then User click on Detail button
    Then User click on Back button to list of mahasiswa

  @AdminDashboard @DataMahasiswa @SearchNamaMahasiswa @NormalPositive @PresenseeDataMahasiswaSuccess
  Scenario: Admin wanted to search mahasiswa name in column
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Mahasiswa
    Then User search mahasiswa in cari nama mahasiswa
    Then User input mahasiswa name "Name"

  @AdminDashboard @DataMahasiswa @DetailButtonMahasiswa @NormalPositive @PresenseeDataMahasiswaSuccess
  Scenario: Admin wanted to click detail button from one mahasiswa in the list
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Mahasiswa
    Then User click on Detail button

  @AdminDashboard @DataMahasiswa @KembaliButtonMahasiswa @NormalPositive @PresenseeDataMahasiswaSuccess
  Scenario: Admin wanted to click kembali button to manage data
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Mahasiswa
    Then User click on Kembali button

  @DosenDashboard @DataDosen @NormalPositive @PresenseeDataDosenSuccess
  Scenario: Admin wanted to see list of data dosen
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Dosen
    Then User see first data dosen list
    Then User see last data dosen list

  @DosenDashboard @DataDosen @SearchNamaDosen @NormalPositive @PresenseeDataDosenSuccess
  Scenario: Admin wanted to search dosen name in column
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Dosen
    Then User search dosen in cari nama Dosen
    Then User input dosen name "Name"

  @DosenDashboard @DataDosen @DetailButtonDosen @NormalPositive @PresenseeDataDosenSuccess
  Scenario: Admin wanted to click detail button from one dosen in the list
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Dosen
    Then User click on detail button from dosen list
    Then User see detail of dosen

  @DosenDashboard @DataDosen @ReturnButtonDosen @NormalPositive @PresenseeDataDosenSuccess
  Scenario: Admin wanted to click kembali button to manage data
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on Data mahasiswa
    Then User click on Manage Data Data Dosen
    Then User click on Back button

  @AdminDashboard @RiwayatPresensi @NormalPositive @PresenseeRiwayatPresensiSuccess
  Scenario: Admin wanted to see riwayat presensi
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click on riwayat presensi

  @AdminDashboard @Logout @NormalPositive @PresenseelogoutfromportaladminSuccess
  Scenario: Admin wanted to logout from portal admin
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal admin
    Then User is on portal admin page
    Then User input valid Email "Email"
    Then User input valid Password "Password"
    Then User click enter
    Then User directed to admin page dashboard
    Then User click logout

  @DosenDashboard @JadwalKuliahDosen @NormalPositive @DosenPresenseePageDashboardSuccess
  Scenario: Dosen on Portal Dosen want to see jadwal kuliah for lecturing
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal dosen
    Then User is on portal dosen page
    Then User input correct Email "EMAIL"
    Then User input correct Password "PASSWORD"
    Then User click login
    Then User directed to dosen page dashboard
    Then User click on jadwal kuliah for lecturing

  @DosenDashboard @LogoutfromDosen @NormalPositive @DosenPresenseePageDashboardSuccess
  Scenario: Dosen on Portal Dosen want to logout from dosen dashboard
    Given User is on Presensee landing page
    And User click on portal
    Then User click on portal dosen
    Then User is on portal dosen page
    Then User input correct Email "EMAIL"
    Then User input correct Password "PASSWORD"
    Then User click login
    Then User directed to dosen page dashboard
    Then User click logout from dosen page dashboard


