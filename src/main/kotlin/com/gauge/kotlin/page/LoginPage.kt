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
 * Time            : 6:03 PM
 * Description     : This is the login page class
 **/

class LoginPage(driver: WebDriver?) {

    @FindBy(id = "email")
    private val emailTextBox: WebElement? = null

    @FindBy(id = "passwd")
    private val passwordTextBox: WebElement? = null

    @FindBy(xpath = "//p[@class='submit']//span[1]")
    private val signInButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun login(username: String, password: String) {
        emailTextBox?.sendKeys(username)
        passwordTextBox?.sendKeys(password)
        signInButton?.click()
    }


}