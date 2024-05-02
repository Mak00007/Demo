import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class LoginPage
{
  public static void main(String[] args)
  {
    WebDriver driver  = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    System.out.println(driver.getTitle());
    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    driver.findElement(By.name("name")).sendKeys("Mrs. Anuja Brahmankar Pradhan");
    driver.findElement(By.name("email")).sendKeys("manoj_pradhan@persistent.com");
    driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("AnujaMakky$23412");
    driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
    Select dropdown = new Select(driver.findElement(By.xpath("//div/select[@id='exampleFormControlSelect1']")));
    dropdown.selectByVisibleText("Female");
    driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
    driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("24-04-2024");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
  
}
