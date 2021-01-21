package com.hatanaka.springcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:build/cucumber-api-report.json"}, features = "classpath:features")
class SpringCucumberApplicationTests {

}
