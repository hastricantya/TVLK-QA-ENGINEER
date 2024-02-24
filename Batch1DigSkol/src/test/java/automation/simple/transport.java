package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class transport {
    WebDriver driver;

    @Test
    public void transport() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Wait for visibility traveloka at the top left by xpath
        driver.get("https://www.traveloka.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement home = driver.findElement(By.xpath("//*[@id="__next"]/div[1]/div[2]/div/div[1]/div[1]/a"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div[1]/div[2]/div/div[1]/div[1]/a")));

        // Click car transport by id pic
        WebElement carTransport = driver.findElement(By.id("IcProductDuotoneCarRentalFill"));
        IcProductDuotoneCarRentalFill.click();
        carTransportInput.sendKeys(Keys.ENTER);
        Thread.sleep (5000);

        // Click button without driver
        WebElement withoutDriver = driver.findElement(By.id("IcTransportPickUpDriver"));
        IcTransportPickUpDriver.click();
        IcTransportPickUpDriver.sendKeys(Keys.ENTER);
        Thread.sleep (5000);

        // Make automation to fill pickup in jakarta
        WebElement fromCity = driver.findElement(By.id("fromCityIcTransportPickUpDriver"));
        fromCityIcTransportPickUpDriver.click();
        WebElement fromCity = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div[1]/div/div/h4"));
        fromCity.click();
        WebElement fromCityInput = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/input"));
        fromCityInput.sendKeys("Jakarta");
        Thread.sleep (5000);
        fromCityInput.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep (5000);
        fromCityInput.sendKeys(Keys.ENTER);
        Thread.sleep (5000);

        // Make automation by fill the start rental date
        WebElement startDate = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[3]/div/div[1]/div[1]/input"));
        startDate.click();
        startDate.sendKeys("25 February 2024");
        Thread.sleep (5000);
        startDate.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep (5000);
        startDate.sendKeys(Keys.ENTER);
        Thread.sleep (5000);

        // Make Start Time Rental
        WebElement startTime = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[5]/div/div[1]/div[1]/input"));
        startTime.click();
        startTime.sendKeys("09:00");
        Thread.sleep (5000);
        startTime.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep (5000);
        WebElement donestartTime = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[5]/div/div[2]/div/div/div[2]/div/div"));
        donestartTime.click();
        Thread.sleep (5000);

         // Make automation by fill the end rental date
         WebElement endDate = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[7]/div/div[1]/div[1]/input"));
         endDate.click();
         endDate.sendKeys("1 March 2024");
         Thread.sleep (5000);
         endDate.sendKeys(Keys.ARROW_DOWN);
         Thread.sleep (5000);
         endDate.sendKeys(Keys.ENTER);
         Thread.sleep (5000);
 
         // Make End Time Rental
         WebElement endTime = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[1]/div[1]/input"));
         endTime.click();
         endTime.sendKeys("11:00");
         Thread.sleep (5000);
         endTime.sendKeys(Keys.ARROW_DOWN);
         Thread.sleep (5000);
         WebElement doneendTime = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[9]/div/div[2]/div/div/div[2]/div/div"));
         doneendTime.click();
         Thread.sleep (5000);

        // Click Search Button
        WebElement searchButton = driver.findElement(By.xpath("//*[@id="__next"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[11]/div/div/div/div[2]/div/svg"));
        searchButton.click();
        Thread.sleep (15000);
        
        // Wait for the next screen to select car
        WebElement selectCar = driver.findElement(By.xpath("//*[@id="__next"]/div/div[5]/div/h2"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div/div[5]/div/h2")));

        // Select Car
        WebElement buttonSelectCar = driver.findElement(By.xpath("//*[@id="__next"]/div/div[5]/div/div[4]/div/div[2]/div[2]/div[1]/div[2]"));
        buttonSelectCar.click();
        Thread.sleep (15000);

        // Wait for the next screen to information detail booking car
        WebElement detailBooking = driver.findElement(By.xpath("//*[@id="__next"]/div/div[5]/div/div[3]/div[2]/div/div[1]/div/div[1]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div/div[5]/div/div[3]/div[2]/div/div[1]/div/div[1]")));
        
        // Select Pickup Location
        WebElement pickupLoc = driver.findElement(By.xpath("//*[@id="RENTAL_PICKUP_LOCATION"]/div/div/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]"));
        pickupLoc.click();
        Thread.sleep (5000);
        WebElement detailpickupLoc = driver.findElement(By.xpath("//*[@id="RENTAL_PICKUP_LOCATION"]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/div/div[1]/div/div[1]"));
        detailpickupLoc.click();
        Thread.sleep (5000);

        // Select Drop Off Location
        WebElement dropoffLoc = driver.findElement(By.xpath("//*[@id="RENTAL_DROPOFF_LOCATION"]/div/div/div[1]/h3"));
        dropoffLoc.click();
        Thread.sleep (5000);
        WebElement detaildropoffLoc = driver.findElement(By.xpath("//*[@id="RENTAL_DROPOFF_LOCATION"]/div/div/div[5]/div[1]/div[2]/div/div/div[1]/div/div[1]"));
        detaildroppffLoc.click();
        Thread.sleep (5000);
        //*[@id="RENTAL_DROPOFF_LOCATION"]/div/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/h3
        WebElement locdrop = driver.findElement(By.xpath("//*[@id="RENTAL_DROPOFF_LOCATION"]/div/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/h3"));
        locdrop.click();
        Thread.sleep (5000);

        // Input note dropoff loc
        WebElement noteLoc = driver.findElement(By.xpath("//*[@id="RENTAL_DROPOFF_LOCATION"]/div/div/div[5]/div[2]/div/div[2]/h4"));
        noteLoc.click();
        Thread.sleep (5000);
        WebElement inputnoteLoc = driver.findElement(By.xpath("//*[@id="RENTAL_DROPOFF_LOCATION"]/div/div/div[5]/div[2]/div/div[2]/div/textarea"));
        inputnoteLoc.sendKeys("Soeta terminal 1");

        // Click Book Now
        WebElement buttonBook = driver.findElement(By.xpath("//*[@id="__next"]/div/div[5]/div/div[1]/div/div[5]/div[3]/div/div[2]/div"));
        buttonBook.click();
        Thread.sleep (15000);
        
        // Wait for the next screen to information booking car
        WebElement infoBook = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/h1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div[2]/h1")));
        Thread.sleep (15000);

        // Fill contact details
        WebElement inputFullName = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/input"));
        inputFullName.sendKeys("Hastri Cantya");
        Thread.sleep (5000);
        WebElement inputPhone = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/input"));
        inputPhone.sendKeys("8953259141");
        Thread.sleep (5000);
        WebElement inputEmail = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div[1]/input"));
        inputEmail.sendKeys("hastricantyad@gmail.com");
        Thread.sleep (5000);

        // Fill driver details
        WebElement driverTitle = driver.findElement(By.xpath("//*[@id="adultForm0"]/div/div/div[2]/div[1]/div/div/select"));
        driverTitle.click();
        Thread.sleep (5000);
        WebElement inputFullNameDriver = driver.findElement(By.xpath("//*[@id="adultForm0"]/div/div/div[2]/div[2]/div/div[1]/input"));
        inputFullNameDriver.sendKeys("Hastri Cantya");
        Thread.sleep (5000);
        WebElement inputPhoneDriver = driver.findElement(By.xpath("//*[@id="adultForm0"]/div/div/div[2]/div[3]/div[1]/input"));
        inputPhone.sendKeys("8953259141");
        Thread.sleep (5000);

        // Click Continue for Booking
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]")));
        Thread.sleep (5000);

        // Wait for the next screen to payment booking
        WebElement paymentBook = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[2]/div/div/h2"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[2]/div/div/h2")));
        Thread.sleep (15000);

        // Add Special Request
        WebElement specialReq = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[9]/div/div/div[3]/div[1]/textarea"));
        specialReq.sendKeys("need tissue");
        Thread.sleep (5000);

        // Check All Rental Requirement
        WebElement check = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[11]/div/div/svg"));
        check.click();
        Thread.sleep (5000);
        WebElement checkAll = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]"));
        checkAll.click();
        Thread.sleep (5000);
        checkAll.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep (5000);
        WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]"));
        save.click();
        Thread.sleep (5000);

        // Click Continue to Payment
        WebElement continuePayment = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[1]/div[14]/div/div/div/div[2]/div"));
        continuePayment.click();
        Thread.sleep (5000);

        // Wait for the next screen to payment booking
        WebElement paymentBook = driver.findElement(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[2]/div/div/h2"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div[2]/div[2]/div[2]/div/div/h2")));
        Thread.sleep (15000);

        // Choose Payment
        WebElement finalPayment = driver.findElement(By.xpath("//*[@id="__next"]/div/div[2]/div[1]/div[1]/h1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div/div[2]/div[1]/div[1]/h1")));
        Thread.sleep (5000);
        WebElement choosePayment = driver.findElement(By.xpath("//*[@id="__next"]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div[3]/div/div"));
        choosePayment.click();
        Thread.sleep (5000);
        WebElement pay = driver.findElement(By.xpath("//*[@id="__next"]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div[7]/div[2]/div[2]/div"));
        pay.click();
        Thread.sleep (15000);

        // Wait for the next screen to transfer pay
        WebElement transferpay = driver.findElement(By.xpath("//*[@id="__next"]/div/div[2]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/h2"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="__next"]/div/div[2]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/h2")));
        Thread.sleep (15000);
        
        driver.quit();
    }
}