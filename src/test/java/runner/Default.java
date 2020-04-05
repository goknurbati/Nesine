package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.*;

@CucumberOptions(
        glue = {"stepDefinition"},
        features = {"C://Users//TB5EC//IdeaProjects//Nesine//Features//LoginPage.feature"})

public class Default extends AbstractTestNGCucumberParallelTests {

    private static long duration;

    @BeforeClass
    public static void before() {
        duration = System.currentTimeMillis();
        System.out.println("Thread Id  | Scenario Num       | Step Count");
    }

    @AfterClass
    public static void after() {
        duration = System.currentTimeMillis() - duration;
        System.out.println("DURATION - "+ duration);
    }
}
