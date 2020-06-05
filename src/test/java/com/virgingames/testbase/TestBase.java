package com.virgingames.testbase;

import com.virgingames.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import com.virgingames.constants.Path;

public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void inIt() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
       RestAssured.basePath =
        RestAssured.basePath = Path.PATH;

    }

}