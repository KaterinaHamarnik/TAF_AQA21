package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private final static String pagePath = "index.php?/dashboard";

    private final By addProjectButton = By.id("sidebar-projects-add");
    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'All Projects')]");


    public TopMenuPage topMenuPage;

    // Блок инициализации страницы
    public DashboardPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    @Override
    public void openPage() {

    }


    // Блок атомарных методов
    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButton);
    }

    public WebElement getHeaderTitleLabel() { return driver.findElement(headerTitleLabelLocator); }

    public boolean isHeaderTitleLabelDisplayed() { return getHeaderTitleLabel().isDisplayed(); }
}
