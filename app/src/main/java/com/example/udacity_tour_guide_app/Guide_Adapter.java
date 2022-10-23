package com.example.udacity_tour_guide_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Guide_Adapter extends ArrayAdapter<Guide> {

    private final int  mColorResourceId ;

    public Guide_Adapter(@NonNull Context context, ArrayList<Guide> resource , int ColorResourceId) {
        super(context,0, resource);
        mColorResourceId = ColorResourceId ;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Guide current = getItem(position);
        TextView mName =(TextView) convertView.findViewById(R.id.Name_Of_Image);
        mName.setText(current.getNameOfImage());
        TextView mLocation = (TextView) convertView.findViewById(R.id.Name_Of_location);
        mLocation.setText(current.getNameOfLocation());
        TextView mPhone = (TextView) convertView.findViewById(R.id.Phone_Numb);
        mPhone.setText(current.getPhoneNumber());
        TextView mTime = (TextView) convertView.findViewById(R.id.Open_Time);
        mTime.setText(current.getOpenTime());
        ImageView imageView = (ImageView) convertView.findViewById(R.id.Image_View);
        imageView.setImageResource(current.getImage_resource());
        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext() , mColorResourceId);
        textContainer.setBackgroundColor(color);
        return convertView;
    }
}
