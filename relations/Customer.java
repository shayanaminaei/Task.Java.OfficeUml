package com.mftplus.relations;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

public class Customer extends Person implements User {
    private String childhood;
    private ArrayList<SimCard> simCardList;

    public Customer(int id, String name, String childhood) {
        super(id, name);
        this.childhood = childhood;
    }

    @Override
    public boolean login(String name, String password) {
        return false;
    }



}
