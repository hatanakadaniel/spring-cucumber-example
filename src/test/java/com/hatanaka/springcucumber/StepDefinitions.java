package com.hatanaka.springcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class StepDefinitions extends SpringIntegrationTest {

    @Given("uma request para minha feature")
    public void umaRequestParaMinhaFeature() {
    }

    @When("fizer um {string} para resource {string}")
    public void fizerUmParaResource(String arg0, String arg1) {
    }

    @Then("deve retornar {int}")
    public void deveRetornar(int httpStatus) {
        Assertions.assertThat(httpStatus).isEqualTo(201);
    }
}
