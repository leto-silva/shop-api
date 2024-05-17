package com.santana.model;

import lombok.Getter;
import lombok.Setter;
import javax.persitence.*;

import jakarta.persistence.GeneratedValue;

@Getter
@Setter
@Entity(name = "shop_item")
public class ShopItem {

	@Id
	@GeneratedValue(strategy = Generation.IDENTITY)
	private Long id;
	
	@Column(name = "product_identifier")
	private String productIdentifier;
	
	private Integer amount;
	
	private Float price;
	
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;
	
	
}
