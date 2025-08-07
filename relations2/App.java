/*
*
* package com.mftplus.relations2;

public class App {
//    public static void add(int ... numbers){
//        System.out.println("Salam");
//        for(int num:numbers){
//            System.out.println(num);
//        }
//    }
//
//    public static void main(String[] args) {
//        add(1);
//        add(1,2);
//        add(1,2,3);
//        add(1,2,3,4);
//    }

    public static void main(String[] args) {
        SimCard sim1 = SimCard.builder().number("0917").owner(new Customer()).build();
        SimCard sim2 = SimCard.builder().number("0912").build();
        SimCard sim3 = SimCard.builder().number("0914").build();

        Customer customer =
                Customer
                        .builder()
                        .id(1)
                        .name("ali")
                        .build();

        customer.addSimCards(sim1,sim2, sim3);

//        System.out.println(customer);
//        System.out.println(sim);

        System.out.println("C ->" + customer.getName());
        for (SimCard simCard : customer.getSimCardList()) {
            System.out.println("\t" + simCard.getNumber());
        }
    }

}

*
*
*
* */