Feature: US1010 herokuapp delete testi
  @heroku
  Scenario :TC15 herokuappten delete butonu calismali
    Given kullanici "herokuappUrl" anasayfasinda
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna basar
    And sayfayi kapatir
