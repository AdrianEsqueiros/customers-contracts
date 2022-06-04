package com.goback.restore.customers.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CustomerEdited {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dni;
    private Instant occurredOn;
}