Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir
