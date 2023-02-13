package com.vs.gestioncontactapp;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ContactAdapter extends ArrayAdapter {
    public ContactAdapter(@NonNull Context context, int resource,Contact[] obj) {
        super(context,resource,obj);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Contact contact = (Contact) getItem(position);
        if(convertView== null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view,parent,false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvFirstname = (TextView) convertView.findViewById(R.id.firstname);
        TextView tvBirthDate = (TextView) convertView.findViewById(R.id.birthDate);
        ImageView ivImg =(ImageView)convertView.findViewById(R.id.img);
        tvName.setText(contact.getName());
        tvFirstname.setText(contact.getFirstname());
        tvBirthDate.setText(contact.getBirthDate());
        ivImg.setImageResource(R.drawable.smiley);

        tvName.setTextColor(Color.BLACK);
        tvFirstname.setTextColor(Color.BLACK);
        tvBirthDate.setTextColor(Color.BLACK);
       // ivImg.setSize

        return convertView;
    }
}
