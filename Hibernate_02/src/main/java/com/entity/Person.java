package com.entity;
import com.entity.AdharEntity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="person")

public class Person implements Serializable {
	private static final long serialVersionUID = 2616839699320161780L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "location")
	private String location;
	
//	@JoinColumn(name="adharId",referencedColumnName = "id")
	@OneToOne
	private AdharEntity entity;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public AdharEntity getEntity() {
		return entity;
	}

	public void setEntity(AdharEntity entity) {
		this.entity = entity;
	}

	
}


