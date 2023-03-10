package com.juaracoding.cucumber.drivers.strategis;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            default:
                return null;
        }
    }
}
