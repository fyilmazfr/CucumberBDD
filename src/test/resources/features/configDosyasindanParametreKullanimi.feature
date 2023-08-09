Feature: kullanici parametre ile configuration file'i kullanabilmeli


  @config
  Scenario: TC07 configuration proporties dosyasindan parametre kullanimi
    Given kullanici "techproeducationUrl" anasayfasinda
    When kullanici 2 sn bekler
    Then url'in "techproeducation" icerdigini test eder
    And sayfayi kapatir

    #yorum yazilabiliriz
|          ddddddddd|
    |       vssvdsvvvsvs     |