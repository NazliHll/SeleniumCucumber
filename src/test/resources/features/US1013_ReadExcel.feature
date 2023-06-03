Feature: US1013 kullanici excel bilgilerine ulasir

  Scenario: TC18 kullanici excel bilgilerini kullanir
    Given kullanici excel dosyasini kullanabilir hale getirir
    Then 1.satirdaki 2. hücreyi yazdirir
    And baskenti Jakarta olan ulke ismini yazdirir
    And ulke sayisinin 190 oldugunu test eder
    And fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder
    Then 3.satir 2.sutundaki bilgiyi yazdirir
