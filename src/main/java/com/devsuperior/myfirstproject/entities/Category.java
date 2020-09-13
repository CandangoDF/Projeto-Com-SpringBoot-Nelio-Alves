package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	
	@JsonIgnore
	private List<Product> products = new ArrayList<>();
	
	public Category() {
		
	}
	
	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
