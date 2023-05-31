$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrangeHRMApplicarion.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM application functionalies testing",
  "description": "",
  "id": "orangehrm-application-functionalies-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 22,
      "value": "#Then User should close OrangeHRM application"
    }
  ],
  "line": 25,
  "name": "Validating OrangeHRM application Login functionality with multiple testdata",
  "description": "",
  "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should Launch chrome browser"
    }
  ],
  "line": 28,
  "name": "User should enter valid OrangeHRM application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should navigate to OrangeHRM application URL Address",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter  \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should navigate to OrangeHRM application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logout from application",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 33,
      "value": "#Then User should close OrangeHRM application"
    }
  ],
  "line": 35,
  "name": "",
  "description": "",
  "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 36,
      "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;1"
    },
    {
      "cells": [
        "Admin",
        "Mdishi0@@"
      ],
      "line": 37,
      "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;2"
    },
    {
      "cells": [
        "Admin",
        "test@@"
      ],
      "line": 38,
      "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;3"
    },
    {
      "cells": [
        "Admin",
        "Mdishi0@@"
      ],
      "line": 39,
      "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;4"
    },
    {
      "cells": [
        "Admin",
        "123456789"
      ],
      "line": 40,
      "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_Launch_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 37,
  "name": "Validating OrangeHRM application Login functionality with multiple testdata",
  "description": "",
  "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should Launch chrome browser"
    }
  ],
  "line": 28,
  "name": "User should enter valid OrangeHRM application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should navigate to OrangeHRM application URL Address",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter  \"Admin\" and \"Mdishi0@@\" and click on Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should navigate to OrangeHRM application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logout from application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_valid_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "Mdishi0@@",
      "offset": 32
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_Login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logout_from_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_Launch_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 38,
  "name": "Validating OrangeHRM application Login functionality with multiple testdata",
  "description": "",
  "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should Launch chrome browser"
    }
  ],
  "line": 28,
  "name": "User should enter valid OrangeHRM application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should navigate to OrangeHRM application URL Address",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter  \"Admin\" and \"test@@\" and click on Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should navigate to OrangeHRM application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logout from application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_valid_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "test@@",
      "offset": 32
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_Login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logout_from_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_Launch_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 39,
  "name": "Validating OrangeHRM application Login functionality with multiple testdata",
  "description": "",
  "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should Launch chrome browser"
    }
  ],
  "line": 28,
  "name": "User should enter valid OrangeHRM application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should navigate to OrangeHRM application URL Address",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter  \"Admin\" and \"Mdishi0@@\" and click on Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should navigate to OrangeHRM application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logout from application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_valid_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "Mdishi0@@",
      "offset": 32
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_Login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logout_from_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_Launch_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 40,
  "name": "Validating OrangeHRM application Login functionality with multiple testdata",
  "description": "",
  "id": "orangehrm-application-functionalies-testing;validating-orangehrm-application-login-functionality-with-multiple-testdata;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should Launch chrome browser"
    }
  ],
  "line": 28,
  "name": "User should enter valid OrangeHRM application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should navigate to OrangeHRM application URL Address",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter  \"Admin\" and \"123456789\" and click on Login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should navigate to OrangeHRM application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logout from application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_valid_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_URL_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    },
    {
      "val": "123456789",
      "offset": 32
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_Login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_navigate_to_OrangeHRM_application_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logout_from_application()"
});
formatter.result({
  "status": "skipped"
});
});