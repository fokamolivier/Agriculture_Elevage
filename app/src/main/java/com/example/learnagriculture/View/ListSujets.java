package com.example.learnagriculture.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.learnagriculture.Controller.ControlerAgriculture;
import com.example.learnagriculture.Model.MyAdapter;
import com.example.learnagriculture.Model.Sujetconstructor;
import com.example.learnagriculture.R;

import java.util.List;

public class ListSujets extends AppCompatActivity {

    private ControlerAgriculture controlerAgriculture;

    private RecyclerView listview;
    private RecyclerView.Adapter myadapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sujets);

        Intent intent = getIntent();

        listview = findViewById(R.id.my_recycler_view);

        controlerAgriculture = new ControlerAgriculture(this);

        controlerAgriculture.onCreate();
    }

    public  void showlist(final List<Sujetconstructor> list){
        layoutManager = new LinearLayoutManager(this);
        listview.setLayoutManager(layoutManager);
        myadapter=new MyAdapter(list, this);
        listview.setAdapter(myadapter);

    }

}





