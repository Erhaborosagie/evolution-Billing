package com.osagie.evolutionbilling.controllers;

import com.osagie.evolutionbilling.services.InvoiceService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping("/link")
    public ResponseEntity<?> getInvoiceLink(HttpServletRequest request){
        return invoiceService.getInvoiceLink(request);
    }
}
