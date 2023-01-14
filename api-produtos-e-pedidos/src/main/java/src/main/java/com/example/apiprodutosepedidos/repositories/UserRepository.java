package src.main.java.com.example.apiprodutosepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.com.example.apiprodutosepedidos.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
