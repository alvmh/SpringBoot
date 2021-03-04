package entity;

import java.io.Serializable;

/**
 * (Covid)实体类
 *
 * @author makejava
 * @since 2021-02-27 15:56:36
 */
public class Covid implements Serializable {
    private static final long serialVersionUID = -89368522926377762L;
    
    private String id;
    
    private String timeReport;
    
    private String coor;
    
    private String x;
    
    private String y;
    
    private String name;
    
    private String gender;
    
    private String age;
    
    private String timeOccur;
    
    private String timeZd;
    
    private String levelLc;
    
    private String address;
    
    private String district;
    
    private String street;
    
    private String levelRisk;
    
    private String huji;
    
    private String workplace;
    
    private String occupation;
    
    private String infoTrace;
    
    private String placeName;
    
    private String infoJz;
    
    private String remarks;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeReport() {
        return timeReport;
    }

    public void setTimeReport(String timeReport) {
        this.timeReport = timeReport;
    }

    public String getCoor() {
        return coor;
    }

    public void setCoor(String coor) {
        this.coor = coor;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTimeOccur() {
        return timeOccur;
    }

    public void setTimeOccur(String timeOccur) {
        this.timeOccur = timeOccur;
    }

    public String getTimeZd() {
        return timeZd;
    }

    public void setTimeZd(String timeZd) {
        this.timeZd = timeZd;
    }

    public String getLevelLc() {
        return levelLc;
    }

    public void setLevelLc(String levelLc) {
        this.levelLc = levelLc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLevelRisk() {
        return levelRisk;
    }

    public void setLevelRisk(String levelRisk) {
        this.levelRisk = levelRisk;
    }

    public String getHuji() {
        return huji;
    }

    public void setHuji(String huji) {
        this.huji = huji;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getInfoTrace() {
        return infoTrace;
    }

    public void setInfoTrace(String infoTrace) {
        this.infoTrace = infoTrace;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getInfoJz() {
        return infoJz;
    }

    public void setInfoJz(String infoJz) {
        this.infoJz = infoJz;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}