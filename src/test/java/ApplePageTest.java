import data.Language;
import data.appleTestData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.appleMainPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class ApplePageTest extends appleTestData {
    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(Language.values());
    }

    public ApplePageTest(Language language){
        applebundle= ResourceBundle.getBundle(language.getLanguage());
        if (driver.getCurrentUrl().contains("https://www.apple.com/"+applebundle.getString("language")));
        {
            driver.get("https://www.apple.com/"+applebundle.getString("language"));
            applePage = PageFactory.initElements(driver, appleMainPage.class);
        }
    }

        @Test
                public void testEntertainmentTab(){
            Assert.assertEquals(applebundle.getString("entertainmentTab"), applePage.entertainmentTabTest());
        }

        @Test
    public void testAccessoriesTab(){
        Assert.assertEquals(applebundle.getString("accessoriesTab"), applePage.accessoriesTabTest());
        }

        @Test
    public void testSupportTab(){
        Assert.assertEquals(applebundle.getString("supportTab"),applePage.supportTabTest());
        }
}
