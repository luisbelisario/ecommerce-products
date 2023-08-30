package com.belisario.ecommerceproducts.controller;

import com.belisario.ecommerceproducts.domain.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<MessageDto> testController() {
        MessageDto dto = new MessageDto("Products API");

        return  ResponseEntity.ok(dto);
    }
}
