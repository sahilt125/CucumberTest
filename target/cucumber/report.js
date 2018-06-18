$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EmilyiOSLogin.feature");
formatter.feature({
  "line": 1,
  "name": "github login",
  "description": "",
  "id": "github-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "login with username and password",
  "description": "",
  "id": "github-login;login-with-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Emily Website on device \u0027\u003cDevice\u003e\u0027 with OS version \u0027\u003cOSVersion\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Username \u0027\u003cUserName\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters Password \u0027\u003cPassword\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is successfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "github-login;login-with-username-and-password;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Device",
        "OSVersion"
      ],
      "line": 12,
      "id": "github-login;login-with-username-and-password;;1"
    },
    {
      "cells": [
        "Kanchan@weareloup.com",
        "Kanpassword",
        "iPhone 8",
        "11.0"
      ],
      "line": 13,
      "id": "github-login;login-with-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "login with username and password",
  "description": "",
  "id": "github-login;login-with-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Emily Website on device \u0027iPhone 8\u0027 with OS version \u002711.0\u0027",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Username \u0027Kanchan@weareloup.com\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters Password \u0027Kanpassword\u0027",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone 8",
      "offset": 36
    },
    {
      "val": "11.0",
      "offset": 63
    }
  ],
  "location": "EmilyLoginSteps.user_is_on_Emily_App(String,String)"
});
formatter.result({
  "duration": 13958371695,
  "status": "passed"
});
formatter.match({
  "location": "EmilyLoginSteps.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 2253886643,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kanchan@weareloup.com",
      "offset": 22
    }
  ],
  "location": "EmilyLoginSteps.user_enters_username(String)"
});
formatter.result({
  "duration": 409037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kanpassword",
      "offset": 22
    }
  ],
  "location": "EmilyLoginSteps.user_enters_password(String)"
});
formatter.result({
  "duration": 359318,
  "status": "passed"
});
formatter.match({
  "location": "EmilyLoginSteps.user_clicks_onSignIn()"
});
formatter.result({
  "duration": 211218,
  "status": "passed"
});
formatter.match({
  "location": "EmilyLoginSteps.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 241543,
  "status": "passed"
});
});