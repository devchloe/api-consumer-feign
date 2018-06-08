package com.sample.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.domain.Subscription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.ws.rs.core.MediaType;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SubscriptionController.class)
public class SubscriptionControllerTest {

    @Autowired
    private MockMvc mockMvc;
//
//    @MockBean
//    private SubscriptionService subscriptionService;
//
//    @Autowired
//    private SubscriptionController subscriptionController;
//.gitignore
    ObjectMapper mapper = new ObjectMapper();
//
//    private Subscription subscription;
//    private Invoice invoice;

//
//    @Test
//    public void POST_whenSubscribeMegagines_thenShouldCallToCreateInvoice() {
//        subscription = new Subscription("12345", Subscription.SubscriptionType.MONTHLY);
//
//        subscriptionController.subscribe(subscription);
//        then(service).should().createInvoice(subscription);
//    }

    @Test
    public void POST_whenSubscribeMegagines_thenShouldReturnInvoice() throws Exception {
//        subscription = new Subscription("12345", Subscription.SubscriptionType.MONTHLY);
//        invoice = new Invoice("devchloe.kwon@gmail.com", Subscription.SubscriptionType.MONTHLY.getFeeInPenny());
//        when(subscriptionService.createInvoice(subscription)).thenReturn(invoice);
//
//        Gson gson = new Gson();
//        String json = gson.toJson(subscription);


//        mockMvc.perform(post("/").contentType(MediaType.APPLICATION_JSON).content(mapper.writeValueAsBytes(subscription)))
//                .andExpect(status().isOk());
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(jsonPath("$", hasSize(2)));

//        verify(subscriptionService, times(1)).createInvoice(subscription);
//        verifyNoMoreInteractions(subscriptionService);
    }

    @Test
    public void testeeee() throws Exception {
        Subscription subscription = new Subscription("12345", Subscription.SubscriptionType.MONTHLY);
        this.mockMvc.perform(post("/subscriptions").contentType(MediaType.APPLICATION_JSON).(mapper.writeValueAsBytes(subscription))).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World")));
    }

}
