package com.example.zhouyuxin.ttfapp;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.zhouyuxin.ttfapp.R;

public class AreaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Intent intent = new Intent();
        switch(item.getItemId()) {
            case R.id.nav_member:
                intent.setClass(AreaActivity.this, MemberActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_findfactory:
                intent.setClass(AreaActivity.this, FactoryActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_nearfactory:
                intent.setClass(AreaActivity.this, NearFactoryActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_store:
                intent.setClass(AreaActivity.this, StoreActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_newinformation:
                intent.setClass(AreaActivity.this, NewinformationActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_bingo:
                intent.setClass(AreaActivity.this,BingoActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_album:
                intent.setClass(AreaActivity.this,AlbumActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_pockage:
                intent.setClass(AreaActivity.this,PockageActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_set:
                intent.setClass(AreaActivity.this,SetActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_aboutme:
                intent.setClass(AreaActivity.this,AboutmeActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
