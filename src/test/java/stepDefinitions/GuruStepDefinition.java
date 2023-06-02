package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guruPage=new GuruPage();

    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;
        int istenenBaslikIndexi=-3;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }
        }
        if (istenenBaslikIndexi!=-3){
            List<WebElement>istenenSutundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());
            }
        }else {
            System.out.println("istenen baslik bulunamadi");
        }

    }
}
