package com.celtic.automation.cmcs.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt",
				"json:target/cucumber-reportreport.json"},
		monochrome = true,
		publish = true,
		glue = {"com/celtic/automation/cmcs/parallel","com/celtic/automation/cmcs/apphooks" },
		features = {"src/test/resources/parallel/RWC001.feature","src/test/resources/parallel/RWC003.feature"}
		)


public class ParallelTestRunner extends AbstractTestNGCucumberTests{
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
	}
