package org.velezreyes.quiz.question6;

public class ScottCola implements Drink {

    private String name;
    private boolean fizzy;

    public ScottCola() {
        this.name = "ScottCola";
        this.fizzy = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return fizzy;
    }
}
