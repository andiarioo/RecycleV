package com.example.recyclev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewHero;
    private List<HeroModel> models = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewHero = findViewById(R.id.rv_hero);
        recyclerViewHero.setHasFixedSize(true);
        models.addAll(HeroDatabase.getListData());
        recyclerViewHero.setLayoutManager(new LinearLayoutManager(this));
        HeroRecyclerAdapter adapter = new HeroRecyclerAdapter(models);
        adapter.setOnItemClickCallback(new HeroRecyclerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(HeroModel data) {
                Intent intent = new Intent(MainActivity.this, com.example.recyclev.NewActivity.class);
                intent.putExtra(com.example.recyclev.NewActivity.name, data.getName());
                intent.putExtra(com.example.recyclev.NewActivity.detail, data.getSummary());
                intent.putExtra(com.example.recyclev.NewActivity.photo, data.getPhoto());
                startActivity(intent);
            }
        });
        recyclerViewHero.setAdapter(adapter);
    }

}