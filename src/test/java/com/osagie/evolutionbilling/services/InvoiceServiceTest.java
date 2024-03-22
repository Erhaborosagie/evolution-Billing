package com.osagie.evolutionbilling.services;

import com.osagie.evolutionbilling.models.response.InvoiceResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureMockMvc
@SpringBootTest
public class InvoiceServiceTest {
    @Autowired
    private InvoiceService invoiceService;

    @Test
    void testGetInvoiceLink(){
        HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
        ResponseEntity<InvoiceResponse> invoiceLink = invoiceService.getInvoiceLink(mockedRequest);

        assertThat(invoiceLink.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
