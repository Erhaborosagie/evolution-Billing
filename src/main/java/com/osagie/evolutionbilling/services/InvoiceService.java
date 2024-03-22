package com.osagie.evolutionbilling.services;

import com.osagie.evolutionbilling.helpers.InvoiceHelper;
import com.osagie.evolutionbilling.models.response.InvoiceResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    public ResponseEntity<?> getInvoiceLink(HttpServletRequest request) {
        InvoiceResponse invoiceLink = InvoiceHelper.generateInvoiceLink(request);
        return ResponseEntity.ok(invoiceLink);
    }
}
