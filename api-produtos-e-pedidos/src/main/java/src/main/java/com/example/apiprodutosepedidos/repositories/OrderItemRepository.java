package src.main.java.com.example.apiprodutosepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.com.example.apiprodutosepedidos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
