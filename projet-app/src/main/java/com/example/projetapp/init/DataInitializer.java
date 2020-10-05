package com.example.projetapp.init;

import com.example.projetapp.DAO.ProductRepository;
import com.example.projetapp.entities.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        productRepository.save(Product.builder().name("Pc").price(1900.0).build());
        productRepository.save(Product.builder().name("Tv").price(1100.0).build());
        productRepository.save(Product.builder().name("Telephone").price(800.0).build());
    }
}
