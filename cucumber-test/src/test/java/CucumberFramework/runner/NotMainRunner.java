package CucumberFramework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/featureFiles/contactus.feature"},
        glue = {"CucumberFramework.stepFiles"},
        plugin = {"pretty", "html:target/cucumber",
                "json:target/cucumber-report/cucumberContactus.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
//        tags = {"@Login"}
)
public class NotMainRunner {
}
