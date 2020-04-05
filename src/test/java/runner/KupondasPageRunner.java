package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinition"},
        features = {"C://Users//TB5EC//IdeaProjects//Nesine//Features//Kupondas.feature"})
    public class KupondasPageRunner extends AbstractTestNGCucumberParallelTests {

    @BeforeClass
    public static void before() {
        System.out.println("Before - "+System.currentTimeMillis());
    }

    @AfterClass
    public static void after() {
        System.out.println("After - "+System.currentTimeMillis());
    }
}