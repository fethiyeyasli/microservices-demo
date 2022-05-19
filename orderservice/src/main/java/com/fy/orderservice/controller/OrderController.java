package com.fy.orderservice.controller;

import com.fy.orderservice.client.ProductServiceClient;
import com.fy.orderservice.dto.OrderDTO;
import com.fy.orderservice.dto.OrderResult;
import com.fy.orderservice.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	ProductServiceClient productService;


	@RequestMapping(method = RequestMethod.POST)
	public OrderResult createOrder(@RequestBody OrderDTO order) {

		OrderResult or = new OrderResult();

		or.setMessage("Dear customer "+order.getCustomer() +" your order is send to your address: "+order.getAddress());
		ProductDTO productDTO = productService.readProduct(order.getProductId());
		double unitPrice = productDTO.getPrice();
		or.setTotalAmount(unitPrice*order.getCount());

		return or;
	}

}
