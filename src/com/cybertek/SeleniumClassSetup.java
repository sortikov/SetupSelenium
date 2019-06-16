package com.cybertek;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.prefs.Preferences;


public class SeleniumClassSetup {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Shah\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver d1 = new ChromeDriver();

        d1.get ("http://google.com");

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Shah\\Documents\\selenium dependencies\\drivers\\geckodriver.exe");

        WebDriver d2 = new FirefoxDriver();

        d2.get ("http://google.com");

        System.out.println("Hi there. This is change to my code. this one is to be sent through GitHub");


    }
}
