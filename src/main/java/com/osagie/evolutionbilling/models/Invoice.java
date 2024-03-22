package com.osagie.evolutionbilling.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Invoice {
    UUID id;
    String name;
    Double totalAmount;
}
