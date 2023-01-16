package com.myown.departmentservice;

public class Address {
    private String addressId;
    private String addressLine;
    private String city;
    private String province;



    public Address() {
    }

    public Address(String addressId, String addressLine, String city, String province) {
        this.addressId = addressId;
        this.addressLine = addressLine;
        this.city = city;
        this.province = province;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine() {
        return this.addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "{" +
            " addressId='" + getAddressId() + "'" +
            ", addressLine='" + getAddressLine() + "'" +
            ", city='" + getCity() + "'" +
            ", province='" + getProvince() + "'" +
            "}";
    }


}
