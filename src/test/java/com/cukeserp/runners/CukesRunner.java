package com.cukeserp.runners;


import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

@RunWith ( Cucumber.class )
@CucumberOptions (
        plugin = {
                "json:target/cucumber.json" ,
                "html:target/cucumber/" ,
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com.cukeserp.step_definitions"
        ,dryRun = false
        ,tags = "@runMe"
        ,monochrome=true

)
public class CukesRunner {
}

//    @Before
//    public void setUp(){
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Driver.getDriver().manage().window().maximize();
//    }
//
//    @After
//    public void tearDown(Scenario scenario){
//        System.out.println("I am reporting the results");
//        // I want to take screenshot when current scenario fails.
//        // scenario.isFailed()  --> tells if the scenario failed or not
//        if (scenario.isFailed()) {
//            // this line is for taking screenshot
//            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            // this line is adding the screenshot to the report
//            scenario.embed(screenshot, "image/png");
//        }
//
//        System.out.println("Closing driver");
//      //  Driver.closeDriver();
//    }


