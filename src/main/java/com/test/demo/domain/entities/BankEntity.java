package com.test.demo.domain.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "bank")
public class BankEntity {

    @Id
    private Integer id;

    @Column(name = "bank_code", nullable = false)
    private String bankCode;

    @Column(name = "name", nullable = false)
    private String name;

}
