package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMHomePage {
	
	
	@FindBy(id="menu_admin_viewAdminModule") 
	WebElement adminModule;
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]") WebElement pimModule;
	@FindBy(xpath="//*[@id=\"menu_leave_viewLeaveModule\"]") WebElement leaveModule;
	@FindBy(xpath="//*[@id=\"menu_time_viewTimeModule\"]") WebElement TimeModule;
	@FindBy(xpath="//*[@id=\"menu_recruitment_viewRecruitmentModule\"]") WebElement recruitmentModule;
	@FindBy(xpath="//*[@id=\"menu_dashboard_index\"]") WebElement dashboardModule;
	@FindBy(xpath="//*[@id=\"menu_directory_viewDirectory\"]") WebElement directoryModule ;
	@FindBy(xpath="//*[text()=\"Maintenance\"]") WebElement maintenanceModule;
	@FindBy(xpath="//*[text()=\"Performance\"]") WebElement  performanceElement;
	@FindBy(xpath="//*[@id=\"menu_performance_viewEmployeePerformanceTrackerList\"]") WebElement employeePerformanceTracker ;

}
