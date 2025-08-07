/*
*
* package com.mftplus.relations2;

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

public class Customer  {
    private int id;
    private String name;
    private ArrayList<SimCard> simCardList;

    public void addSimCards(SimCard ... simCards){
        if(simCardList == null){
            simCardList = new ArrayList<>();
        }

        for(SimCard sim:simCards){
            if(sim.getOwner() == null) {
                simCardList.add(sim);
                sim.setOwner(this);
            }else{
                System.out.println("محضر");
            }
        }
    }
}

*
*
*
* */