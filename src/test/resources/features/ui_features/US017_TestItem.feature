Feature: US017 Test Item

  Background:
    Given kullanici medunna anasayfasinda
    And kullanici account menu tiklar
    And kullanici sign in tiklar
    And kullanici username olarak "us16Username" girer
    And kullanici password olarak "us16Password" girer
    And sign in butonuna tiklar
    And admin Test Items sayfasina gecis yapar

#her sefer calisir
  Scenario: US016 TC000 admin test item sayfasini dogrular
    Then url nin "test-item" icerdigini dogrular
    Then basligin "Test Items" icerdigini dogrular
    And tablo da "ID" "Name" "Description" "Price" "Default Min. Value" "Default Max. Value" "Created Date" basliklarinin gorunur oldugunu dogrular
    And Create a new Room butonunun erisilebilir ve gorunur oldugunu dogrular
    And sayfayi kapatir

#Her sefer calisir
# --NAME her test de degistirilecek(ayni isimde 2 tane olamaz) ya da onceden olusturulan test item silinecek
  Scenario: US017 TC001 admin yeni test item olusturur ve dogrular
    And Create a new test item butonuna tiklar
    Then Create or edit test item sayfasinin acildigini dogrular
    And Name "test item no:1" girer
    And description "team59 otomasyon testi" girer
    And price "59" girer
    And Default Min. "0" girer
    And Default Max. "59" girer
    And created Date "08282022" girer
    And Save butona tiklar
    Then "A new Test Item is created" yazisi gorunur oldugunu dogrular
    And yeni olusturulan test ogesinin sayfasina navigate eder
    Then yeni test ogesinin id sinin gorunur oldugunu dogrular
    And test ogesinin view butonuna tiklar
    Then yeni test ogesinin bilgilerinin "test item no:1" "team59 otomasyon testi" "59" "0" "59" oldugunu dogrular
    #FAILED STEP
    Then date "28/08/22" oldugunu dogrular
    And sayfayi kapatir

    #calisiyor
  Scenario: US017 TC002 admin test item guncelleyebilir
    And "30164" id li test ogesinin Edit butonuna tiklar
    And Name "test item no:01" girer
    And description "team59 otomasyon testi" girer
    And price "59" girer
    And Default Min. "0" girer
    And Default Max. "59" girer
    And created Date "08292022" girer
    And Save butona tiklar
    Then "A Test Item is updated with identifier 30164" yazisi oldugunu dogrular
    And "30164" id li test ogesinin View butonuna tiklar
    Then yeni test ogesinin bilgilerinin "test item no:01" "team59 otomasyon testi" "59" "0" "59" oldugunu dogrular
    #FAILED STEP
    Then created date "29/08/22" oldugunu dogrular
    And close driver

    #calisiyor
  Scenario: US017 TC003 admin test item silebilir
    And olusturdugu test ogesine gecis yapar
    And Delete butona tiklar
    And dogrulama sayfasinda Delete butona tiklar
    Then "A Test Item is deleted" yazisi oldugunu dogrular
    Then silinen test ogesinin id sinin olmadigini dogrular
    And sayfayi kapatir