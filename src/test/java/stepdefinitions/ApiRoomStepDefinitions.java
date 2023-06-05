package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class ApiRoomStepDefinitions {
    @Given("send get request to url")
    public void send_get_request_to_url() {
        //Set the url
        spec.pathParams("pp1", "api", "pp2", "rooms").
                queryParam("sort", "createdDate,desc");
        //Set the expected data

        //Send the request and get the response
        Response response = given(spec).get("{pp1}/{pp2}");
        response.prettyPrint();

    }

    @When("validate body")
    public void validate_body() {

    }
}
