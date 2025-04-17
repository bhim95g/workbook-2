package com.pluralsight;

public class CellPhone {
        private long serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String Owner;
public CellPhone(){
    this.serialNumber = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNumber = "";
    this.Owner = "";

}

    public long getSerialNumber() {
    return this.serialNumber;
    }
    public String model() {
    return this.model;
    }
    public String carrier() {
    return this.carrier;
    }
    public String phoneNumber() {
    return this.phoneNumber;
    }
    public String owner() {
    return this.Owner;
    }
}
