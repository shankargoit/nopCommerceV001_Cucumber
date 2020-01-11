$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login DataDriven validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters EmailId as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@123",
        "admin123"
      ]
    },
    {
      "cells": [
        "admin@sapp",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login DataDriven validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters EmailId as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_EmailId_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login DataDriven validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters EmailId as \"admin@123\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_EmailId_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Dashboard / nopCommerce administratio]n\u003e but was:\u003c[Your store. Logi]n\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepsDefenitions.LoginPageSteps.page_title_should_be(LoginPageSteps.java:63)\r\n\tat ✽.page title should be \"Dashboard / nopCommerce administration\"(file:Features/Login.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login DataDriven validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters EmailId as \"admin@sapp\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_EmailId_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Dashboard / nopCommerce administratio]n\u003e but was:\u003c[Your store. Logi]n\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepsDefenitions.LoginPageSteps.page_title_should_be(LoginPageSteps.java:63)\r\n\tat ✽.page title should be \"Dashboard / nopCommerce administration\"(file:Features/Login.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login DataDriven validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters EmailId as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_EmailId_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});