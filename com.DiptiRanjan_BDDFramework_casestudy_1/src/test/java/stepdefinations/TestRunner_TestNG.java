package stepdefinations;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions
(features= "D:\\Eclipse Folder\\com.DiptiRanjan_BDDFramework_casestudy_1\\src\\test\\resources\\Features",
glue ={"stepdefinations"},
monochrome = true,
//plugin = {"pretty",
//		"html:target/cucumber.html",
//		"json:target/cucumber.json",
//        "junit:target/cucumber.xml"},
tags = "@smoketetst")
       
public class TestRunner_TestNG extends AbstractTestNGCucumberTests{
 {
    System.out.println("TestNg report is generated");
 }
}
//{"pretty","html:target/cucumber.html"}
//{"pretty","json:target/cucumber.json"}
//{"pretty","xml:target/cucumber.xml"}
//{"pretty","json:target/cucumber.junit"}