package runner99;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features99",glue="stepdef99",plugin= {"json:target/cucumber.json"})
public class Runner999 {
	
}
