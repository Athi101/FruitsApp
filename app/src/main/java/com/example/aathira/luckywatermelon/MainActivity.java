package com.example.aathira.luckywatermelon;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter fruitAdapter;


  private ArrayList<Fruit> fruitsList= new ArrayList<Fruit>();

    @BindView(R.id.rv_fruits_list_view)
    RecyclerView fruitRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        fruitAdapter = new FruitAdapter(createFruits());

        fruitRecyclerView.setAdapter(fruitAdapter);

    }


    public ArrayList <Fruit> createFruits(){
        fruitsList = new ArrayList<>();
        fruitsList.add(new Fruit("Apple", R.drawable.apple));
        fruitsList.add(new Fruit("Banana", R.drawable.banana));
        fruitsList.add(new Fruit("Blueberry", R.drawable.blueberries));
        fruitsList.add(new Fruit("Cherry", R.drawable.cherries));
        fruitsList.add(new Fruit("Lemon", R.drawable.lemon));
        fruitsList.add(new Fruit("Orange", R.drawable.orange));
        fruitsList.add(new Fruit("Peach", R.drawable.peach));
        fruitsList.add(new Fruit("Pear", R.drawable.pear));
        fruitsList.add(new Fruit("Pineapple", R.drawable.pineapple));
        fruitsList.add(new Fruit("Raspberry", R.drawable.raspberry));
        fruitsList.add(new Fruit("Strawberry", R.drawable.strawberry));
        fruitsList.add(new Fruit("Watermelon", R.drawable.watermelon));

        return fruitsList;
    }






}

