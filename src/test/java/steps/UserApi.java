package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UserApi {
    private String hostUrl= "https://dev.api.business.tikkie.me/api/v1";
    private Response response;
    private ValidatableResponse json;
    String url;
    Map<String, String> query;
    Map<String, String> body;

    @Given("^I performs a get request to \"([^\"]*)\"$")
    public void a_user_performs_a_get_request_to_something(String resourceUrl) throws Throwable {
            url = hostUrl + resourceUrl;
    }


    @When("^I add the following parameters$")
    public void i_add_the_following_parameters(DataTable dataTable) throws Throwable {
        query = new LinkedHashMap<String, String>();
        for (DataTableRow row:dataTable.getGherkinRows()){
            query.put(row.getCells().get(0),row.getCells().get(1));
        }
    }

    @When("^and perform the get request$")
    public void and_perform_the_request() throws Throwable {
        if (query==null) {
            response = given().when().get(url);
        }
        else
        {
            response=given().queryParams(query).when().get(url);
        }
    }

    @Then("^the response code should be (\\d+)")
    public void the_response_code_should_be_200(int statusCode) throws Throwable {
        json = response.then().statusCode(statusCode);
    }

}
