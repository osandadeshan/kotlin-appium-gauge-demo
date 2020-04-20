package com.gauge.kotlin.test

import com.gauge.kotlin.util.Driver
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 5:31 PM
 * Description     : This is the base class for the tests
 **/

open class TestBase {

     val driver: AppiumDriver<MobileElement>? = Driver.driver

    fun waitForPageLoad(driver: WebDriver?) {
        val pageLoadCondition: ExpectedCondition<Boolean> =
            ExpectedCondition { driver -> (driver as JavascriptExecutor?)!!.executeScript("return document.readyState") == "complete" }
        val wait = WebDriverWait(driver, 30)
        wait.until(pageLoadCondition)
    }


}