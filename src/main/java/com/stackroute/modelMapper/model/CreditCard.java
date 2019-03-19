package com.stackroute.modelMapper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CreditCard {

    @Id
    private long number;
    private String name;
    private int cvv;
    private String validFrom;
    private String validTo;

}
