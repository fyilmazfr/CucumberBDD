Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz

  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz

    Given  kullanici "HMCUrl" icin arama yapar
    Then Log in yazisina tiklar
    And gecersiz username olarak"<username>" girer
    And gecersiz pasword olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir

    Examples: