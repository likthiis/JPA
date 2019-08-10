package com.test.demo.domain.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "app_info_main")
public class AppInfoMainEntity {

    @Id
    private Integer id;

    @Column(name = "app_no", nullable = false)
    private String appNo;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phonetic_name", nullable = false)
    private String phoneticName;

    @Column(name = "address1", nullable = false)
    private String address1;

    @Column(name = "address2", nullable = false)
    private String address2;

    @Column(name = "address3", nullable = false)
    private String address3;

    @Column(name = "address4", nullable = false)
    private String address4;

}
