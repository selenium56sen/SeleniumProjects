$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/DemoWebShop.feature");
formatter.feature({
  "name": "DemoWebShop",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches DemoWebShop website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launches_DemoWebShop_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter login details from excel \u0027src/test/resources/excel/Login.xlsx\u0027 from sheetname \u0027LoginDetails\u0027 and click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_enter_login_details_from_excel_from_sheetname_and_click_on_login_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be taken to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_should_be_taken_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});