//package com.example.helloworld;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

    public class Window {
        public static void main(String args[]) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\Users\kather.oli\IdeaProjects\Selenium\config\driver\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tnpsc.gov.in/");
            Thread.sleep(4000);
            WebElement applyOnline = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
            applyOnline.click();
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
            Thread.sleep(10000);
//            int index=1;
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println("Size of windows:  " + windowHandles.size());
              if(windowHandles.size()>1) {
                  try {
                      System.out.println("True");
                  }
                  catch (IndexOutOfBoundsException e){
                      System.out.println("False");

                  }
                   catch (Exception e){
                    System.out.println(e);

                  }
              }

//            List<String> windowStrings = new ArrayList<>(windowHandles);
//            String childWindow = windowStrings.get(1);
//            driver.switchTo().window(childWindow);
//            System.out.println("Child Window Title is : "+driver.getTitle());
//            driver.quit();
            }
        }





