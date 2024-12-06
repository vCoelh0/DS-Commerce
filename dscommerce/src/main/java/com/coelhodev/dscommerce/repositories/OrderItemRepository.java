package com.coelhodev.dscommerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coelhodev.dscommerce.entities.OrderItem;
import com.coelhodev.dscommerce.entities.OrderItemPK;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
