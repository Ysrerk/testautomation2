package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // 
    glue = {"StepDefinitions"}, // 
    tags = "@sauce",
    		plugin = {"json:target/cucumber.json"}//
// ozel rapor icin  asagidaki(yukaridaki) sekilde olmali
    //plugin = {"json:target/cucumber.json"}
    //Normal rapor icin asagidaki sekilde kullanabilirsin
    //plugin = {"pretty", "html:target/HtmlReports/htmlreport.html"
     // 
    
    
    //bu kodu cmd ekraninda projenin bulundugu folderda calistirman gerekiyor  running //   mvn clean verify 
    //ozel rapor linki asagida 
    //https://stackoverflow.com/questions/51257224/maven-cucumber-reporting-plugin-is-not-generating-the-report-nothing-happens
)

public class TestRunnercc {

	
	
	
}


