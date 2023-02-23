package com.ho.study.tdd.money;

public class Franc extends Money  {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc time(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
