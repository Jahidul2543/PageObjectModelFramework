package rest;

import base.CommonAPI;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestJsonData extends CommonAPI {
    //TC 01
    @Test(groups = "testJsonData")
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
        ValidatableResponse response = given().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").
                then().statusCode(200).assertThat()
                .body("[0]._id", equalTo("590a4acd35522970c7956cdf"));

        response.body("[1]._id", equalTo("590a4ada35522970c7956ce2"));
        response.body("[2]._id", equalTo("590a662d35522974d98a343a"));
    }
}
