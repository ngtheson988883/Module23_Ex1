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
import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<Employee> {
    private List<Employee> listEmp;
    private Activity context;
    private int layout;

    public MyArrayAdapter(@NonNull Activity context, int resource, @NonNull List<Employee> objects) {
        super(context, resource, objects);
        this.listEmp=objects;
        this.layout=resource;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        convertView = inflater.inflate(layout, null);

        TextView tv_info = convertView.findViewById(R.id.tv_info);
        tv_info.setText(listEmp.get(position).toString());

        ImageView iv_gender = convertView.findViewById(R.id.iv_gender);
        if(listEmp.get(position).isGender()){
            iv_gender.setImageResource(R.drawable.ic_launcher_background);
        } else {
            iv_gender.setImageResource(R.drawable.ic_launcher_background);
        }

        return convertView;
    }
}
