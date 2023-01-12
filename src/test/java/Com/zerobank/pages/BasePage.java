package Com.zerobank.pages;

import Com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

}
