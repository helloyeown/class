package com.hi.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Address {

    private String zipcode;
    private String address1;
    private String address2;

}
