//package com.subwayTest.subway.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//import java.util.Date;
//
//@Entity
//public class Subway {
//    @Id
//    public int id;
//
//    public String storeNum;
//    public Date weekEndingDate;
//    public String vendorId;
//    public String vendorName;
//    public String vendorCountry;
//    public String customerType;
//    public Float day1Sales;
//    public Float day2Sales;
//    public Float day3Sales;
//    public Float day4Sales;
//    public Float day5Sales;
//    public Float day6Sales;
//    public Float day7Sales;
//    public Float partySales;
//    public Float drinkSales;
//    public Float miscSales;
//    public Integer numberOfFootlongs;
//    public Integer numberOfSixInch;
//    public Integer numberOfFourInch;
//    public Integer numberOfSaladPlates;
//    public Integer numberOfDrinks;
//    public Float hoursOpened;
//    public Float hoursWorked;
//    public Integer numberOfTransactions;
//
////    public Subway(Integer id, String storeNum, Date weekEndingDate, String vendorId, String vendorName, String vendorCountry, String customerType, Float day1Sales, Float day2Sales, Float day3Sales, Float day4Sales, Float day5Sales, Float day6Sales, Float day7Sales, Float partySales, Float drinkSales, Float miscSales, Integer numberOfFootlongs, Integer numberOfSixInch, Integer numberOfFourInch, Integer numberOfSaladPlates, Integer numberOfDrinks, Float hoursOpened, Float hoursWorked, Integer numberOfTransactions) {
////        this.id = id;
////        this.storeNum = storeNum;
////        this.weekEndingDate = weekEndingDate;
////        this.vendorId = vendorId;
////        this.vendorName = vendorName;
////        this.vendorCountry = vendorCountry;
////        this.customerType = customerType;
////        this.day1Sales = day1Sales;
////        this.day2Sales = day2Sales;
////        this.day3Sales = day3Sales;
////        this.day4Sales = day4Sales;
////        this.day5Sales = day5Sales;
////        this.day6Sales = day6Sales;
////        this.day7Sales = day7Sales;
////        this.partySales = partySales;
////        this.drinkSales = drinkSales;
////        this.miscSales = miscSales;
////        this.numberOfFootlongs = numberOfFootlongs;
////        this.numberOfSixInch = numberOfSixInch;
////        this.numberOfFourInch = numberOfFourInch;
////        this.numberOfSaladPlates = numberOfSaladPlates;
////        this.numberOfDrinks = numberOfDrinks;
////        this.hoursOpened = hoursOpened;
////        this.hoursWorked = hoursWorked;
////        this.numberOfTransactions = numberOfTransactions;
////    }
//
//    public Subway( String storeNum, Date weekEndingDate, String vendorId, String vendorName, String vendorCountry, String customerType, Float day1Sales, Float day2Sales, Float day3Sales, Float day4Sales, Float day5Sales, Float day6Sales, Float day7Sales, Float partySales, Float drinkSales, Float miscSales, Integer numberOfFootlongs, Integer numberOfSixInch, Integer numberOfFourInch, Integer numberOfSaladPlates, Integer numberOfDrinks, Float hoursOpened, Float hoursWorked, Integer numberOfTransactions) {
//        this.storeNum = storeNum;
//        this.weekEndingDate = weekEndingDate;
//        this.vendorId = vendorId;
//        this.vendorName = vendorName;
//        this.vendorCountry = vendorCountry;
//        this.customerType = customerType;
//        this.day1Sales = day1Sales;
//        this.day2Sales = day2Sales;
//        this.day3Sales = day3Sales;
//        this.day4Sales = day4Sales;
//        this.day5Sales = day5Sales;
//        this.day6Sales = day6Sales;
//        this.day7Sales = day7Sales;
//        this.partySales = partySales;
//        this.drinkSales = drinkSales;
//        this.miscSales = miscSales;
//        this.numberOfFootlongs = numberOfFootlongs;
//        this.numberOfSixInch = numberOfSixInch;
//        this.numberOfFourInch = numberOfFourInch;
//        this.numberOfSaladPlates = numberOfSaladPlates;
//        this.numberOfDrinks = numberOfDrinks;
//        this.hoursOpened = hoursOpened;
//        this.hoursWorked = hoursWorked;
//        this.numberOfTransactions = numberOfTransactions;
//    }
//
//    public Subway() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getStoreNum() {
//        return storeNum;
//    }
//
//    public void setStoreNum(String storeNum) {
//        this.storeNum = storeNum;
//    }
//
//    public Date getWeekEndingDate() {
//        return weekEndingDate;
//    }
//
//    public void setWeekEndingDate(Date weekEndingDate) {
//        this.weekEndingDate = weekEndingDate;
//    }
//
//    public String getVendorId() {
//        return vendorId;
//    }
//
//    public void setVendorId(String vendorId) {
//        this.vendorId = vendorId;
//    }
//
//    public String getVendorName() {
//        return vendorName;
//    }
//
//    public void setVendorName(String vendorName) {
//        this.vendorName = vendorName;
//    }
//
//    public String getVendorCountry() {
//        return vendorCountry;
//    }
//
//    public void setVendorCountry(String vendorCountry) {
//        this.vendorCountry = vendorCountry;
//    }
//
//    public String getCustomerType() {
//        return customerType;
//    }
//
//    public void setCustomerType(String customerType) {
//        this.customerType = customerType;
//    }
//
//    public Float getDay1Sales() {
//        return day1Sales;
//    }
//
//    public void setDay1Sales(Float day1Sales) {
//        this.day1Sales = day1Sales;
//    }
//
//    public Float getDay2Sales() {
//        return day2Sales;
//    }
//
//    public void setDay2Sales(Float day2Sales) {
//        this.day2Sales = day2Sales;
//    }
//
//    public Float getDay3Sales() {
//        return day3Sales;
//    }
//
//    public void setDay3Sales(Float day3Sales) {
//        this.day3Sales = day3Sales;
//    }
//
//    public Float getDay4Sales() {
//        return day4Sales;
//    }
//
//    public void setDay4Sales(Float day4Sales) {
//        this.day4Sales = day4Sales;
//    }
//
//    public Float getDay5Sales() {
//        return day5Sales;
//    }
//
//    public void setDay5Sales(Float day5Sales) {
//        this.day5Sales = day5Sales;
//    }
//
//    public Float getDay6Sales() {
//        return day6Sales;
//    }
//
//    public void setDay6Sales(Float day6Sales) {
//        this.day6Sales = day6Sales;
//    }
//
//    public Float getDay7Sales() {
//        return day7Sales;
//    }
//
//    public void setDay7Sales(Float day7Sales) {
//        this.day7Sales = day7Sales;
//    }
//
//    public Float getPartySales() {
//        return partySales;
//    }
//
//    public void setPartySales(Float partySales) {
//        this.partySales = partySales;
//    }
//
//    public Float getDrinkSales() {
//        return drinkSales;
//    }
//
//    public void setDrinkSales(Float drinkSales) {
//        this.drinkSales = drinkSales;
//    }
//
//    public Float getMiscSales() {
//        return miscSales;
//    }
//
//    public void setMiscSales(Float miscSales) {
//        this.miscSales = miscSales;
//    }
//
//    public Integer getNumberOfFootlongs() {
//        return numberOfFootlongs;
//    }
//
//    public void setNumberOfFootlongs(Integer numberOfFootlongs) {
//        this.numberOfFootlongs = numberOfFootlongs;
//    }
//
//    public Integer getNumberOfSixInch() {
//        return numberOfSixInch;
//    }
//
//    public void setNumberOfSixInch(Integer numberOfSixInch) {
//        this.numberOfSixInch = numberOfSixInch;
//    }
//
//    public Integer getNumberOfFourInch() {
//        return numberOfFourInch;
//    }
//
//    public void setNumberOfFourInch(Integer numberOfFourInch) {
//        this.numberOfFourInch = numberOfFourInch;
//    }
//
//    public Integer getNumberOfSaladPlates() {
//        return numberOfSaladPlates;
//    }
//
//    public void setNumberOfSaladPlates(Integer numberOfSaladPlates) {
//        this.numberOfSaladPlates = numberOfSaladPlates;
//    }
//
//    public Integer getNumberOfDrinks() {
//        return numberOfDrinks;
//    }
//
//    public void setNumberOfDrinks(Integer numberOfDrinks) {
//        this.numberOfDrinks = numberOfDrinks;
//    }
//
//    public Float getHoursOpened() {
//        return hoursOpened;
//    }
//
//    public void setHoursOpened(Float hoursOpened) {
//        this.hoursOpened = hoursOpened;
//    }
//
//    public Float getHoursWorked() {
//        return hoursWorked;
//    }
//
//    public void setHoursWorked(Float hoursWorked) {
//        this.hoursWorked = hoursWorked;
//    }
//
//    public Integer getNumberOfTransactions() {
//        return numberOfTransactions;
//    }
//
//    public void setNumberOfTransactions(Integer numberOfTransactions) {
//        this.numberOfTransactions = numberOfTransactions;
//    }
//
//    @Override
//    public String toString() {
//        return "Subway{" +
//                "id=" + id +
//                ", storeNum='" + storeNum + '\'' +
//                ", weekEndingDate=" + weekEndingDate +
//                ", vendorId='" + vendorId + '\'' +
//                ", vendorName='" + vendorName + '\'' +
//                ", vendorCountry='" + vendorCountry + '\'' +
//                ", customerType='" + customerType + '\'' +
//                ", day1Sales=" + day1Sales +
//                ", day2Sales=" + day2Sales +
//                ", day3Sales=" + day3Sales +
//                ", day4Sales=" + day4Sales +
//                ", day5Sales=" + day5Sales +
//                ", day6Sales=" + day6Sales +
//                ", day7Sales=" + day7Sales +
//                ", partySales=" + partySales +
//                ", drinkSales=" + drinkSales +
//                ", miscSales=" + miscSales +
//                ", numberOfFootlongs=" + numberOfFootlongs +
//                ", numberOfSixInch=" + numberOfSixInch +
//                ", numberOfFourInch=" + numberOfFourInch +
//                ", numberOfSaladPlates=" + numberOfSaladPlates +
//                ", numberOfDrinks=" + numberOfDrinks +
//                ", hoursOpened=" + hoursOpened +
//                ", hoursWorked=" + hoursWorked +
//                ", numberOfTransactions=" + numberOfTransactions +
//                '}';
//    }
//}
