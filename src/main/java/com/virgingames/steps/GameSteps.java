package com.virgingames.steps;


import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GameSteps {


    @Step("Getting All Games information")
    public ValidatableResponse getAllGames() {

        return SerenityRest.rest()
                .given()
                .log()
                .all()
                .contentType(ContentType.TEXT)

                .when()
                .log()
                .all()
                .get(EndPoints.END_POINT)

                .then();
    }

    @Step("Getting Game Frequency information")
    public ValidatableResponse getGamesFreq() {

        return SerenityRest.rest()
                .given()
                .log()
                .all()
                .contentType(ContentType.TEXT)

                .when()
                .log()
                .all()
                .get(EndPoints.END_POINT)

                .then();
    }



}
