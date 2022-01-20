package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="article")
public class article {
	@Id
	public int id;
	public String designation;
	public String type;
	public String reference;
	public  String date;
	public Boolean status;
	public String bar_code;



}
