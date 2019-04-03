package com.example.learnagriculture.Controller;

import com.example.learnagriculture.Model.Sujetconstructor;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Liste {

    @SerializedName("liste")
    @Expose
    public List<Sujetconstructor> liste;

    public List<Sujetconstructor> getListe(){ return liste; };
}
