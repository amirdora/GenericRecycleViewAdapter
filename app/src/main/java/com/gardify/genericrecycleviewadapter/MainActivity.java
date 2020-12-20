package com.gardify.genericrecycleviewadapter;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gardify.genericrecycleviewadapter.Utils.RecyclerViewGenericAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewGenericAdapter.OnItemClickListener<Pet>,
        RecyclerViewGenericAdapter.OnItemClickListenerHeader<PetHeader>, RecyclerViewGenericAdapter.OnItemClickListenerFooter<PetFooter> {

    private RecyclerView testRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testRecycleView = findViewById(R.id.test_recycleview);

        PetHeader petHeader = new PetHeader("headerName", "pictureUrl");

        ArrayList<Pet> pet = new ArrayList<>();
        pet.add(new Pet("a","aa"));
        pet.add(new Pet("b","bb"));
        pet.add(new Pet("c","cc"));
        pet.add(new Pet("d","dd"));
        pet.add(new Pet("e","ee"));

        PetFooter petFooter = new PetFooter("footerName", "pictureUrl");

        RecyclerViewGenericAdapter<Pet, PetHeader, PetFooter> adapter = new RecyclerViewGenericAdapter<>(pet,
                R.layout.test_pet_row, petHeader, R.layout.test_pet_row_header, null,
                R.layout.test_pet_row_footer, this,this,
                this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        testRecycleView.setLayoutManager(layoutManager);

        testRecycleView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(Pet position) {
        Toast.makeText(this, "clicked " + position.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClickHeader(PetHeader position) {

    }

    @Override
    public void onItemClickFooter(PetFooter position) {

    }
}