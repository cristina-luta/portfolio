package com.portfolio.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Experience {
    @Id
    @GeneratedValue
    private int id;

    private String companyName;
    private String positionName;
    private String startDate;
    private String endDate;
    private String task_1;
    private String task_2;
    private String task_3;
    private String task_4;
    private String task_5;
    private String task_6;
    private String task_7;
    private String task_8;
    private String task_9;
    private String task_10;
}