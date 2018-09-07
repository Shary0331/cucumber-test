$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/featureFiles/contactus.feature");
formatter.feature({
  "line": 1,
  "name": "Submit data to webdriveruniversity using contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity-using-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8535954253,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity-using-contact-us-form;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I access webdriveruniversity contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter a valid firstname",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid last name",
  "rows": [
    {
      "cells": [
        "woods",
        "jackson",
        "jones"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "i enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i enter comments",
  "rows": [
    {
      "cells": [
        "example comment one",
        "example comment two"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the information should successfully be submitted viformatter.before({
  "duration": 8639490492,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "validate promo code alert is visiformatter.result({
  "duration": 1645762875,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_firstname()"
});
formatter.result({
  "duration": 1475189310,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_last_name(DataTable)"
});
formatter.result({
  "duration": 902841489,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_email_address()"
});
formatter.result({
  "duration": 1605260465,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 878917171,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 2347529013,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_information_should_successfully_be_submitted_via_the_contact_us_form()"
});
formatter.result({
  "duration": 801053830,
  "status": "passed"
});
formatter.after({
  "duration": 2316916595,
  "status": "passed"
});
});ProductSteps.user_clicks_on(String)"
});
formatter.result({
  "duration": 500407600,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.user_should_be_presented_with_a_promo_alert()"
});
formatter.result({
  "duration": 2272932128,
  "status": "passed"
});
formatter.after({
  "duration": 2606342614,
  "status": "passed"
});
});