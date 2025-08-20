package com.delivery.service;

import com.delivery.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private KafkaTemplate <String, String> kafkaTemplate;

    Logger log = LoggerFactory.getLogger(DeliveryService.class);

    public void updateLocation(String location){
        kafkaTemplate.send(AppConstants.LOCATION_TOPIC, location);
        System.out.println("Updated location: "+ location);
    }
}
