package com.example.listviewflowers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView flowersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowersList = findViewById(R.id.flowersList);

        ArrayList<Flowers> arrList = new ArrayList<Flowers>();
        arrList.add(new Flowers("Flowers" , "beautiful" , R.drawable.image1));
        arrList.add(new Flowers("Flowers" , "beautiful" , R.drawable.image2));
        arrList.add(new Flowers("Flowers" , "beautiful" , R.drawable.image3));

        FlowerAdapter adapter = new FlowerAdapter(arrList , this);
        flowersList.setAdapter(adapter);

    }
}