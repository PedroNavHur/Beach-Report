package com.navhur.spaceappschallengepre_alpha;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.app.Fragment;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Intent phoneIntent = new Intent(Intent.ACTION_DIAL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_main
                        , new HomeFragment())
                .commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
            }
        }, 100);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.call_an_ambulance) {
            phoneIntent.setData(Uri.parse("tel:*102"));
            startActivity(phoneIntent);
            return true;
        }
        if (id == R.id.call_the_firefighters) {
            phoneIntent.setData(Uri.parse("tel:*911"));
            startActivity(phoneIntent);
            return true;
        }
        if (id == R.id.call_the_police) {
            phoneIntent.setData(Uri.parse("tel:*118"));
            startActivity(phoneIntent);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_home) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_main
                            , new HomeFragment())
                    .commit();

        } else if (id == R.id.nav_beaches) {
            Intent intent = new Intent(this, BeachesListActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_compare) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_main
                            , new CompareFragment())
                    .commit();

        } else if (id == R.id.nav_about) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_main
                            , new AboutFragment())
                    .commit();

        } else if (id == R.id.nav_contact) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_main
                            , new ContactFragment())
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void sendNotification(View view) {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this);

//Create the intent that’ll fire when the user taps the notification//

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ineter.gob.ni/articulos/areas-tecnicas/geofisica/monitoreo-de-sismos-en-tiempo-real.html"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        mBuilder.setContentIntent(pendingIntent);

        mBuilder.setSmallIcon(R.drawable.ic_palm_tree);
        mBuilder.setContentTitle("Alerta de Sismo");
        mBuilder.setContentText("Sismo detectado tome precaucion en la playa");
        mBuilder.setColor(getResources().getColor(R.color.colorPrimaryOrange));

        NotificationManager mNotificationManager =

                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(001, mBuilder.build());
    }

    public void sendNotification2(View view) {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this);

//Create the intent that’ll fire when the user taps the notification//

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ineter.gob.ni/articulos/areas-tecnicas/geofisica/monitoreo-de-sismos-en-tiempo-real.html"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        mBuilder.setContentIntent(pendingIntent);

        mBuilder.setSmallIcon(R.drawable.ic_waves);
        mBuilder.setContentTitle("Alerta de Tsunami");
        mBuilder.setContentText("Tsunami detectado alejese de la playa");
        mBuilder.setColor(getResources().getColor(R.color.colorPrimary));

        NotificationManager mNotificationManager =

                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(001, mBuilder.build());
    }

}
