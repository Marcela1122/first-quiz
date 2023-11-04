package org.velezreyes.quiz.question6;

public class KarenTea implements Drink {

    private String name;
    private boolean fizzy;

    public KarenTea() {
        this.name = "KarenTea";
        this.fizzy = false;
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
