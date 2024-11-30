package Practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class temp {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/login");
        driver.manage().window().maximize();

        // Locate all social media anchor tags
        List<WebElement> totalEle = driver.findElements(By.xpath("//div[contains(@class, 'social')]//a"));

        // Print the count of social media links
        System.out.println("Total number of social media elements: " + totalEle.size());

        // Iterate through each element and print the href attribute
        for (WebElement ele : totalEle) {
            String name = ele.getAttribute("href");
            System.out.println(name);
        }

        // Close the browser
        driver.quit();
    }
}
