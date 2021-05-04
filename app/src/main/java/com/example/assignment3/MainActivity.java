package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewFvrt;
    RecyclerView.LayoutManager fvrtManager;
    RecyclerView.Adapter myAdapterFvrt;
    ArrayList<FvrtPerson> fvrtPerson;


    RecyclerView recyclerView;
    RecyclerView.LayoutManager manager;
    RecyclerView.Adapter myAdapter;
    ArrayList<Person> person;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        recyclerViewFvrt = findViewById(R.id.listFavourite);
        recyclerViewFvrt.setHasFixedSize(true);

        fvrtManager = new LinearLayoutManager(this);
        recyclerViewFvrt.setLayoutManager(fvrtManager);
        fvrtPerson = new ArrayList<>();
        fvrtPerson.add(new FvrtPerson("Zeeshan","zee"));
        fvrtPerson.add(new FvrtPerson("Mubashir","mub"));
        fvrtPerson.add(new FvrtPerson("Humza","hum"));
        fvrtPerson.add(new FvrtPerson("Hannan","han"));
        fvrtPerson.add(new FvrtPerson("Ali","ali"));
        fvrtPerson.add(new FvrtPerson("Zeeshan","zee"));
        fvrtPerson.add(new FvrtPerson("Mubashir","mub"));
        fvrtPerson.add(new FvrtPerson("Humza","hum"));
        fvrtPerson.add(new FvrtPerson("Hannan","han"));
        fvrtPerson.add(new FvrtPerson("Ali","ali"));






        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        person = new ArrayList<>();
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Zeeshan", "Farooq","03244982181"));
        person.add(new Person("Mango", "Athar","03209472155"));
        person.add(new Person("Party", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));
        person.add(new Person("Mubashir", "Athar","03209472155"));



        myAdapterFvrt = new FavouritePersonAdapter(this,fvrtPerson);

        // these 2 lines down below used to display CardView horizontly
       GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1, GridLayoutManager.HORIZONTAL,false);
        recyclerViewFvrt.setLayoutManager(gridLayoutManager);
        recyclerViewFvrt.setAdapter(myAdapterFvrt);



        myAdapter = new PersonAdapter(this,person);
        recyclerView.setAdapter(myAdapter);


    }
}