package com.example.zhouyuxin.ttfapp;

import com.google.android.gms.maps.model.LatLng;

public class County {
    private LatLng location;
    private String label;
    public County(LatLng loc, String lab){
        this.location = loc;
        this.label = lab;
    }
    public LatLng getLocation() { return location; }
    public String getLabel() { return label; }
}
