package com.coelhodev.dscommerce.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_orderItem")
public class OrderItem {

	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	private int quantity;
	private double price;
	
	public OrderItem() {
		
	}

	public OrderItem(Order order, Product product, int quantity, double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product prodcut) {
		id.setProduct(prodcut);
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//=============================== equals and hascode ===============================

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

	
	
	
	
}
