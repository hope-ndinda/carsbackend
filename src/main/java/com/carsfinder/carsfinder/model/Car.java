package com.carsfinder.carsfinder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String photoUrl;
    private String condition; // "new" or "used"
    private String brand;
    private String model;
    private int manufacturingYear;
    private double mileage;
    private String bodyType;
    private double price;
    private String location;
    private String driveType;
    private String engine;
    private String transmission;
    private String fuelType;
    private String cityMpg;
    private String highwayMpg;
    private String exteriorColor;
    private String interiorColor;
    private String description;
    private String typeOfSeller;
    private String seller_fn;
    private String seller_ln;
    private String seller_email;
    private int seller_phone;
    private String exterior_features;
    private String interior_features;


    private LocalDateTime createdAt = LocalDateTime.now();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getInterior_features() {
        return interior_features;
    }

    public void setInterior_features(String interior_features) {
        this.interior_features = interior_features;
    }

    public String getExterior_features() {
        return exterior_features;
    }

    public void setExterior_features(String exterior_features) {
        this.exterior_features = exterior_features;
    }

    public int getSeller_phone() {
        return seller_phone;
    }

    public void setSeller_phone(int seller_phone) {
        this.seller_phone = seller_phone;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public String getSeller_ln() {
        return seller_ln;
    }

    public void setSeller_ln(String seller_ln) {
        this.seller_ln = seller_ln;
    }

    public String getSeller_fn() {
        return seller_fn;
    }

    public void setSeller_fn(String seller_fn) {
        this.seller_fn = seller_fn;
    }

    public String getTypeOfSeller() {
        return typeOfSeller;
    }

    public void setTypeOfSeller(String typeOfSeller) {
        this.typeOfSeller = typeOfSeller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getHighwayMpg() {
        return highwayMpg;
    }

    public void setHighwayMpg(String highwayMpg) {
        this.highwayMpg = highwayMpg;
    }

    public String getCityMpg() {
        return cityMpg;
    }

    public void setCityMpg(String cityMpg) {
        this.cityMpg = cityMpg;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
