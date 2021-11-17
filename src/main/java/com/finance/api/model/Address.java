package com.finance.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    private String street;

    private String number;

    private String supplement;

    private String neighborhood;

    private String cep;

    private String town;

    private String state;
}
