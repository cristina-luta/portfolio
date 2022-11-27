package com.portfolio.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Experience {
    @Id
    @GeneratedValue
    private int id;

    private String companyName;
    private String positionName;
    private Date startDate;
    private Date endDate;
    private String tasks;
}