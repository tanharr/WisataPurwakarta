package com.tanhar.wisatapurwakarta.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Kharismawan Tanhar on 22-11-2021.
 */

public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}
