package com.gauge.kotlin.page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 6:11 PM
 * Description     : This is the home page class
 **/

class HomePage(driver: WebDriver?) {

    @FindBy(xpath = "//a[@class='login']")
    private val signInButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun clickOnSignInButton() {
        signInButton?.click()
    }


}