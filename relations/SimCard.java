package com.mftplus.relations;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

public class SimCard {
    private int id;
    private String operator;
    private String number;
    private Customer owner;
}
