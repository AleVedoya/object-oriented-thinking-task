package org.example.entities;

public class Reservation {
    private Long id;
    private Long studentId;
    private Long adminId;
    private Long roomId;

    public Reservation() {
    }

    public Reservation(Long adminId, Long id, Long roomId, Long studentId) {
        this.adminId = adminId;
        this.id = id;
        this.roomId = roomId;
        this.studentId = studentId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
