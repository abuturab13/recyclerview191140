package com.example.recyclerview_191140;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView Recycleview;
    Adaplass adaplass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recycleview =findViewById(R.id.Rview);

        Recycleview.setLayoutManager(new LinearLayoutManager(this));

        String cars[]= {"bugatti","mercedes","bmw","porshe","lamborghini""honda","toyota","lexus"};

        Recycleview.setAdapter(new Adaplass(cars ));

    }

    @Override

    public void deletebtn(int position) {

        cars.remove(position);


    }
}