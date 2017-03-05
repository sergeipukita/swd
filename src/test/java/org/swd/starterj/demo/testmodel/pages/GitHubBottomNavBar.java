package org.swd.starterj.demo.testmodel.pages;
 
import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class GitHubBottomNavBar extends AbstractPage {
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/features#code-review\"][text()=\"Code review\"]")
            private WebElement codeReviewLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/features#project-managemen\"][text()=\"Project management\"]")
            private WebElement projectManagementLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/features#integrations\"][text()=\"Integrations\"]")
            private WebElement integrationsLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/features#community-management\"][text()=\"Community\"]")
            private WebElement communityLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/features#documentation\"][text()=\"Documentation\"]")
            private WebElement documentationLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/features#code-hosting\"][text()=\"Code hosting\"]")
            private WebElement codeHostingLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://atom.io\"][text()=\"Atom\"]")
            private WebElement atomLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"http://electron.atom.io/\"][text()=\"Electron\"]")
            private WebElement electronLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://desktop.github.com/\"][text()=\"GitHub Desktop\"]")
            private WebElement gitHubDesktopLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://developer.github.com\"][text()=\"Developers\"]")
            private WebElement developersLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/personal\"][text()=\"Personal\"]")
            private WebElement personalLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/open-source\"][text()=\"Open source\"]")
            private WebElement openSourceLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/business\"][text()=\"For Business\"]")
            private WebElement forBuisinessLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/education\"][text()=\"For Education\"]")
            private WebElement forEducationLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://community.github.com/\"][text()=\"Sponsorships\"]")
            private WebElement sponsorshipsLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://github.com/about\"][text()=\"About\"]")
            private WebElement aboutLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://github.com/blog\"][text()=\"Blog\"]")
            private WebElement blogLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/business/customers\"][text()=\"Customers\"]")
            private WebElement customersLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/about/careers\"][text()=\"Careers\"]")
            private WebElement careersLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"/about/press\"][text()=\"Press\"]")
            private WebElement pressLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://shop.github.com\"][text()=\"Shop\"]")
            private WebElement shopLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://github.com/contact\"][text()=\"Contact GitHub\"]")
            private WebElement contactGitHubLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://help.github.com\"][text()=\"Help\"]")
            private WebElement helpLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://status.github.com/\"][text()=\"Status\"]")
            private WebElement statusLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://github.com/site/terms\"][text()=\"Terms\"]")
            private WebElement termsLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://github.com/site/privacy\"][text()=\"Privacy\"]")
            private WebElement privacyLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://github.com/security\"][text()=\"Security\"]")
            private WebElement securityLink;
        
        
            @FindBy(how=How.XPATH, using="//div[@class=\"site-footer-marketing d-flex flex-wrap py-5 mb-5\"]/descendant::a[@href=\"https://services.github.com/\"][text()=\"Training\"]")
            private WebElement trainingLink;
            
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
        verifyElementVisible("codeReviewLink", codeReviewLink);
        verifyElementVisible("projectManagementLink", projectManagementLink);
        verifyElementVisible("integrationsLink", integrationsLink);
        verifyElementVisible("communityLink", communityLink);
        verifyElementVisible("documentationLink", documentationLink);
        verifyElementVisible("codeHostingLink", codeHostingLink);
        verifyElementVisible("atomLink", atomLink);
        verifyElementVisible("electronLink", electronLink);
        verifyElementVisible("gitHubDesktopLink", gitHubDesktopLink);
        verifyElementVisible("developersLink", developersLink);
        verifyElementVisible("personalLink", personalLink);
        verifyElementVisible("openSourceLink", openSourceLink);
        verifyElementVisible("forBuisinessLink", forBuisinessLink);
        verifyElementVisible("forEducationLink", forEducationLink);
        verifyElementVisible("sponsorshipsLink", sponsorshipsLink);
        verifyElementVisible("aboutLink", aboutLink);
        verifyElementVisible("blogLink", blogLink);
        verifyElementVisible("customersLink", customersLink);
        verifyElementVisible("careersLink", careersLink);
        verifyElementVisible("pressLink", pressLink);
        verifyElementVisible("shopLink", shopLink);
        verifyElementVisible("contactGitHubLink", contactGitHubLink);
        verifyElementVisible("helpLink", helpLink);
        verifyElementVisible("statusLink", statusLink);
        verifyElementVisible("termsLink", termsLink);
        verifyElementVisible("privacyLink", privacyLink);
        verifyElementVisible("securityLink", securityLink);
        verifyElementVisible("trainingLink", trainingLink);
    }
}

//    public static final GitHubBottomNavBar getGitHubBottomNavBar () { 
//        return getPage(GitHubBottomNavBar.class); 
//    }
// 
// 
//    @Test
//    public void testGitHubBottomNavBar ()  throws Throwable {
//        testPage(MyPages.getGitHubBottomNavBar());
//    } 
//    