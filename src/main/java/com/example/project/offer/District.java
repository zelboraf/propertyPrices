package com.example.project.offer;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "districts")
@Data
public class District {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;

}
