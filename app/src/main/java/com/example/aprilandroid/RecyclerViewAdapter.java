package com.example.aprilandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<MyListData> listData;

    public RecyclerViewAdapter(List<MyListData> listData) {
        this.listData=listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());

        View listItem=layoutInflater.inflate(R.layout.rv_list_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        holder.tvname.setText(listData.get(position).getName());
        holder.tvdes.setText(listData.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivimg;
        public TextView tvname;
        public TextView tvdes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivimg=itemView.findViewById(R.id.ivimg);
            tvname=itemView.findViewById(R.id.tvname);
            tvdes=itemView.findViewById(R.id.tvdes);
        }
    }
}
