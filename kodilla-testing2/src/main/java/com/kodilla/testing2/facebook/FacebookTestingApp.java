package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIES = "//*[@title='Akceptuj wszystkie']";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@id, \"u_0_3_\")]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String ID_WAIT_FOR = "reg_form_box";

    public static void main(String[] args)  throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        By cookies_accept = By.xpath(XPATH_ACCEPT_COOKIES);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));

        WebElement btnCreatedAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        btnCreatedAccount.click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(ID_WAIT_FOR)));

        WebElement dayField = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByIndex(9);

        WebElement monthField = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByIndex(4);

        WebElement yearField = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByIndex(11);

    }
}