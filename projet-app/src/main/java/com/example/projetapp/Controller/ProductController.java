package com.example.projetapp.Controller;

import com.example.projetapp.DAO.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
    @Autowired
    ProductRepository productRepository;

     @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/products")
    public String product(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "products";
    }
}
