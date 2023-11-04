package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

    public static void main(String[] args) throws InterruptedException {
        googleSearch();
    }

    public static void googleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        searchPage.setTextInSearchBox("sadsad");
        searchPage.clickSearchButton();

        Thread.sleep(5000);
        driver.close();
        System.out.println("Test Completed Successfully");
    }
}
