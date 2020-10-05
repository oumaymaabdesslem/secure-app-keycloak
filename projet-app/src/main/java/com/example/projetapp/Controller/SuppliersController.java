package com.example.projetapp.Controller;

import com.example.projetapp.Dto.Supplier;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuppliersController {
    @Autowired
    KeycloakRestTemplate keycloakRestTemplate;

    @GetMapping("/suppliers")
    public String suppliers(Model model){
        ResponseEntity<PagedModel<Supplier>> response = keycloakRestTemplate.exchange(
                "http://localhost:8083/suppliers",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<PagedModel<Supplier>>() {
                });

        model.addAttribute("suppliers", response.getBody().getContent());
        return "suppliers";
    }
}
