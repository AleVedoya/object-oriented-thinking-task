package org.example.entities;

import org.example.entities.enums.Role;

public class Student extends User{
   private boolean reservationStatus;

    public Student() {
    }

    public Student(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Student(Long id, String name, String password, Role role, boolean reservationStatus) {
        super(id, name, password, role);
        this.reservationStatus = reservationStatus;
    }

    public boolean isReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


}
