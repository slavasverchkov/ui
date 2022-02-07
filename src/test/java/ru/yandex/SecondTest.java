package ru.yandex;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.not;

public class SecondTest {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    public void getTest() {
        RestAssured.
                when().get("https://reqres.in/api/users?page=2").
                then().assertThat().statusCode(200).log().all();
    }

    @Test
    public void getStore() {
        Response response = given().baseUri("https://petstore.swagger.io")
                .when().get("/v2/store/order/3")
                .then().assertThat().statusCode(200).log().all().extract().response();

        Assert.assertEquals(200, response.statusCode());


    }

    @Test
    public void postRequest() {
        Response response = given().baseUri("http://httpbin.org")
                .header("Content-type", "application/json")
                .and().log().all()
                .body(requestBody)
                .when()
                .post("/post")
                .then().log().all()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
//        Assertions.assertEquals("name", response.jsonPath().getString("morpheus"));

    }

    private static String requestBody = "{\n" +
            "  \"name\": \"foo\",\n" +
            "  \"job\": \"leader\",\n}";
}

