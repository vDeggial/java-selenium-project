package shinoamakusa.selenium.pageobjects.autotrader.uk.results.filters;

import shinoamakusa.selenium.core.drivers.BrowserDriver;
import shinoamakusa.selenium.core.elements.ByLocator;
import shinoamakusa.selenium.core.elements.BaseElement;
import shinoamakusa.selenium.core.filters.BaseFilter;

public class TotalCountFilter extends BaseFilter {

	public TotalCountFilter(final BrowserDriver driver) {
		super(driver);
		this.locator = ByLocator.className("search-form__count");
	}

	public boolean contains(final String text) {
		BaseElement container = driver.findByLocator(this.locator);
		return container.textContains(text);
	}

	public String value() {
		BaseElement container = driver.findByLocator(this.locator);
		return container.getText().split(" ")[0];
	}

}
