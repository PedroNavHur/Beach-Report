package com.navhur.spaceappschallengepre_alpha;

import android.graphics.Color;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;


public class BeachInfoActivity extends AppCompatActivity implements OnMapReadyCallback {
    static final LatLng Beach = new LatLng(- 11.258975, -85.875848);
    private GoogleMap mMap;

    //String BeachTitle = getIntent().getStringExtra("title");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach_info);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ImageView image = (ImageView)findViewById(R.id.beach_picture);
        Picasso.with(this).load("http://property-nicaragua.com/pedrodev/wp-content/uploads/2015/01/san-juan-del-sur-bay-REMAX-Slider.012615.jpg").into(image);
        image.setColorFilter(Color.argb(100,0,150,136));

        ImageView image2 = (ImageView)findViewById(R.id.beach_picture2);
        Picasso.with(this).load("http://property-nicaragua.com/pedrodev/wp-content/uploads/2015/01/san-juan-del-sur-bay-REMAX-Slider.012615.jpg").into(image2);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(11.258975, -85.875848);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Ya Podemos ir a San Juan!"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}
