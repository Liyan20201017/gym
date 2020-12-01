package com.gym.entity;

import lombok.Data;

@Data
public class Course {
    private int course_id;
    private String course_name;
    private int course_staff_id;
    private int course_site_id;
    private String course_time;
    private int course_state;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_staff_id() {
        return course_staff_id;
    }

    public void setCourse_staff_id(int course_staff_id) {
        this.course_staff_id = course_staff_id;
    }

    public int getCourse_site_id() {
        return course_site_id;
    }

    public void setCourse_site_id(int course_site_id) {
        this.course_site_id = course_site_id;
    }

    public String getCourse_time() {
        return course_time;
    }

    public void setCourse_time(String course_time) {
        this.course_time = course_time;
    }

    public int getCourse_state() {
        return course_state;
    }

    public void setCourse_state(int course_state) {
        this.course_state = course_state;
    }
}
