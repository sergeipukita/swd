
package org.swd.starterj.demo.testmodel.pages;
 
import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class GitHubLoginPage extends AbstractPage {
        
            @FindBy(how=How.ID, using="login_field")
            private WebElement loginField;
        
        
            @FindBy(how=How.ID, using="password")
            private WebElement passwordField;
        
        
            @FindBy(how=How.XPATH, using="//div[@id=\"login\"]//form[@method=\"post\"]//input[@type=\"submit\"]")
            private WebElement bottonSignIn;
        
 
	@Override
	public void invoke() {
		if (!isDisplayed()) {
			getDriver().get("https://github.com/login");
		}
	}

	@Override
	public boolean isDisplayed() {
		return with(bottonSignIn).isDisplayedSafe();

	}
 
    @Override
    public void verifyExpectedElementsAreDisplayed()  throws Throwable {
        verifyElementVisible("loginField", loginField);
        verifyElementVisible("passwordField", passwordField);
        verifyElementVisible("bottonSignIn", bottonSignIn);
    }
}

 

//    @Test
//    public void testGithubLoginPage ()  throws Throwable {
//        testPage(MyPages.getGithubLoginPage());
//    } 
    