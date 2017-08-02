package space.shougat.ecom.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products")
    public ResponseEntity<String> getProducts() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>("It's working :) :) :)", headers, HttpStatus.OK);
    }
}
