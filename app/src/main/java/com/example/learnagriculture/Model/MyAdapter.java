package com.example.learnagriculture.Model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.learnagriculture.View.ListSujets;
import com.example.learnagriculture.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    public Context context;
    public List<Sujetconstructor> listSujets;
    public LayoutInflater inflater;

    public MyAdapter(List<Sujetconstructor> listSujets, ListSujets listsujet){
        this.listSujets=listSujets;
        this.context=listsujet;
    }
    @Override
    public int getItemCount() {
        return listSujets.size();
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.activity_adapter,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( final ViewHolder viewHolder, final int i) {
        viewHolder.name.setText(listSujets.get(i).getName());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                /*Intent intent = new Intent(context, SecondActivity.class);
                context.startActivity(intent);*/
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        View layout;

        ViewHolder( View v) {
            super(v);
            layout=v;
            name=v.findViewById(R.id.sujet_name);
        }
    }
}
