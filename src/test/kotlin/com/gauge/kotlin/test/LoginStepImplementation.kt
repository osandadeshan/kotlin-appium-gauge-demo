package com.gauge.kotlin.test

import com.gauge.kotlin.page.LoginPage
import com.thoughtworks.gauge.Step

/**
 * Project Name    : kotlin-appium-gauge-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 4/19/2020
 * Time            : 5:42 PM
 * Description     : This is the login page step implementation class
 **/

class LoginStepImplementation : TestBase() {

    @Step("Login to the application using email <email> and password <password>")
    fun login(email : String, password : String){
        waitForPageLoad(driver)
        val loginPage = LoginPage(driver)
        loginPage.login(email, password)
    }


}
