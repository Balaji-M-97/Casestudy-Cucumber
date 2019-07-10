$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/casestudy/scenario1.feature");
formatter.feature({
  "name": "Testme App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "url of testmeapp \"http://10.232.237.143:443/TestMeApp/fetchcat.htm\"",
  "keyword": "Given "
});
formatter.match({
  "location": "scenario1.url_of_testmeapp(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on signup",
  "keyword": "When "
});
formatter.match({
  "location": "scenario1.user_click_on_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"ramprasathm\" as username",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"ram\" as firstname",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"prasathm\" as lastname",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"ram12345\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"ram12345\" as confirmpassword",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_confirmpassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click gender as male",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.click_gender_as_male()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"ramp@gmail.com\" as email",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"9944583945\" as mobileno",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_mobileno(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"12/12/1999\" as dob",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_dob(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"cbe\" as address",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select birth place as securityques",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_select_birth_place_as_securityques()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters answer as \"ooty\"",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_answer_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on register",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check user in sign-in page",
  "keyword": "Then "
});
formatter.match({
  "location": "scenario1.check_user_in_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
});