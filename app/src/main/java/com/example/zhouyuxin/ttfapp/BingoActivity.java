package com.example.zhouyuxin.ttfapp;

import android.content.Intent;
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

public class BingoActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo);
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
                intent.setClass(BingoActivity.this, MemberActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_findfactory:
                intent.setClass(BingoActivity.this, FactoryActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_nearfactory:
                intent.setClass(BingoActivity.this, NearFactoryActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_store:
                intent.setClass(BingoActivity.this, StoreActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_newinformation:
                intent.setClass(BingoActivity.this, NewinformationActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_bingo:
                intent.setClass(BingoActivity.this,BingoActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_album:
                intent.setClass(BingoActivity.this,AlbumActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_pockage:
                intent.setClass(BingoActivity.this,PockageActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_set:
                intent.setClass(BingoActivity.this,SetActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_aboutme:
                intent.setClass(BingoActivity.this,AboutmeActivity.class);
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
