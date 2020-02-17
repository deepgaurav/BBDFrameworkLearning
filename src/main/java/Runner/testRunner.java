package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\shipra.parihar\\Desktop\\FreeCrmBDDFramework\\src\\main\\java\\Features"
               ,glue={"stepDefinitions"}
              ,format= {"pretty","html:test-outout","json:json_output/cucumber.json"},
              dryRun= false, //to check mapping proper between feature file and step definition file
        monochrome =true, //display  the console output in proper readable format
        strict = true //it will check if any step is not define inside logindefinitionfile

)


public class testRunner {
}
