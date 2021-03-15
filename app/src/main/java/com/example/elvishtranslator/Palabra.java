package com.example.elvishtranslator;

public class Palabra {
    private String espanyol;
    private String eflico;

    public Palabra(String espanyol, String eflico) {
        this.espanyol = espanyol;
        this.eflico = eflico;
    }

    public String getEspanyol() {
        return espanyol;
    }

    public String getEflico() {
        return eflico;
    }
}
