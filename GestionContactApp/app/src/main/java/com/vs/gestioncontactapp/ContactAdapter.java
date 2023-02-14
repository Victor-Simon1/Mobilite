package com.vs.gestioncontactapp;


import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

import org.w3c.dom.Text;

public class ContactAdapter extends ArrayAdapter {

    static class ViewHolder
    {
        TextView firstname;
        TextView name;
        TextView birthdate;
        ImageView img;
        ViewHolder(TextView firstname, TextView name,TextView birthdate,ImageView img)
        {
            this.firstname = firstname;
            this.name = name;
            this.birthdate = birthdate;
            this.img = img;
        }
    }
    public ContactAdapter(@NonNull Context context, int resource,Contact[] obj) {
        super(context,resource,obj);
    }
    private ViewHolder createViewHolderFrom(View view) {
        TextView firstname = (TextView) view.findViewById(R.id.name);
        TextView name = (TextView) view.findViewById(R.id.firstname);
        TextView birthdate = (TextView) view.findViewById(R.id.birthDate);
        ImageView img = (ImageView)view.findViewById(R.id.img);
        name.setTextColor(Color.BLACK);
        firstname.setTextColor(Color.BLACK);
        birthdate.setTextColor(Color.BLACK);
      //  ProgressBar progress = (ProgressBar) view.findViewById(R.id.progress_spinner);

        return new ViewHolder(firstname, name, birthdate,img);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = convertView;
        Contact contact = (Contact) getItem(position);
      //  ViewHolder holder;
        if(view== null)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
            //holder = createViewHolderFrom(view);
           // view.setTag(holder);
        }
     //   else holder = (ViewHolder) view.getTag();
        TextView tvName = (TextView) view.findViewById(R.id.name);
        TextView tvFirstname = (TextView) view.findViewById(R.id.firstname);
        TextView tvBirthDate = (TextView) view.findViewById(R.id.birthDate);
        ImageView ivImg =(ImageView)view.findViewById(R.id.img);
        tvName.setText(contact.getName());
        tvFirstname.setText(contact.getFirstname());
        tvBirthDate.setText(contact.getBirthDate());
        ivImg.setImageResource(R.drawable.smiley);
        if(contact.isClicked())
        {
            tvName.setTextColor(Color.RED);
            tvFirstname.setTextColor(Color.RED);
            tvBirthDate.setTextColor(Color.RED);
        }
        else {
            tvName.setTextColor(Color.BLACK);
            tvFirstname.setTextColor(Color.BLACK);
            tvBirthDate.setTextColor(Color.BLACK);
        }


     /*   holder.birthdate.setText(contact.getBirthDate());
        holder.name.setText(contact.getName());
        holder.firstname.setText(contact.getFirstname());
        holder.img.setImageResource(R.drawable.smiley);*/
       // ivImg.setSize

        return view;
    }
}
