package com.dio.santander.esksantanderdevweekapi.resources;

import com.dio.santander.esksantanderdevweekapi.models.dto.StockDTO;
import com.dio.santander.esksantanderdevweekapi.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@RequestBody @Valid  StockDTO dto) {
        return ResponseEntity.ok(stockService.save(dto));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@RequestBody @Valid StockDTO dto) {
        return ResponseEntity.ok(stockService.update(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll() {

        List<StockDTO> list = new ArrayList<>();
        list = stockService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(stockService.findById(id));
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> delete(@PathVariable Long id) {
        return ResponseEntity.ok(stockService.delete(id));
    }

    @GetMapping(value = "/today", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findByToday() {
        return ResponseEntity.ok(stockService.findByToday());
    }
}
