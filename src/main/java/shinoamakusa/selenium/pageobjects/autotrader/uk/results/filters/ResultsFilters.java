package shinoamakusa.selenium.pageobjects.autotrader.uk.results.filters;

import shinoamakusa.selenium.core.drivers.BrowserDriver;

public class ResultsFilters {
	private TotalCountFilter countFilter;
	private RadiusFilter radius;
	private PostalCodeFilter postal;

	public ResultsFilters(BrowserDriver driver) {
		countFilter = new TotalCountFilter(driver);
		radius = new RadiusFilter(driver);
		postal = new PostalCodeFilter(driver);

	}

	public TotalCountFilter countFilter() {
		return countFilter;
	}

	public RadiusFilter radius() {
		return radius;
	}

	public PostalCodeFilter postal() {
		return postal;
	}

}