package com.example.nguyentheson.module23_ex1;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter {
    private Activity context;
    private int layout;
    private List<Employee> list;

    public CustomArrayAdapter(@NonNull Activity context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.list=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        convertView = inflater.inflate(layout,null);

        TextView tvInfo = convertView.findViewById(R.id.tv_info);
        tvInfo.setText(list.get(position).toString());

        ImageView ivGender = convertView.findViewById(R.id.iv_gender);
        ivGender.setImageResource(R.drawable.ic_launcher_background);

        return convertView;
    }
}
