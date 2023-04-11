package org.example;

public class Van {
    private Van previous;
    private Van next;
    private boolean isLight;

    public Van(Van previous, Van next, boolean isLight) {
        this.previous = previous;
        this.next = next;
        this.isLight = isLight;
    }

    public Van getPrevious() {
        return previous;
    }

    public void setPrevious(Van previous) {
        this.previous = previous;
    }

    public Van getNext() {
        return next;
    }

    public void setNext(Van next) {
        this.next = next;
    }

    public boolean isLight() {
        return isLight;
    }

    public void setLight(boolean light) {
        isLight = light;
    }
}
