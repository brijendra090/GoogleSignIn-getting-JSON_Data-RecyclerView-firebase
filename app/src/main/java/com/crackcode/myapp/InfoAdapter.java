package com.crackcode.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {

    private Context mContext;
    private List<Info> infoList;

    InfoAdapter(Context mContext, List<Info> infoList) {
        this.mContext = mContext;
        this.infoList = infoList;
    }

    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.info_layout, parent, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder holder, int position) {
        Info info = infoList.get(position);
        holder.textViewId.setText(String.valueOf(info.getId()));
        holder.textViewName.setText(info.getName());
        holder.textViewEmail.setText(info.getEmail());
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class InfoViewHolder extends RecyclerView.ViewHolder{

        TextView textViewId, textViewName, textViewEmail;

        InfoViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewId=itemView.findViewById(R.id.id);
            textViewName=itemView.findViewById(R.id.name);
            textViewEmail=itemView.findViewById(R.id.email);
        }
    }
}
