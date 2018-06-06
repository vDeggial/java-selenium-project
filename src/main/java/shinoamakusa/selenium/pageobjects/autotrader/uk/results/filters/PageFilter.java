package shinoamakusa.selenium.pageobjects.autotrader.uk.results.filters;

import shinoamakusa.selenium.core.drivers.BrowserDriver;
import shinoamakusa.selenium.core.elements.PageElement;
import shinoamakusa.selenium.core.filters.BaseFilter;

public class PageFilter extends BaseFilter {
	
	public PageFilter(BrowserDriver driver)
	{
		this.driver = driver;
	}
	
	public PageFilter(PageElement element)
	{
		this.container = element;
	}
	
	public PageFilter()
	{
		
	}

}
