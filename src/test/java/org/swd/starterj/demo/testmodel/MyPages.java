package org.swd.starterj.demo.testmodel;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.swd.starterj.demo.testmodel.pages.*;

public class MyPages {
    
    private static <T extends AbstractPage> T getPage(Class<T> pageObjectClass)
    {
        T newInstance = null;
        
        try {
            newInstance = pageObjectClass.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(MyPages.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  newInstance;
    }
    

	public static final GitHubBottomNavBar getGitHubBottomNavBar() {
		return getPage(GitHubBottomNavBar.class);
	}

	public static final GitHubHomePage getGitHubHomePage() {
		return getPage(GitHubHomePage.class);
	}
	
	public static final GitHubLoginPage getGithubLoginPage () { 
      return getPage(GitHubLoginPage.class); 
	}

    
    // Put your new pages here:
}
