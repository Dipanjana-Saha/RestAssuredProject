package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//how do u dedcide which runner u want to use?
//depnds on the assertion we use in the code if u use assertion thgen testng if JunitAssertion then junit
//cucumber-depends on-->testng,junit
@CucumberOptions(features="src/test/java/cucumber",tags="@Regression",glue="Dipanjana.stepDefinations",monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
