package com.navhur.spaceappschallengepre_alpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
        recyclerView.setAdapter(mAdapter);

        prepareBeachData();
    }

    private void prepareBeachData(){
        Beach beach = new Beach("San Juan del Sur","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 2","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 3","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 4","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        beach = new Beach("San Juan del Sur 5","Rivas","- 11.258975, -85.875848","Nicaragua","Una Playa");
        beachList.add(beach);

        mAdapter.notifyDataSetChanged();
    }

}
