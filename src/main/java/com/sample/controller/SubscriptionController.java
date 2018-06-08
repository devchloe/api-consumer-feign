package com.sample.controller;

import com.sample.client.Account;
import com.sample.domain.Invoice;
import com.sample.domain.Subscription;
import com.sample.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.*;

@RestController
public class SubscriptionController {

//    private SubscriptionService subscriptionService;
//
//    @Autowired
//    public SubscriptionController(SubscriptionService subscriptionService) {
//        this.subscriptionService = subscriptionService;
//    }

    @PostMapping(value = "/subscriptions", consumes = MediaType.APPLICATION_JSON_UTF8)
    public String subscribe(Subscription subscription) {
//        return subscriptionService.createInvoice(subscription);
        return "Hello World";
    }


}
