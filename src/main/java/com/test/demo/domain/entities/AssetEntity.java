package com.test.demo.domain.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "asset")
public class AssetEntity {

    @Id
    private Integer id;

    @Column(name = "total_num", nullable = false)
    private String totalNum;

    @Column(name = "real_estate_num", nullable = false)
    private String realEstateNum;

}
