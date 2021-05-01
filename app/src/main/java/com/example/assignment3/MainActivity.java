package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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


        myAdapter = new PersonAdapter(this,person);
        recyclerView.setAdapter(myAdapter);


    }
}