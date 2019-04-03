package com.example.learnagriculture.Controller;

import android.widget.Toast;

import com.example.learnagriculture.Model.Sujetconstructor;
import com.example.learnagriculture.View.ListSujets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ControlerAgriculture {

    private ListSujets listesujet;

    public ControlerAgriculture (ListSujets listesujet){
        this.listesujet = listesujet;
    }

    protected void onCreate() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fokamolivier.github.io/apifokam/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        API myAPI = retrofit.create(API.class);

        Call<Liste> call = myAPI.getListSujets();
        call.enqueue(new Callback<Liste>() {
            @Override
            public void onResponse(Call<Liste> call, Response<Liste> response) {
                if (response.isSuccessful()) {
                    Liste liste = response.body();
                    assert liste != null;

                    List<Sujetconstructor> list = new ArrayList<>();

                    for (int i = 0; i < liste.getListe().size(); i++){
                        Sujetconstructor sujetconstructor = new Sujetconstructor();
                        sujetconstructor.setName(liste.getListe().get(i).getName());
                        sujetconstructor.setTexte((liste.getListe().get(i).getTexte()));
                        list.add(sujetconstructor);
                    }
                    listesujet.showlist(list);
                }
            }

            @Override
            public void onFailure(Call<Liste> call, Throwable t) {
                Toast.makeText(listesujet, "erreur", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
