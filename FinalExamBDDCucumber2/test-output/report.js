$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/techfios.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios Page",
  "description": " As a user I want to change the background color",
  "id": "techfios-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8514624000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background",
  "description": "",
  "id": "techfios-page;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the SkyBluebutton",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "TechfiosSteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 145728200,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.i_click_on_the_SkyBluebutton()"
});
formatter.result({
  "duration": 58831400,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 26327600,
  "status": "passed"
});
formatter.after({
  "duration": 678223000,
  "status": "passed"
});
formatter.before({
  "duration": 6131274900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "White Background Change",
  "description": "",
  "id": "techfios-page;white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on the Whitebutton",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "TechfiosSteps.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 35641600,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.i_click_on_the_Whitebutton()"
});
formatter.result({
  "duration": 156433400,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 35426500,
  "status": "passed"
});
formatter.after({
  "duration": 722327800,
  "status": "passed"
});
});