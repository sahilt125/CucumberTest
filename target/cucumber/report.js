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
  "name": "User is on Emily Website on device \"\u003cDevice\u003e\" with OS version \"\u003cOSVersion\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 7,
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
      "line": 8,
      "id": "github-login;login-with-username-and-password;;1"
    },
    {
      "cells": [
        "Kanchan@weareloup.com",
        "Kanpassword",
        "iPhone 8",
        "11.0"
      ],
      "line": 9,
      "id": "github-login;login-with-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "login with username and password",
  "description": "",
  "id": "github-login;login-with-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Emily Website on device \"iPhone 8\" with OS version \"11.0\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Given "
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
  "location": "EmilyLoginSteps.user_is_on_Emily_Website_on_device_with_OS_version(String,String)"
});
formatter.result({
  "duration": 17592797568,
  "status": "passed"
});
});