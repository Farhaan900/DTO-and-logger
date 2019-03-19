package com.stackroute.modelMapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDTO {

    private long number;
    private String name;
    private String validFrom;
    private String validTo;

}
