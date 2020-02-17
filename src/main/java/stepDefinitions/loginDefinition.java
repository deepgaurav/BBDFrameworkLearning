package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginDefinition {

    WebDriver driver;
@Given("^User is on Login Page$")

    public void User_is_on_Login_Page(){

    System.setProperty("webdriver.chrome.driver","C://Users//shipra.parihar//Downloads//chromedriver_win32 (2)//chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://freecrm.co.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
}

@When("^Title of Login Page is Free CRM$")

    public void Title_of_Login_Page_is_Free_CRM() throws InterruptedException {
    Thread.sleep(3000);
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals("Free CRM #1 cloud software for any business large or small",title);
}



@Then("^User enters UserName and User enters Password$")

    public void User_enters_UserName_and_User_enters_Password() throws Exception{
        Thread.sleep(2000);
     driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("0109shipra@gmail.com");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("work@123");



}

@Then("^User clicks on Login Button$")

public void User_clicks_on_Login_Button(){
    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();


    }

@And("^User is on Home Page$")

   public void User_is_on_Home_Page(){
   String HomeTitle = driver.getTitle();
   Assert.assertEquals("Cogmento CRM",HomeTitle);

    }


}
