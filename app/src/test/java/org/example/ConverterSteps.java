package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterSteps {

    private App converter;
    private double result;

    @Given("I have a currency converter")
    public void i_have_a_currency_converter() {
        converter = new App();
    }

    @When("I convert euros to yen")
    public void i_convert_euros_to_yen() {
        result = converter.yenConverter();
    }

    @Then("the result should be {double}")
    public void converted_amount_is(Double expected) {
        assertEquals(expected, result, 0.01); // tolerance for decimals
    }
}