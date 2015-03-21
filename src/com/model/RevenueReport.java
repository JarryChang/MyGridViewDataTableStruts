package com.model;

public class RevenueReport {
	public RevenueReport(String company, String country, String year,
            String revenue) {
	    this.company = company;
	    this.country = country;
	    this.year = year;
	    this.revenue = revenue;
	}
	
	private String company;
	private String country;
	private String year;
	private String revenue;
	
	public String getCountry() {
	    return country;
	}
	
	public String getRevenue() {
	    return revenue;
	}
	
	public String getCompany() {
	    return company;
	}
	
	public String getYear() {
	    return year;
	}
	
	public void setCountry(String country) {
	    this.country = country;
	}
	
	public void setRevenue(String revenue) {
	    this.revenue = revenue;
	}
	
	public void setCompany(String company) {
	    this.company = company;
	}
	
	public void setYear(String year) {
	    this.year = year;
	}
}
