Feature: Amazon Search

  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir

      Scenario: TC03 kullanizi xiaomi aratir
        When kullanici amazon anasayfasinda
        Then kullanici xiaomi icin arama yapar
        And sonuclarin xiaomi icerdigini test eder
        And sayfayi kapatir



