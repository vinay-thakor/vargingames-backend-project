package com.virgingames.testsuite;

import com.virgingames.steps.GameSteps;
import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SerenityRunner.class)
public class GameTest extends TestBase {
    @Steps
    GameSteps gameSteps;

    @Test
    @Title("This test will Get timestamp detail")
    public void getGamesFreqDetail() {
        ValidatableResponse response = gameSteps.getGamesFreq().statusCode(200);
        int gameFreq = response.extract().jsonPath().getInt("bingoLobbyInfoResource.streams[3].defaultGameFrequency");
        assertThat(gameFreq, equalTo(300000));
    }

    @Test
    @Title("This test will Get All Games")
    public void getAllGamesDetail() {
        ValidatableResponse response = gameSteps.getAllGames();
        response.statusCode(200);
    }







}
