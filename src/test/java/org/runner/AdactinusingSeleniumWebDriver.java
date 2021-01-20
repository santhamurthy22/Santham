package org.runner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinusingSeleniumWebDriver {
	
	@Test
	public void tc1() {
                WebDriverManager.chromedriver().setup();
                  WebDriver d=new ChromeDriver();
           d.get("https://adactinhotelapp.com/SearchHotel.php");
                    d.manage().window().maximize();
                    
                      d.findElement(By.id("username")).sendKeys("santhamurthy");
                      d.findElement(By.id("password")).sendKeys("santhamurthy");
                      d.findElement(By.id("login")).click();

                      WebElement location = d.findElement(By.id("location"));	
                      WebElement hotel = d.findElement(By.id("hotels"));	
                      WebElement roomtype = d.findElement(By.id("room_type"));	
                      WebElement roomnos = d.findElement(By.id("room_nos"));	
                      WebElement adultroom = d.findElement(By.id("adult_room"));	
                      WebElement childroom = d.findElement(By.id("child_room"));	

                            Select s = new Select(location);
                            Select s1 = new Select(hotel);
                            Select s2 = new Select(roomtype);
                            Select s3 = new Select(roomnos);
                            Select s4 = new Select(adultroom);
                            Select s5 = new Select(childroom);

                            s.selectByVisibleText("Sydney");
                            s1.selectByVisibleText("Hotel Creek");
                            s2.selectByVisibleText("Standard");
                            s3.selectByVisibleText("4 - Four");
                            s4.selectByVisibleText("2 - Two");
                            s5.selectByVisibleText("3 - Three");
      
                   d.findElement(By.id("datepick_in")).sendKeys("20/01/20121");
                   d.findElement(By.id("datepick_out")).sendKeys("21/01/20121");   
                   d.findElement(By.id("Submit")).click();
                   
                         d.findElement(By.id("radiobutton_0")).click();
                         d.findElement(By.id("continue")).click();

                    d.findElement(By.id("first_name")).sendKeys("SANTHAMURTHY");
                    d.findElement(By.id("last_name")).sendKeys("KESAVAN");  
                    d.findElement(By.id("address")).sendKeys("COIMBATORE");
                    d.findElement(By.id("cc_num")).sendKeys("1234567890123456");  
                    d.findElement(By.id("cc_cvv")).sendKeys("1234");  

                         WebElement creditcardtype = d.findElement(By.id("cc_type"));	
                         WebElement  expirymonth = d.findElement(By.id("cc_exp_month"));	
                         WebElement  expiryyear = d.findElement(By.id("cc_exp_year"));	
                                    
                       WebElement booknow = d.findElement(By.xpath("//input[@type='button']"));
                                    booknow.click();
                                    
                               Select s6 = new Select(creditcardtype);
                               Select s7 = new Select(expirymonth);
                               Select s8 = new Select(expiryyear);
                               
                               s6.selectByVisibleText("American Express");
                               s7.selectByVisibleText("June");
                               s8.selectByVisibleText("2016");         
                              }
                        }


