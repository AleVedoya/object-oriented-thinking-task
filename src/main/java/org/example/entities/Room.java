package org.example.entities;

public class Room {
    private Long id;
    private String roomNumber;
    private int capability;
    private boolean available;

    public Room() {
    }

    public Room(boolean available, int capability, Long id, String roomNumber) {
        this.available = available;
        this.capability = capability;
        this.id = id;
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
