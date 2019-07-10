package casestudy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},features= {"src/test/resources/casestudy/scenario1.feature","src/test/resources/casestudy/scenario2.feature","src/test/resources/casestudy/Scenario3.feature",
		"src/test/resources/casestudy/Scenario4.feature"	},
monochrome=true)
public class Runcucumber {
}
