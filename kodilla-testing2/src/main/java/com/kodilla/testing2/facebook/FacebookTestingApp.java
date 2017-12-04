package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]//select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]//select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("1");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByValue("4");

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1990");

    }
}
