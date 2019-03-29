package com.estsoft.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "MEMBER")
public class Member {
	
	@Id
	@GeneratedValue
	Long id;
	String name;
	String username;
	String remark;
	public Member() {}
	public Member(String name, String username, String remark) {
		this.name = name;
		this.username = username;
		this.remark = remark;
	}
}
