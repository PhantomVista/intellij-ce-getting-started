package com.pluralsight.fruit;

public class Orange implements IFruit {


    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    int foo = 0;
    int bar = 0;
    String string == "";;
    ;;
    @Override
    public String getName() {
        return "Orange";
    }

    @Override
    public int getRollMultiplier() {
        return 100;
    }
}
