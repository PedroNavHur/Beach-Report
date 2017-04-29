package com.navhur.spaceappschallengepre_alpha;

import android.graphics.Color;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;


public class BeachInfoActivity extends AppCompatActivity implements OnMapReadyCallback {
    static final LatLng Beach = new LatLng(- 11.258975, -85.875848);
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach_info);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Beach Title
        String BeachTitle = getIntent().getStringExtra("title_key");

        TextView beachTitle = (TextView)findViewById(R.id.beachTitle);
        beachTitle.setText("Welcome To " + BeachTitle);

        TextView beachTitle2 = (TextView)findViewById(R.id.beachTitle2);
        beachTitle2.setText(BeachTitle);

        TextView beachTitle3 = (TextView)findViewById(R.id.beachTitle3);
        beachTitle3.setText(BeachTitle);

        //Beach Temperature
        String Temperature = getIntent().getStringExtra("temperature_key");
        TextView temperature = (TextView)findViewById(R.id.temperature);
        temperature.setText(Temperature);

        //Beach Wind
        String Wind = getIntent().getStringExtra("wind_key");
        TextView wind = (TextView)findViewById(R.id.wind);
        wind.setText(Wind);

        //Beach Precipitation
        String Precipitation = getIntent().getStringExtra("precipitation_key");
        TextView precipitation = (TextView)findViewById(R.id.precipitation);
        precipitation.setText(Precipitation);

        //Beach Humidity
        String Humidity = getIntent().getStringExtra("humidity_key");
        TextView humidity = (TextView)findViewById(R.id.humidity);
        humidity.setText(Humidity);

        //Beach UV Index
        String UvIndex = getIntent().getStringExtra("uvlight_key");
        TextView uvIndex = (TextView)findViewById(R.id.uvIndex);
        uvIndex.setText(UvIndex);

        //Beach Visibility
        String Visible = getIntent().getStringExtra("visibility_key");
        TextView visible = (TextView)findViewById(R.id.visibility);
        visible.setText(Visible);

        //Beach Description
        String BeachDescription = getIntent().getStringExtra("description_key");

        TextView beachDescription = (TextView)findViewById(R.id.beachDescription);
        beachDescription.setText(BeachDescription);

        //Beach Image
        String BeachImage = getIntent().getStringExtra("url_key");

        ImageView image = (ImageView)findViewById(R.id.beach_picture);
        Picasso.with(this).load(BeachImage).into(image);
        image.setColorFilter(Color.argb(100,0,150,136));

        ImageView image2 = (ImageView)findViewById(R.id.beach_picture2);
        Picasso.with(this).load(BeachImage).into(image2);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        String BeachLocation = getIntent().getStringExtra("location_key");
        String[] LatLngLocation = BeachLocation.split(",");
        double latitude = Double.parseDouble(LatLngLocation[0]);
        double longitude = Double.parseDouble(LatLngLocation[1]);

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng beach = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(beach).title(getString(R.string.map_marker)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(beach));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 15.0f ) );

    }


}
