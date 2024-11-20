package com.example.cardapio.food;
//Interface que se conecta com o banco de dados e pega dados da mesma

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {


}
