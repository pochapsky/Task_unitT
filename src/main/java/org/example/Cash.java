package org.example;

public class Cash {
    private int amount;

    Cash(int amount) {
        this.amount = amount;
    }

    void plus(int addend) {
        amount += addend;
    }

    boolean minus(int subtrahend) {
        if (amount >= subtrahend) {
            amount -= subtrahend;
            return true;
        } else {
            return false;
        }
    }

    int count() {
        return amount;
    }

    boolean transfer(int transfer) {
        if (amount >= transfer) {
            amount -= transfer;
            return true;
        } else {
            return false;
        }
    }
}
