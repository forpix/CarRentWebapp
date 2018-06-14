package com.mv.schelokov.car_rent.model.entities;

import com.mv.schelokov.car_rent.model.entities.interfaces.Entity;
import java.util.Objects;

/**
 *
 * @author Maxim Chshelokov <schelokov.mv@gmail.com>
 */
public class Car implements Entity {
    private int id;
    private Model model;
    private int yearOfMake;
    private int price;
    private String licensePlate;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the yearOfMake
     */
    public int getYearOfMake() {
        return yearOfMake;
    }

    /**
     * @param yearOfMake the yearOfMake to set
     */
    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", yearOfMake=" + yearOfMake + ", price=" + price + ", licensePlate=" + licensePlate + '}';
    }

    /**
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.model);
        hash = 29 * hash + this.yearOfMake;
        hash = 29 * hash + this.price;
        hash = 29 * hash + Objects.hashCode(this.licensePlate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.yearOfMake != other.yearOfMake) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.licensePlate, other.licensePlate)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return true;
    }

}