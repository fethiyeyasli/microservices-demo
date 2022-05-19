package com.fy.orderservice.client;


import com.fy.orderservice.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="productservice")
public interface ProductServiceClient {
	
	
	@RequestMapping("/products/{id}")
	public ProductDTO readProduct(@PathVariable("id") long productId);
}
