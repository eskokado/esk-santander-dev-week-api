package com.dio.santander.esksantanderdevweekapi.repositories;

import com.dio.santander.esksantanderdevweekapi.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
