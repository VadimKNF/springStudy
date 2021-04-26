package org.example;

public enum Ganres {
    ROCK("ROCK"),
    RAP("RAP"),
    CLASSICAL("CLASSICAL");

    private String ganre;

    Ganres(String ganre) {
        this.ganre = ganre;
    }

    public String getGanre() {
        return ganre;
    }
}
