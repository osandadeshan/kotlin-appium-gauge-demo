package com.gauge.kotlin.test

import com.thoughtworks.gauge.Step
import org.junit.Assert

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 5:55 PM
 * Description     : This is the common step implementation class
 **/

class CommonStepImplementation : TestBase() {

    @Step("Page title is <pageTitle>")
    fun verifyPageTitle(pageTitle : String) {
        Assert.assertEquals(driver?.title, pageTitle)
    }


}