package com.fsquall.operation;

public class MinsOrSecondsResult {
    private Integer number;
    private boolean carriesOver;
    private MinsOrSecondsResult previousResult;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public boolean isCarriesOver() {
        return carriesOver;
    }

    public void setCarriesOver(boolean carriesOver) {
        this.carriesOver = carriesOver;
    }

    public MinsOrSecondsResult getPreviousResult() {
        return previousResult;
    }

    public void setPreviousResult(MinsOrSecondsResult previousResult) {
        this.previousResult = previousResult;
    }
}
