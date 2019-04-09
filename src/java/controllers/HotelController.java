package controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import moldels.Hotel;

@Named(value="hotelController")
@SessionScoped
public class HotelController implements Serializable{

    private List<Hotel> hotels;
    private String hotelName, amount, startDate, endDate;
    private Boolean balcony;
    
    public HotelController() {
        hotels = new ArrayList();
        hotels.add(new Hotel("Malmen", "Götgatan", "0736542892"));
        hotels.add(new Hotel("Inglais", "StureP", "0735610562"));
        hotels.add(new Hotel("Bäckis", "Solnavägen", "0735353692"));
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }
}