//open Website and click myaccount 
//Click Login Button and Entering Login Credentials and click Login Button
//we will search for three items and we will add all 3 items in the cart
//cart window will open and we will compare the items as MacBook Air and MacBook pro 
//we will remove MacBook Air and we will go to My account and Logout
package AutomationTestAjio.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourCartTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); 
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement emailField = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailField.sendKeys("21is55suhas@gmail.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordField.sendKeys("Suhas01@");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement text1Field = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        text1Field.sendKeys("iphone");
       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox.clear();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement text2Field = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        text2Field.sendKeys("MacBook Air");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement searchBox1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox1.clear();
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,300)");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement text3Field = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        text3Field.sendKeys("MacBook Pro");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement searchBox2 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox2.clear();
        
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,300)");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,100)");
        
        //compare the product in cart
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//tbody/tr[2]/td[4]/div[1]/span[1]/button[2]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[normalize-space()='×']")).click();
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

	}

}