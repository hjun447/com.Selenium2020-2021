package com.VyTrack.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/VyTrack/StepDefinition",
        dryRun = false,
        tags = "@login_with_roles_ddt_2"
//        plugin = {
//                "html:target/cucumber-html-reports",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"
//        }

)

public class CucumberRunner {

}