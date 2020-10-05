package com.example.suppliersapp.init;

import com.example.suppliersapp.DAO.SuppliersRepository;
import com.example.suppliersapp.entitites.Suppliers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {
    @Autowired
    SuppliersRepository suppliersRepository;
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;
    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Suppliers.class);

        suppliersRepository.save(Suppliers.builder().name("Pc").email("contact@gmail.com").build());
        suppliersRepository.save(Suppliers.builder().name("HP").email("contacthp@gmail.com").build());
        suppliersRepository.save(Suppliers.builder().name("Samsung").email("contactsamsung@gmail.com").build());


    }
}
