$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Mohammad Shokriyan"
    }
  ],
  "line": 3,
  "name": "Login page feature",
  "description": "",
  "id": "login-page-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4913001000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate the Logo",
  "description": "",
  "id": "login-page-feature;validate-the-logo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "OrangeHRM logo should displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.orangehrm_logo_should_displayed()"
});
formatter.result({
  "duration": 116654325,
  "status": "passed"
});
formatter.after({
  "duration": 94572250,
  "status": "passed"
});
});