package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int serialNumber(int serialNumber) {
        return this.serialNumber;
    }

    public String model(String model) {
        return this.model;
    }

    public String carrier(String carrier) {
        return this.carrier;
    }

    public String phoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }

    public String owner(String owner) {
        return this.owner;
    }

    public void printAnimalInformation() {
        System.out.printf();
        System.out.printf();
        System.out.printf();
        System.out.printf();    }


}