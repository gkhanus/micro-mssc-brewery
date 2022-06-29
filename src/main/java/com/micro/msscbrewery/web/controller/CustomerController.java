package com.micro.msscbrewery.web.controller;

import com.micro.msscbrewery.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

   @GetMapping({"/{customerId}"})
   public ResponseEntity getCustomerById(@PathVariable UUID customerId) {

       return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
   }
}
