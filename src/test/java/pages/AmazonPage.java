package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
   public AmazonPage(){

    PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement aramaSonucElementi;
    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement ilkUrun;
    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement ilkUrunIsimElementi;
     public WebElement istenenUrunElementi(int index){

      String dinamikXpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])["+index+"]";
      WebElement istenenUrun=Driver.getDriver().findElement(By.xpath(dinamikXpath));

  return istenenUrun;
 }

}
