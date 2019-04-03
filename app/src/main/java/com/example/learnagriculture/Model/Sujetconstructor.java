package com.example.learnagriculture.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sujetconstructor {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("texte")
    @Expose
    private String texte;

    public String getName() {
        return name;
    }
    public String getTexte(){ return texte; }

    public void setName(String name) {
        this.name = name;
    }
    public void setTexte(String texte){ this.texte = texte;}
}
