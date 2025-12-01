package org.example;

import org.openqa.selenium.safari.SafariDriver;

public class ReadEmail {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Read email");
        SafariDriver safariDriver = new SafariDriver();
        safariDriver.get("https://www.google.com");
        Thread.sleep(2000);
        String title = safariDriver.getTitle();
        System.out.println(title);
        safariDriver.close();
    }
}
