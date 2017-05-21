package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// Give the location of feature file. All the feature files in this location will be considered. Test class will be searched within the same package or sub-packages
//@CucumberOptions(features="src/test/resources")

//Use tag option to manage the scenarios to be executed. The tag should be added in feature file on top of the scenario.
//@tag-name to include, ~@tag-name to exclude
//@CucumberOptions(features="src/test/resources", tags={"@ReadyToTest"})

//multiple tags within {} and work in "OR" condition - executes all matching scenarios
//@CucumberOptions(features="src/test/resources", tags={"@ReadyToTest,@ForUnitTest"})

@CucumberOptions(features="src/test/resources", tags={"@TestUI"})

//One scenario can have multiple tags? how it works?
//@CucumberOptions(features="src/test/resources", tags={"@tag1","@tag2"})


// To limit the test execution to a specific file, give the name of feature file
//@CucumberOptions(features="src/test/resources/UserStory1.feature")

//Use glue option to set the location of the test class, if its in a different package than the Driver class
//@CucumberOptions(features="src/test/resources" glue="src/test/alternatefolder")
public class CucumberTestDriver {

}
