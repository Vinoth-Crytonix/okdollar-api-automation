

package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class LoginSteps {
    Response response;

    @Given("I hit the OKDollar login API with username {string} and password {string}")
    public void hitLoginAPI(String username, String password) {
        String requestBody = String.format("{\"UserName\":\"%s\", \"Password\":\"%s\"}", username, password);

        response = given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .post("http://uat.skservices.okdollar.org/RestService.svc/GetLoginResponse");
    }

    @Then("I should get status code 200")
    public void validateStatusCode() {
        assertEquals(response.statusCode(), 200, "Expected status code 200");
        System.out.println("Response body:\n" + response.getBody().asPrettyString());
    }
}
