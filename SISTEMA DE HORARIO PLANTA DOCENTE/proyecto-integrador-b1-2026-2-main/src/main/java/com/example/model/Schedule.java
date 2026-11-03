package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Course course;

    private String dayOfWeek; // Lunes, Martes, etc.
    private String timeSlot;  // Ej: 08:00 - 10:00
    private String classroom; // Aula 101

    public Schedule() {}

    public Schedule(Teacher teacher, Course course, String dayOfWeek, String timeSlot, String classroom) {
        this.teacher = teacher;
        this.course = course;
        this.dayOfWeek = dayOfWeek;
        this.timeSlot = timeSlot;
        this.classroom = classroom;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
    public String getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(String dayOfWeek) { this.dayOfWeek = dayOfWeek; }
    public String getTimeSlot() { return timeSlot; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }
    public String getClassroom() { return classroom; }
    public void setClassroom(String classroom) { this.classroom = classroom; }
}