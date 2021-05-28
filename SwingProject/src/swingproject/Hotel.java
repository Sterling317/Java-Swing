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
public class Hotel {
    String hotelName;
    String position;
    String emptySingleRooms;
    String emptyDoubleRooms;
    String score; 

    public Hotel(String hotelName, String position, String emptySingleRooms, String emptyDoubleRooms, String score) {
        this.hotelName = hotelName;
        this.position = position;
        this.emptySingleRooms = emptySingleRooms;
        this.emptyDoubleRooms = emptyDoubleRooms;
        this.score = score;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmptySingleRooms() {
        return emptySingleRooms;
    }

    public void setEmptySingleRooms(String emptySingleRooms) {
        this.emptySingleRooms = emptySingleRooms;
    }

    public String getEmptyDoubleRooms() {
        return emptyDoubleRooms;
    }

    public void setEmptyDoubleRooms(String emptyDoubleRooms) {
        this.emptyDoubleRooms = emptyDoubleRooms;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    
}
