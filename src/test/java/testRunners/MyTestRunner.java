package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/features"},
        glue = {"com/stepDefinition", "ApplicationHooks"},
        plugin = {"pretty",
        },
        publish = true

)
public class MyTestRunner {

}
