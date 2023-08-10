package stepdefinations;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions
(features= "D:\\Eclipse Folder\\com.DiptiRanjan_BDDFramework_casestudy_1\\src\\test\\resources\\Features",
glue ={"stepdefinations"},
monochrome = true,strict = true,
plugin = {"pretty",
		"html:target/cucumber.html",
		"json:target/cucumber.json",
        "junit:target/cucumber.xml"},
tags = "@smoketetst")
       
public class TestRunner_Junit extends AbstractTestNGCucumberTests{
{
 
}
}
//{"pretty","html:target/cucumber.html"}
//{"pretty","json:target/cucumber.json"}
//{"pretty","xml:target/cucumber.xml"}
//{"pretty","json:target/cucumber.junit"}