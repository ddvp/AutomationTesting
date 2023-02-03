package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    WebDriver driver;


    public SignIn(WebDriver driver) {
        this.driver =  driver;
    }

    By SingIn = By.xpath("//*[@id=\"__next\"]/div/div/div/nav/div[2]/div/ul[2]/li[1]/a");
    By Username = By.xpath("//*[@id=\"element-0\"]");
    By Password = By.xpath("//*[@id=\"element-3\"]");

    By Button = By.xpath("//*[@id=\"todoist_app\"]/div/div/div[2]/div[1]/div/div/form/button");


    public WebElement getSignIn(){
        return driver.findElement(SingIn);
    }

    public WebElement getUsername() {return driver.findElement(Username);
    }
    public WebElement getPassword() {return driver.findElement(Password);

    }

    public WebElement getButton(){
        return driver.findElement(Button);
    }

}
