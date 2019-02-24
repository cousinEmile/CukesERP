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
<<<<<<< HEAD
        features = "src/test/resources/features/SearchFunctionality/Merry_feature",
=======
        features = "src/test/resources/features/SingularFunctionalities/Victoria_feature",
>>>>>>> 4c3316ac6f18bdfb7ab187211d67cb8d335ccd3d
        glue = "com.cukeserp.step_definitions"
        ,dryRun = false
        ,tags = "@wip"
      // ,monochrome=true

)
public class CukesRunner {


}

