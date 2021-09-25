package com.example.listviewflowers;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;



public class FlowerAdapter extends BaseAdapter {
    ArrayList<Flowers> arrList;
    MainActivity mainActivity;

    public FlowerAdapter(ArrayList<Flowers> arrList, MainActivity mainActivity) {
        this.arrList=arrList;
        this.mainActivity=mainActivity;
    }

    @Override
    public int getCount() {
        return arrList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(mainActivity);
        View v = inflater.inflate(R.layout.list_items , null);

        Flowers flowers = arrList.get(i);
        ImageView img = v.findViewById(R.id.imgFlower);
        img.setImageResource(flowers.Image);

        TextView txtTitle = v.findViewById(R.id.txtTitle);
        txtTitle.setText(flowers.Title);

        TextView txtDescription = v.findViewById(R.id.txtDescription);
        txtDescription.setText(flowers.Description);

        Button btnDelete = v.findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                txtTitle.setText("");
                txtDescription.setText("");

            }
        });


        return v;
    }
}
