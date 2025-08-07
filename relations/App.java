/*
* package com.mftplus.relations;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        SimCard sim1 = SimCard.builder().number("0917").build();
        SimCard sim2 = SimCard.builder().number("0912").build();
        SimCard sim3 = SimCard.builder().number("0914").build();

        ArrayList<SimCard> simCards = new ArrayList<>();
        simCards.add(sim1);
        simCards.add(sim2);
        simCards.add(sim3);

        Customer customer =
                Customer
                        .builder()
                        .id(1)
                        .name("ali")
                        .simCardList(simCards)
                        .build();



//        System.out.println(customer);
//        System.out.println(sim);

        System.out.println("C ->" + customer.getName());
        for (SimCard simCard : customer.getSimCardList()) {
            System.out.println("\t" + simCard.getNumber());
        }

        sim1.setOwner(customer);
        sim2.setOwner(customer);
        sim3.setOwner(customer);

    }

}

*
*
* */