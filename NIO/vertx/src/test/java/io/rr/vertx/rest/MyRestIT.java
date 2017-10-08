package io.rr.vertx.rest;

import com.jayway.restassured.RestAssured;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author romanr on 12/29/2016.
 */
public class MyRestIT {

    @BeforeClass
    public static void configureRestAssured() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = Integer.getInteger("http.port", 8083);
    }

    @AfterClass
    public static void unconfigureRestAssured() {
        RestAssured.reset();
    }

    @Test
    public void checkThatWeCanRetrieveIndividualProduct() {
        // Get the list of cars, ensure it's a success and extract the first id.
        final int id = get("/api/cars").then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath().getInt("find { it.model=='Octavia' }.id");
        // Now get the individual resource and check the content
        get("/api/cars/" + id).then()
                .assertThat()
                .statusCode(200)
                .body("brand", equalTo("Skoda"))
                .body("model", equalTo("Octavia"))
                .body("id", equalTo(id));
    }

    @Test
    public void checkWeCanAddAndDeleteAProduct() {
        // Create a new ca and retrieve the result (as a Car instance).
        Car car = given()
                .body("{\"brand\":\"VW\", \"model\":\"Sharan\"}").request().post("/api/cars").thenReturn().as(Car.class);
        assertThat(car.getBrand()).isEqualToIgnoringCase("VW");
        assertThat(car.getModel()).isEqualToIgnoringCase("Sharan");
        assertThat(car.getId()).isNotZero();
        // Check that it has created an individual resource, and check the content.
        get("/api/cars/" + car.getId()).then()
                .assertThat()
                .statusCode(200)
                .body("brand", equalTo("VW"))
                .body("model", equalTo("Sharan"))
                .body("id", equalTo(car.getId()));
        // Delete the car
        delete("/api/cars/" + car.getId()).then().assertThat().statusCode(204);
        // Check that the resource is not available anymore
        get("/api/cars/" + car.getId()).then()
                .assertThat()
                .statusCode(404);
    }
}
