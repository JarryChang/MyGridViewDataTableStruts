package com.action;

import java.util.List;
import com.model.RevenueReport;
import com.opensymphony.xwork2.Action;
import com.service.BusinessService;

public class GridViewAction implements Action {

	private List<RevenueReport> aaData;
	
	public List<RevenueReport> getAaData() {
         return aaData;
    }

    public void setAaData(List<RevenueReport> aaData) {
         this.aaData = aaData;
    }
 
	@Override
	public String execute() throws Exception {
		 aaData = BusinessService.getCompanyList();
         return SUCCESS;
	}

}
