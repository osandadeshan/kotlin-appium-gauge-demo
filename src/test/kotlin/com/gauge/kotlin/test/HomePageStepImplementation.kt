package com.gauge.kotlin.test

import com.gauge.kotlin.page.HomePage
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 5:49 PM
 * Description     : This is the home page step implementation class
 **/

class HomePageStepImplementation : TestBase() {

    @Step("Click on Sign In button")
    fun clickOnSignInButton() {
        val homePage = HomePage(driver)
        homePage.clickOnSignInButton()
        waitForPageLoad(driver)
    }


}