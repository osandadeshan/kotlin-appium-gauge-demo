package com.gauge.kotlin.util

import com.google.common.collect.ImmutableMap
import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.BeforeScenario
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File
import java.net.URL
import java.util.concurrent.TimeUnit

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 4:55 PM
 * Description     : This is the Appium driver class
 **/

open class Driver {

    // Appium properties
    private val appiumHostAddress = System.getenv("appium_host_address")
    private val appiumPort = System.getenv("appium_port")
    private val serverAddress = URL("http://$appiumHostAddress:$appiumPort/wd/hub")

    // Device properties
    private var browser = System.getenv("browser")
    private var platform = System.getenv("platform")
    private var deviceName = System.getenv("device_name")
    private var platformVersion = System.getenv("platform_version")

    // General properties
    private var appUrl = System.getenv("app_url")
    private var projectRoot = System.getProperty("user.dir")
    private var chromeDriverExecutablePath = projectRoot + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "chromedriver.exe"

    companion object {
        var driver : AppiumDriver<MobileElement>? = null
    }

    @BeforeScenario
    fun createAndroidDriver() : AppiumDriver<MobileElement>? {
        val capabilities = DesiredCapabilities()
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false))
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName)
        capabilities.setCapability(MobileCapabilityType.VERSION, platformVersion)
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browser)
        capabilities.setCapability("chromedriverExecutable", chromeDriverExecutablePath)
        driver = AndroidDriver(serverAddress, capabilities)
        driver?.get(appUrl)
        driver?.let {
            it.manage()?.timeouts()?.implicitlyWait(30, TimeUnit.SECONDS)
        }
        return driver
    }

    @AfterScenario
    fun closeDriver() {
        driver?.quit()
    }


}
