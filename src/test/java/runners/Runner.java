package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        features = "./src/test/resources/features",
<<<<<<< Updated upstream

        glue = "Registration2",
        tags = "@UIAyhan",
        dryRun = true

=======
        glue = "stepdefinitions",
        tags = "@",
        dryRun =false
>>>>>>> Stashed changes
)
public class Runner {
     /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class body'sinde hic bir sey olmaz
    Runner class'imizi onemli yapan 2 adet annotaion vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : step definitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder

   dryRun : iki secenek var
   dryRun=true; yazdigimizda Testimizi calistirmadan sadece eksik adimlari bize verir
   deyRun=false yazdigimizda testlerimizi calistirir

     */
}
