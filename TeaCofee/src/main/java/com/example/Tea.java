package com.example;

public class Tea implements Drink {
    private boolean sugar;

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public void typeOfDrink() {
        System.out.println("Tea is the drink");
    }

    @Override
    public void valueOfDrink() {
        System.out.println("Value is 10");
    }

    public void checkSugarAdded() {
        if (sugar) {
            System.out.println("Sugar is added to the tea.");
        } else {
            System.out.println("No sugar is added to the tea.");
        }
    }
}

