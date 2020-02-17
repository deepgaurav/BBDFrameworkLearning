$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title of Login Page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters UserName and User enters Password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "loginDefinition.User_is_on_Login_Page()"
});
formatter.result({
  "duration": 6342814200,
  "status": "passed"
});
formatter.match({
  "location": "loginDefinition.Title_of_Login_Page_is_Free_CRM()"
});
formatter.result({
  "duration": 3030801500,
  "status": "passed"
});
formatter.match({
  "location": "loginDefinition.User_enters_UserName_and_User_enters_Password()"
});
formatter.result({
  "duration": 5449045900,
  "status": "passed"
});
formatter.match({
  "location": "loginDefinition.User_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 68371200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Add contacts",
  "description": "Given",
  "id": "free-crm-login-feature;add-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
});