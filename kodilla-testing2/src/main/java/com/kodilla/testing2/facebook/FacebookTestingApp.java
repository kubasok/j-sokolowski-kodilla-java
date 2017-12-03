package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
//    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
//    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

//        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
//        searchField.sendKeys("New robotic task");
//
//        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
//        textareaField.sendKeys("New robotic content");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("1");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByValue("4");

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectDay.selectByValue("1992");

        //searchField.submit();
    }
}
