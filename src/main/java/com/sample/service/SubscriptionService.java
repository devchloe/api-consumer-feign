package com.sample.service;

import com.sample.client.Account;
import com.sample.client.AccountGateway;
import com.sample.domain.Invoice;
import com.sample.domain.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    private AccountGateway accountGateway;

    @Autowired
    public SubscriptionService(AccountGateway accountGateway) {
        this.accountGateway = accountGateway;
    }

    public Invoice createInvoice(Subscription subscription) {

        Account account = accountGateway.getById(subscription.getAccountId());
        if (account.getType().equals("friends")) return new Invoice(account.getEmail(), 0);

        return new Invoice(account.getEmail(), subscription.getSubscriptionType().getFeeInPenny());
    }
}
