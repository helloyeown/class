package com.hi.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderCommand {

    private List<OrderItem> orderItems;
    private Address address;

}
