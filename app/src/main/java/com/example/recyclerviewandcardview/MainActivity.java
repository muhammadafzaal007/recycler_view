package com.example.recyclerviewandcardview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.CarAdapter;
import Models.CarModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.reView) ;

        ArrayList<CarModel> arrlist = new ArrayList<>();

         // Adding items: with your actual drawable names
        arrlist.add(new CarModel(R.drawable.one, "Air Max Jogger"));
        arrlist.add(new CarModel(R.drawable.two, "Revolution Jogger"));
        arrlist.add(new CarModel(R.drawable.three, "Pegasus Runner"));
        arrlist.add(new CarModel(R.drawable.four, "React Infinity Jogger"));
        arrlist.add(new CarModel(R.drawable.five, "ZoomX Vaporfly Jogger"));

        CarAdapter adapter = new CarAdapter(arrlist, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}