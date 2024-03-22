package com.osagie.evolutionbilling.helpers;

import com.osagie.evolutionbilling.models.Invoice;
import com.osagie.evolutionbilling.models.response.InvoiceResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Component
public class InvoiceHelper {

    /**
     * This is the link generation method.
     * In an ideal scenario, the transaction detail will be coming from a service
     * @param request
     * @return InvoiceResponse
     */
    public static InvoiceResponse generateInvoiceLink(HttpServletRequest request){
        Invoice invoice = new Invoice();

        String baseUrl = ServletUriComponentsBuilder.fromRequest(request)
                .replacePath(null).build().toString();

        invoice.setTotalAmount((Math.random() * (2000000 - 1000)) + 1000);
        invoice.setId(UUID.randomUUID());

        String encode = URLEncoder.encode(invoice.getId().toString(), StandardCharsets.UTF_8);

        cacheInvoice(encode, invoice);

        return InvoiceResponse.builder()
                .message("Please visit any of the link below either to make payment or view your invoice")
                .paymentEndpoint(baseUrl + "/invoices/payment?id=" + encode)
                .invoiceEndpoint(baseUrl + "/invoices?id=" + encode)
                .build();
    }

    /**
     * Todo : Logic to cache invoice using tools like redis
     * Beyond the scope of this task
     * @param encode
     * @param invoice
     */
    private static void cacheInvoice(String encode, Invoice invoice) {

    }
}
