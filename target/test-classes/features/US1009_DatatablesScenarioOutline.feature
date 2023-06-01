Feature: US1009 Datatables sitesine 5 farkli giris yapin
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And soyisim bolumune "<lastname>" yazar
    And position bolumune "<position>" yazar
    And ofis bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And starDate bolumune "<starDate>" yazar
    And salary bolumune "<salary>" yazar
    And create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
    |firstname|lastname|position|office|extension|starDate  |salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
    |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
    |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|