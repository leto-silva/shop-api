package com.santana.controller;

import com.santana.dto.ShopDTO;
import com.santana.model.Shop;
import com.santana.model.ShopItem;
import com.santana.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/shop")
@RequireArgsConstructor
public class ShopController {
	
	private final ShopRepository shopRepository;
	
	@GetMapping
	public List<ShopDTO> getShop() {
		return shopRepository
				.findAll()
				.stream()
				.map(shop ->
				ShopDTO.convert(shop))
				.collect(Collectors.toList());
	}
	
	@PostMapping
	public ShopDTO saveShop(@RequestBody ShopDTO shopDTO) {
		
		shopDTO.setIdentifier(
				UUID.randomUUID().toString());
		
		shopDTO.setDateShop(LocalTime.now());
		shopDTO.setStatus("PENDING");
		
		Shop shop = Shop.convert(shopDTO);
		for (ShopItem shopItem : shop.getItems()) {
			shopItem.setShop(shop);
		}
		
		return ShopDTO.convert(shopRepository.save(shop));
	}

}
