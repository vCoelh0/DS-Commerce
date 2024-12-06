package com.coelhodev.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.coelhodev.dscommerce.entities.Order;
import com.coelhodev.dscommerce.entities.OrderItem;
import com.coelhodev.dscommerce.entities.OrderStatus;

import jakarta.validation.constraints.NotEmpty;

public class OrderDTO {

	private Long id;
	private Instant moment;
	private OrderStatus status;
	
	private ClientDTO client;
	
	private PaymentDTO peyment;
	
	@NotEmpty(message = "Deve ter pelo menos um item")
	private List<OrderItemDTO> items = new ArrayList<>();

	public OrderDTO(Long id, Instant moment, OrderStatus status, ClientDTO client, PaymentDTO peyment) {
		this.id = id;
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.peyment = peyment;
	}
	
	
	public OrderDTO(Order entity) {
		this.id = entity.getId();
		this.moment = entity.getMoment();
		this.status = entity.getStatus();
		this.client = new ClientDTO(entity.getClient());
		this.peyment = (entity.getPayment() == null) ? null : new PaymentDTO(entity.getPayment());
		for (OrderItem item : entity.getItems()) {
			OrderItemDTO itemDto = new OrderItemDTO(item);
			items.add(itemDto);
		}
	}


	public Long getId() {
		return id;
	}


	public Instant getMoment() {
		return moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public ClientDTO getClient() {
		return client;
	}


	public PaymentDTO getPeyment() {
		return peyment;
	}


	public List<OrderItemDTO> getItems() {
		return items;
	}

	
	public Double getTotal() {
		double sum = 0.0;
		for (OrderItemDTO item : items) {
			sum = sum + item.getSubTotal();
		}
		return sum;
	}
	
}
