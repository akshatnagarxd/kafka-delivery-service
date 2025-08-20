package com.delivery.controller;

import com.delivery.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("location")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        deliveryService.updateLocation("(" + Math.random() + ", " + Math.random() + ")");
        return ResponseEntity.ok("Location updated successfully");
    }
}
