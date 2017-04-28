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
                intent.putExtra("title", beach.getTittle());
                context.startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


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
