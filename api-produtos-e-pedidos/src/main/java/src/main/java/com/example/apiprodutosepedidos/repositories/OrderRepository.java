package src.main.java.com.example.apiprodutosepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.com.example.apiprodutosepedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
