$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("userapi.feature");
formatter.feature({
  "line": 1,
  "name": "To test userapi",
  "description": "",
  "id": "to-test-userapi",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To valide getUser call",
  "description": "",
  "id": "to-test-userapi;to-valide-getuser-call",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@TestSuite"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I performs a get request to \"/api/articles.json\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "and perform the get request",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "/api/articles.json",
      "offset": 29
    }
  ],
  "location": "UserApi.a_user_performs_a_get_request_to_something(String)"
});
formatter.result({
  "duration": 85225929,
  "status": "passed"
});
formatter.match({
  "location": "UserApi.and_perform_the_request()"
});
formatter.result({
  "duration": 1520107436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 28
    }
  ],
  "location": "UserApi.the_response_code_should_be_200(int)"
});
formatter.result({
  "duration": 25235541,
  "status": "passed"
});
});