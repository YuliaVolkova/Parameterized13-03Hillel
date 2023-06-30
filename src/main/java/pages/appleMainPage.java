package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class appleMainPage {

    @FindBy(xpath = "//*[@id=\"globalnav-list\"]/li[2]/div/div/div[8]/ul/li[1]/a/span[1]")
    WebElement entertainmentTab;
    @FindBy(xpath = "//*[@id=\"globalnav-list\"]/li[2]/div/div/div[8]/ul/li[1]/a/span[1]/span[2]")
    WebElement accessoriesTab;
    @FindBy(xpath = "//*[@id=\"globalnav-list\"]/li[2]/div/div/div[9]/ul/li[1]/a/span[1]/span[2]")
    WebElement supportTab;

    public String entertainmentTabTest( ){
        return entertainmentTab.findElement(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[8]/ul/li[1]/a/span[1]/span[2]")).getText();
    }
    public String accessoriesTabTest( ){
        return accessoriesTab.findElement(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[9]/ul/li[1]/a/span[1]/span[2]")).getText();
    }
    public String supportTabTest(){
        return supportTab.findElement(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[10]/ul/li[1]/a/span[1]/span[2]")).getText();
    }
}
