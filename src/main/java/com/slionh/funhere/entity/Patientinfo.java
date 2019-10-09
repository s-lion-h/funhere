package com.slionh.funhere.entity;

import java.util.Date;

public class Patientinfo {
    private String cardno;

    private String name;

    private String packageflag;

    private String home;

    private Date createtime;

    private String formattedAddress;

    private String country;

    private String province;

    private String city;

    private String citycode;

    private String district;

    private String street;

    private String number;

    private String adcode;

    private String location;

    private String level;

    private String reserved;

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPackageflag() {
        return packageflag;
    }

    public void setPackageflag(String packageflag) {
        this.packageflag = packageflag == null ? null : packageflag.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress == null ? null : formattedAddress.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode == null ? null : adcode.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved == null ? null : reserved.trim();
    }

    @Override
    public String toString() {
        return "Patientinfo{" +
                "cardno='" + cardno + '\'' +
                ", name='" + name + '\'' +
                ", packageflag='" + packageflag + '\'' +
                ", home='" + home + '\'' +
                ", createtime=" + createtime +
                ", formattedAddress='" + formattedAddress + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", citycode='" + citycode + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", adcode='" + adcode + '\'' +
                ", location='" + location + '\'' +
                ", level='" + level + '\'' +
                ", reserved='" + reserved + '\'' +
                '}';
    }
}