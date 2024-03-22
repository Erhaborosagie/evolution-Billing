package com.osagie.evolutionbilling.controllers;

import com.osagie.evolutionbilling.models.response.InvoiceResponse;
import com.osagie.evolutionbilling.services.InvoiceService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@SpringBootTest
public class InvoiceControllerTest {

    @MockBean
    private InvoiceService invoiceService;

    @Autowired
    private MockMvc mvc;

    @Test
    void testGetInvoiceLink() throws Exception {
        InvoiceResponse response = new InvoiceResponse();
        Mockito.when(invoiceService.getInvoiceLink(any())).thenReturn(ResponseEntity.ok(response));
        mvc.perform(get("/invoices/link").
                        contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }
}
