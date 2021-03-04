/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ak140
 */
public class Selenium_test {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;

    public static void main(String[] args) throws AWTException, InterruptedException {
        try {
            // TODO code application logic here
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak140\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
//            driver.get("https://www.pinterest.com/");
//            //login
//            driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[2]/button/div")).click();
//            Thread.sleep(1000);
//            //email
//            driver.findElement(By.name("id")).sendKeys("username");//user name
//            driver.findElement(By.name("id")).sendKeys(Keys.ENTER);
//            Thread.sleep(1000);
//            //driver.close();
//            //pass
//            driver.findElement(By.name("password")).sendKeys("password");//pasword
//            Thread.sleep(2000);
//            driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//            Thread.sleep(2000);
//
//            //user
//            String user = "username";//username
//            String url = "https://www.pinterest.com/" + user + "/boards/";
//            driver.get(url);
//            driver.get(url);
//            System.out.println(url);

            //driver.get("//div[@class=\"INd zI7 iyn Hsu\"]/a[@class=\"GestaltTouchableFocus\"]");      
            //Thread.sleep(2000);
            driver.get("https://www.pinterest.com/ak140175/pins/");
            //*[@id="__PWS_ROOT__"]/div[1]/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div[1]/a
//        List<WebElement> pictures = driver.findElements(By.xpath("//*[starts-with(@data-force-refresh,'1')]"));
            List<WebElement> pins = driver.findElements(By.className("Collection-Item"));
            System.out.println("Size is " + pins.size());
            for (WebElement pin : pins) {
                String href = pin.getAttribute("href");
                System.out.println("HERE IT IS www.pinterest.com" + href);
            }
            //*[@id="__PWS_ROOT__"]/div[1]/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div[1]/a/div/div[1]/div/div/div/div/div/img
            //*[@id="__PWS_ROOT__"]/div[1]/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[1]/a/div/div[1]/div/div/div/div/div/img
            //*[@id="__PWS_ROOT__"]/div[1]/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div[1]
            //*[@id="__PWS_ROOT__"]/div[1]/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/div
            //*[@id="__PWS_ROOT__"]/div[1]/div[3]/div/div/div/div[3]/div/div/div/div/div/div[1]/div[2]
            /*
             driver.findElement(By.name("q")).sendKeys("google serach bar id");
             driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
             try {
             driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click(); 
             } catch (Exception e) {
             System.out.println("Something went wrong.");            
             }
             */
            /* 
             Robot robot = new Robot();
             //   press Ctrl+S the Robot's way
             robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_S);
             robot.keyRelease(KeyEvent.VK_CONTROL);
             robot.keyRelease(KeyEvent.VK_S);
  
             */
            // typing name
            //int a=KeyEvent.getExtendedKeyCodeForChar('A');
            // TimeUnit.SECONDS.sleep(5);
            // robot.keyPress(a);
            // robot.keyRelease(a);
            // press Enter
            // TimeUnit.SECONDS.sleep(5);
            //robot.keyPress(KeyEvent.VK_ENTER);
            //robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
//            driver.close();
        }
    }
}
