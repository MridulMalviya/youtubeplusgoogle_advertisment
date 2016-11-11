package com.malviya.ankurmalviya.activity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.malviya.ankurmalviya.R;
import com.malviya.ankurmalviya.constant.ConstantValue;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar(View.VISIBLE);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v = view;
                onSendMail(v);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    void setupToolbar(int view) {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setVisibility(view);
        setSupportActionBar(toolbar);
        // Adding menu icon to Toolbar
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        exitDialog();
        //Toast.makeText(this,"onBackPressed",Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        }
    }

    private void exitDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNeutralButton("Subscribe", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        subscribe();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }

    private void subscribe() {
        Intent intent = null;
        try {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setPackage("com.google.android.youtube");
            intent.setData(Uri.parse(ConstantValue.URL));
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(ConstantValue.URL));
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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
            subscribe();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_exergy) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("VMBzxLq6b-0");
            startActivity(intent);
        } else if (id == R.id.nav_maxwell) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("81vY30roEpY");
            startActivity(intent);

        } else if (id == R.id.nav_clausicus) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("sux6x2MlyJU");
            startActivity(intent);

        } else if (id == R.id.nav_referigerator) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("qvaanJvycfY");
            startActivity(intent);

        } else if (id == R.id.nav_ant) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("6xTThyC-faI");
            startActivity(intent);

        } else if (id == R.id.nav_concept) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("5kY-9dxXevY");
            startActivity(intent);

        } else if (id == R.id.nav_shear) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("Yz0v_Xc6G8Q");
            startActivity(intent);

        } else if (id == R.id.nav_clausius_inequality) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("fWsySG9zq70");
            startActivity(intent);

        } else if (id == R.id.nav_centroid) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            VideoDisplay.videoLink("6WhpfTgy5-8");
            startActivity(intent);

        } else if (id == R.id.nav_calculate) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            VideoDisplay.videoLink("LJCmO5pK9lg");
            startActivity(intent);

        } else if (id == R.id.nav_axis) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            VideoDisplay.videoLink("9nL9EGlcSQk");
            startActivity(intent);
        } else if (id == R.id.nav_axix_part2) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            VideoDisplay.videoLink("illwkZnBW-s");
            startActivity(intent);
        } else if (id == R.id.nav_lever_rule) {
            VideoDisplay.videoLink("chrzkzQVQEU");
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else if (id == R.id.nav_beams) {
            VideoDisplay.videoLink("I3MMt1HfY7U");
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else if (id == R.id.nav_friction_concept) {
            Intent intent = new Intent(this, VideoDisplay.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            VideoDisplay.videoLink("fLNrqnLxH6c");
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            onClickWhatsApp(v);
        } else if (id == R.id.nav_send) {
            onSendMail(v);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void onClickWhatsApp(View view) {

        PackageManager pm = getPackageManager();
        try {

            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            waIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            waIntent.setType("text/plain");

            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, ConstantValue.TITLE);
            waIntent.putExtra(Intent.EXTRA_TEXT, ConstantValue.SUBSCRIBE);
            startActivity(Intent.createChooser(waIntent, "Share with"));

        } catch (PackageManager.NameNotFoundException e) {
            Snackbar.make(view, "WhatsApp not Installed", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

    }

    public void onSendMail(View view) {
        try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            waIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //need this to prompts email client only
            waIntent.setType("message/rfc822");
            //Check if package exists or not. If not then code
            //in catch block will be called
            waIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mentors.mech@gmail.com", "ankur.malviya8@gmail.com "});
            startActivity(Intent.createChooser(waIntent, "Share with"));

        } catch (Exception e) {
            Snackbar.make(view, "Gmail is  not Installed", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
/*
    @Override
    protected void onResume() {
        if (adView != null) {
            adView.resume();
        }
        super.onResume();
    }

    @Override
    protected void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }*/
}
