package com.fy.productservice.controller;

import com.fy.productservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@RequestMapping("/{id}")
	public ProductDTO readProduct(@PathVariable("id") long productId) {
		ProductDTO p = new ProductDTO();
		p.setId(productId);
		p.setName("Product"+productId);
		p.setPrice(Math.random()*1000);
		
		return p;
	}

}
