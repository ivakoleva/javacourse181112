package com.musala.javacourse181112.pawInc;

public class Cat extends Animal {
    private boolean cleansingStatus;
    private int IQ;
    private String tag;

    public Cat(String name, int age, int IQ, String tag) {
        super(name, age);
        this.cleansingStatus = false;
        this.IQ = IQ;
        this.tag = tag;
    }

    public Boolean getCleansingStatus() {
        return cleansingStatus;

    }

    public void setCleansingStatus(Boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
