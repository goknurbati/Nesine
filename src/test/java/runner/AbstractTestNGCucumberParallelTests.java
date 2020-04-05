package runner;
import org.testng.annotations.DataProvider;
public abstract class AbstractTestNGCucumberParallelTests{

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return scenarios();
    }

}
