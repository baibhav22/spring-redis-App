package com.baibhav.redisspringboot.controller;
import com.baibhav.redisspringboot.entity.Product;
import com.baibhav.redisspringboot.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class RedisController {

    @Autowired
    private ProductDao dao;

    @PostMapping("/add")
    public Product save(@RequestBody Product product) {
        return dao.save(product);
    }

    @GetMapping("/test")
    public String test() {
        return "hello redis";
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id) {
        return dao.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id) {
        return dao.deleteProduct(id);
    }
}