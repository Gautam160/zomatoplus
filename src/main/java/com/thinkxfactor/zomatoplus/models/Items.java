package com.thinkxfactor.zomatoplus.models;
import java.io.*;
import javax.persistence.*;
@Entity
@Table(name="tbl_items")

public class Items implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	@Column(name="reataurant_id")
	private Long retaurantId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="description")
	private String description;

	
	public Items()
	{
		super();
	}
	public Items(Long id, Long retaurantId, String name, String price, String description) {
		super();
		this.id = id;
		this.retaurantId = retaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRetaurantId() {
		return retaurantId;
	}

	public void setRetaurantId(Long retaurantId) {
		this.retaurantId = retaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
