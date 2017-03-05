//////////////////////////////////////////////////////////////////////////////////
// Create a new class inside the package: 
// (Test Packages) → org.swd.starterj.demo.testmodel.pages 
//   with name "GitHubHomePage"
// and put the following page-object code there:
//////////////////////////////////////////////////////////////////////////////////
package org.swd.starterj.demo.testmodel.pages;
 
import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class GitHubHomePage extends AbstractPage {
        
            @FindBy(how=How.XPATH, using="//form[@method=\"post\"]//button[@type=\"submit\"][text()=\"Sign up for GitHub\"]")
            private WebElement formBottonSignUp;
        
        
            @FindBy(how=How.XPATH, using="//form[@method=\"post\"]//input[@id=\"user[login]\"]")
            private WebElement formFieldUserName;
        
        
            @FindBy(how=How.XPATH, using="//form[@method=\"post\"]//input[@id=\"user[email]\"]")
            private WebElement formFieldEmail;
        
        
            @FindBy(how=How.XPATH, using="//form[@method=\"post\"]//input[@id=\"user[password]\"]")
            private WebElement formFieldCreatePassword;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-header-menu\"]/div[@class=\"site-header-actions\"]/descendant::input[@placeholder=\"Search GitHub\"]")
            private WebElement headerActionSearch;
        
        
            @FindBy(how=How.XPATH, using="//a[@href=\"https://github.com/\"][@aria-label=\"Homepage\"]")
            private WebElement navigationBarHome;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-header-menu\"]/nav/a[@href=\"/explore\"]")
            private WebElement navigationBarExplore;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-header-menu\"]/nav/a[@href=\"/pricing\"]")
            private WebElement navigationBarPricing;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-header-menu\"]/nav/a[@href=\"/features\"]")
            private WebElement navigationBarFeatures;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-header-menu\"]/div[@class=\"site-header-actions\"]/a[@href=\"/login\"][text()=\"Sign in\"]")
            private WebElement headerActionSignIn;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-header-menu\"]/div[@class=\"site-header-actions\"]/a[@href=\"/join?source=header-home\"][text()=\"Sign up\"]")
            private WebElement headerActionSignUp;
        
        
            @FindBy(how=How.XPATH, using="//head/link[@href=\"https://github.com/\"]")
            private WebElement pageLink;
        
 
    @Override
    public void invoke() {
    	if (!isDisplayed()) {
            getDriver().get("https://github.com");
    	}
    }
 
    @Override
    public boolean isDisplayed() {
    	return with(pageLink).isDisplayedSafe();
        
    }
 
    @Override
    public void verifyExpectedElementsAreDisplayed()  throws Throwable {
        verifyElementVisible("formBottonSignUp", formBottonSignUp);
        verifyElementVisible("formFieldUserName", formFieldUserName);
        verifyElementVisible("formFieldEmail", formFieldEmail);
        verifyElementVisible("formFieldCreatePassword", formFieldCreatePassword);
        verifyElementVisible("headerActionSearch", headerActionSearch);
        verifyElementVisible("navigationBarHome", navigationBarHome);
        verifyElementVisible("navigationBarExplore", navigationBarExplore);
        verifyElementVisible("navigationBarPricing", navigationBarPricing);
        verifyElementVisible("navigationBarFeatures", navigationBarFeatures);
        verifyElementVisible("headerActionSignIn", headerActionSignIn);
        verifyElementVisible("headerActionSignUp", headerActionSignUp);
     }
}
/// END OF PAGE-OBJECT FILE
    
//////////////////////////////////////////////////////////////////////////////////
// Now open the class MyPages at the following location:
//   (Test Packages) → org.swd.starterj.demo.testmodel → MyPages.java
// And put the following code after the line 
// “Put your new pages here:”
//////////////////////////////////////////////////////////////////////////////////
 
 
 
//    public static final GitHubHomePage getGitHubHomePage () { 
//        return getPage(GitHubHomePage.class); 
//    }
// 
     
/// END OF SIMPLE, BUT IMPORTANT TASK
  
//////////////////////////////////////////////////////////////////////////////////
// Now switch to Test project (org.swd.starterj.demo). Open the file:
//   Smoke_test_for_each_pageobject.java
// And put the following code after the line 
// “Add testMethods for your new pages here:”
//////////////////////////////////////////////////////////////////////////////////
 
//    @Test
//    public void testGitHubHomePage ()  throws Throwable {
//        testPage(MyPages.getGitHubHomePage());
//    } 
    
/// END OF TEST. Now it's time to run the test... And implement Invoke() and Exists()