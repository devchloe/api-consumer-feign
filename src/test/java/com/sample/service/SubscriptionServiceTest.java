package com.sample.service;

import com.sample.domain.Invoice;
import com.sample.domain.Subscription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static com.sample.domain.Subscription.SubscriptionType.MONTHLY;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "devchloe.spring-cloud-contract:api-provider:+:stubs:8888", workOffline = true)
public class SubscriptionServiceTest {

    @Autowired
    private SubscriptionService service;

    @Test
    public void shouldGiveFreeSubscriptionForFriends() throws Exception {

        // given:
        String accountId = "12345";
        Subscription subscription = new Subscription(accountId, MONTHLY);

        // when:
        Invoice invoice = service.createInvoice(subscription);

        // then:
        assertThat(invoice.getPaymentDue()).isEqualTo(0);
        assertThat(invoice.getClientEmail()).isNotEmpty();
    }
}
