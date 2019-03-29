package com.estsoft.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "BOARD")
public class Board {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOARD_ID")
    long id;

    @Column(name = "TITLE")
    String title;

    @Column(name = "CONTENT")
    String content;

    @Column(name = "REG_DATE")
    Date regDate;

    @Column(name = "MODIFY_DATE")
    Date modifyDate;

    @Column(name = "DEL_FLAG")
    boolean delFlag;
}
