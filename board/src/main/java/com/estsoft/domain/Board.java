package com.estsoft.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "BOARD")
public class Board {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOARD_ID")
    private long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "REG_DATE")
    private Date regDate;

    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    @Column(name = "DEL_FLAG")
    private boolean delFlag;
}
