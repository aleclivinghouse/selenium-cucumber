package runners;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin={"json:target/RunCuke/cucumber.json", "pretty",
			"html:target/RunCuke/cucumber.html", 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		 },
			features={"src/test/resources/FeatureFiles/SearchCars.feature", "src/test/resources/FeatureFiles/UsedCarSaleSearch.feature"},
			glue="steps"
			
		)


public class RunCuke extends AbstractTestNGCucumberTests {
	@BeforeClass
	public static void setup() {

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir") + "/target/Extent_Reports" + strDate + ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser Version", "86.0.4240.80");
		ExtentCucumberFormatter.addSystemInfo("Selenium Version", "3.9.1");
		
	
	}//setup end
} //class end


//goes in plugin
