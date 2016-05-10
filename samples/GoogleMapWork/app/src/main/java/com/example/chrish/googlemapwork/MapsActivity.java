package com.example.chrish.googlemapwork;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a Uri from an intent string. Use the result to create an Intent.
        //        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=37.7749,-122.4194");

        // Search for San Francisco
        //        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");

        // Search for restaurants nearby
        //        Uri gmmIntentUri = Uri.parse("geo:0,0?q=restaurants");

        // Search for restaurants in San Francisco
        //        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?q=restaurants");

        // Searching for a specific address will display a pin at that location.
        //        Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain+View, California");

        // Searching for 'Main Street' will return too many results
        //        Uri gmmIntentUri = Uri.parse("geo:0,0?q=101+main+street");

        // Searches for 'Main Street' near San Francisco
        //        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?q=101+main+street");

        // Display a label at the location of Google's Sydney office
        //        Uri gmmIntentUri = Uri.parse("geo:0,0?q=-33.8666,151.1957(Google+Sydney)");

        // The below Intent will request turn-by-turn navigation to Taronga Zoo, in Sydney Australia:
        //        Uri gmmIntentUri = Uri.parse("google.navigation:q=Taronga+Zoo,+Sydney+Australia");

        // The below Intent will request turn-by-turn navigation to Taronga Zoo, in Sydney Australia:
        //        Uri gmmIntentUri = Uri.parse("google.navigation:q=Taipei+101+Mall");

        // If you prefer not to pay tolls or ride a ferry, you can request routing that tries to avoid those things.
        //        Uri gmmIntentUri = Uri.parse("google.navigation:q=Taipei+101+Mall&avoid=tf");

        // If you'd prefer a bit of exercise, you can request bicycling directions instead.
        //        Uri gmmIntentUri = Uri.parse("google.navigation:q=Taipei+101+Mall&mode=b");

        // Displays an image of the Swiss Alps
        //        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");

        // Uses a PanoID to show an image from Maroubra beach in Sydney, Australia
        //        Uri gmmIntentUri = Uri.parse("google.streetview:panoid=Iaa2JyfIggYAAAQfCZU9KQ");

        // Opens Street View between two Pyramids in Giza. The values passed to the
        // cbp parameter will angle the camera slightly up, and towards the east.
        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=29.9774614,31.1329645&cbp=0,30,0,0,-15");

        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the Intent
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }


}
