package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D://Users//kevin.laureano-c//IdeaProjects//gitrepotraining//src//test//java//features//LoginViaClickthrough.feature",
        glue = "steps"
)
public class TestRunner {
}
