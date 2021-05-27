package com.dio.santander.esksantanderdevweekapi.mappers;

import com.dio.santander.esksantanderdevweekapi.models.Stock;
import com.dio.santander.esksantanderdevweekapi.models.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(stock.getId());
        stockDTO.setName(stock.getName());
        stockDTO.setPrice(stock.getPrice());
        stockDTO.setVariation(stock.getVariation());
        stockDTO.setDate(stock.getDate());
        return stockDTO;
    }

    public List<StockDTO> toDto(List<Stock> list) {
        return list.stream().map(this::toDto).collect(Collectors.toList());
    }

}
