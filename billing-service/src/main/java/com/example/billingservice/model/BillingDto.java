package com.example.billingservice.model;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;

@Value.Immutable
@JsonDeserialize(builder = ImmutableBillingDto.Builder.class)
public abstract class BillingDto {
    public abstract BigDecimal getSum();
    public abstract String getAgent();

}