package com.vinsquru.tests.vendorportal.model;

//public record VendorPortalTestData(String username,
//                                   String password,
//                                   String monthlyEarning,
//                                   String annualEarning,
//                                   String profitMargin,
//                                   String availableInventory,
//                                   String searchKeyword,
//                                   int searchResultsCount) {
//
//}

public class VendorPortalTestData{
    private String username;
    private String password;
    private String monthlyEarning;
    private String annualEarning;
    private String profitMargin;
    private String availableInventory;
    private String searchKeyword;
    private int searchResultsCount;

    public VendorPortalTestData() {
    }

    public VendorPortalTestData(String username, String password, String monthlyEarning, String annualEarning, String profitMargin, String availableInventory, String searchKeyword, int searchResultsCount) {
        this.username = username;
        this.password = password;
        this.monthlyEarning = monthlyEarning;
        this.annualEarning = annualEarning;
        this.profitMargin = profitMargin;
        this.availableInventory = availableInventory;
        this.searchKeyword = searchKeyword;
        this.searchResultsCount = searchResultsCount;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMonthlyEarning() {
        return monthlyEarning;
    }

    public String getAnnualEarning() {
        return annualEarning;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public String getAvailableInventory() {
        return availableInventory;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public int getSearchResultsCount() {
        return searchResultsCount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMonthlyEarning(String monthlyEarning) {
        this.monthlyEarning = monthlyEarning;
    }

    public void setAnnualEarning(String annualEarning) {
        this.annualEarning = annualEarning;
    }

    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    public void setAvailableInventory(String availableInventory) {
        this.availableInventory = availableInventory;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public void setSearchResultsCount(int searchResultsCount) {
        this.searchResultsCount = searchResultsCount;
    }
}