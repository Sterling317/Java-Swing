/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingproject;

/**
 *
 * @author yijunchen
 */
public class Person {
    String firstname;
    String lastname;
    String phone;
    String gender;
    String checkInMonth;
    String checkInDay;
    String checkOutMonth;
    String checkOutDay;
    String number;
    String stayDays;
    String singleRooms;
    String doubleRooms;
    String hotelName;

    public Person(String firstname, String lastname, String phone, String gender,
            String checkInMonth, String checkInDay, String checkOutMonth, 
            String checkOutDay, String number, String stayDays, String singleRooms,
            String doubleRooms, String hotelName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.gender = gender;
        this.checkInMonth = checkInMonth;
        this.checkInDay = checkInDay;
        this.checkOutMonth = checkOutMonth;
        this.checkOutDay = checkOutDay;
        this.number = number;
        this.stayDays = stayDays;
        this.singleRooms = singleRooms;
        this.doubleRooms = doubleRooms;
        this.hotelName = hotelName;
    }
    
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCheckInMonth() {
        return checkInMonth;
    }

    public void setCheckInMonth(String checkInMonth) {
        this.checkInMonth = checkInMonth;
    }

    public String getCheckInDay() {
        return checkInDay;
    }

    public void setCheckInDay(String checkInDay) {
        this.checkInDay = checkInDay;
    }

    public String getCheckOutMonth() {
        return checkOutMonth;
    }

    public void setCheckOutMonth(String checkOutMonth) {
        this.checkOutMonth = checkOutMonth;
    }

    public String getCheckOutDay() {
        return checkOutDay;
    }

    public void setCheckOutDay(String checkOutDay) {
        this.checkOutDay = checkOutDay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStayDays() {
        return stayDays;
    }

    public void setStayDays(String stayDays) {
        this.stayDays = stayDays;
    }

    public String getSingleRooms() {
        return singleRooms;
    }

    public void setSingleRooms(String singleRooms) {
        this.singleRooms = singleRooms;
    }

    public String getDoubleRooms() {
        return doubleRooms;
    }

    public void setDoubleRooms(String doubleRooms) {
        this.doubleRooms = doubleRooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    
    
    
    
    @Override
    public String toString() {
        if (gender == "Man") {
            return "Mr. " + lastname + " " + "Your hotel is:" + hotelName + " " +
                    " Check-in time: " + checkInMonth + "-" + checkInDay + " " 
                    + " Scheduled days: " + stayDays + "days";
//                    (Integer.parseInt(checkOutDay) - Integer.parseInt(checkInDay))                  
        } else {
            return "Ms. " + lastname + "Your hotel is:" + hotelName + " " +
                    " " + " Check-in time: " + checkInMonth + "-" 
                    + checkInDay + " " + " Scheduled days: " + stayDays + "days";
        }
    }
    
    
    
}
