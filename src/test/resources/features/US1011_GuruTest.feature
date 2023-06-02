Feature: US1011 web tablasindaki istenen sutunu yazdirma

  Scenario: TC16 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    And "IstenenBaslik", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir