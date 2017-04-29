package com.navhur.spaceappschallengepre_alpha;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BeachesListActivity extends AppCompatActivity {
    private List<Beach> beachList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BeachAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches_list);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BeachAdapter(beachList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        prepareBeachData();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Beach beach = beachList.get(position);
                Toast.makeText(getApplicationContext(), beach.getTittle() + " is selected!", Toast.LENGTH_SHORT).show();

                Context context = view.getContext();
                Intent intent = new Intent(context, BeachInfoActivity.class);
                intent.putExtra("title_key", beach.getTittle());
                intent.putExtra("location_key", beach.getLocation2());
                intent.putExtra("description_key", beach.getDescription());
                intent.putExtra("temperature_key", beach.getTemperature());
                intent.putExtra("wind_key", beach.getWind());
                intent.putExtra("precipitation_key", beach.getPrecipitation());
                intent.putExtra("humidity_key", beach.getHumidity());
                intent.putExtra("uvlight_key", beach.getUvlight());
                intent.putExtra("visibility_key", beach.getVisibility());
                intent.putExtra("url_key", beach.getUrl());
                context.startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


    }

    private void prepareBeachData(){
        Beach beach = new Beach("San Juan del Sur",
                "San Juan del Sur, Rivas","11.258975, -85.875848",
                "Nicaragua",
                "Preciosa bahía en forma de medialuna, rodeada de picos montañosos, es el destino turístico más popular en Nicaragua. Es uno de los dos puertos del país que recibe cruceros internacionales.",
                "34°","23 km/h",
                "20%","65%",
                "10","14 KM",
                "http://property-nicaragua.com/pedrodev/wp-content/uploads/2015/01/san-juan-del-sur-bay-REMAX-Slider.012615.jpg");
        beachList.add(beach);

        beach = new Beach("Playa la Flor",
                "San Juan del Sur, Rivas","11.142666, -85.794683",
                "Nicaragua",
                "Playa La Flor es reserva natural, una de las pocas playas en el mundo donde las tortugas Paslama llegan a dejar sus huevos. La reserva mide más de 3,000 hectáreas y está a 22 kilómetros de San Juan del Sur.",
                "34°","23 km/h",
                "20%","65%",
                "10","14 KM",
                "http://www.go2sanjuandelsur.com/albums/folder_57/35682213.jpg");
        beachList.add(beach);

        beach = new Beach("Playa la Flor",
                "San Juan del Sur, Rivas","11.142666, -85.794683",
                "Nicaragua",
                "Playa La Flor es reserva natural, una de las pocas playas en el mundo donde las tortugas Paslama llegan a dejar sus huevos. La reserva mide más de 3,000 hectáreas y está a 22 kilómetros de San Juan del Sur.",
                "34°","23 km/h",
                "20%","65%",
                "10","14 KM",
                "http://www.go2sanjuandelsur.com/albums/folder_57/35682213.jpg");
        beachList.add(beach);






        mAdapter.notifyDataSetChanged();
    }

}
