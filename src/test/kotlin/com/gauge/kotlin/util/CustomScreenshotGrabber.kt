package com.gauge.kotlin.util

import com.gauge.kotlin.util.Driver.Companion.driver
import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 5:12 PM
 * Description     : This is the screenshot grabber class. When a test is failed this will automatically take a screenshot and append to the html-report
 **/

class CustomScreenshotGrabber : ICustomScreenshotGrabber {

    // Return a screenshot byte array
    override fun takeScreenshot(): ByteArray? {
        return (driver as TakesScreenshot).getScreenshotAs(OutputType.BYTES)
    }


}