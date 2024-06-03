package dev.etech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "./src/test/resources",
        glue = "dev.etech.steps",
        plugin = {"pretty","html:target/cucumber-reports"}
)
public class RunCucumber {

}