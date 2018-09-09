package com.earthquake.archi.earthquake;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.SphericalUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    public TextView txtView;
    double x;
    double y;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2669d6")));
        TextView txtView = (TextView)findViewById(R.id.text);
        setContentView(R.layout.activity_maps);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        Button e;
        e = (Button) findViewById(R.id.enter);


        e.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        InputMethodManager inputManager = (InputMethodManager)
                                getSystemService(Context.INPUT_METHOD_SERVICE);

                        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                                InputMethodManager.HIDE_NOT_ALWAYS);
                        EditText edit = (EditText) findViewById(R.id.lat);
                        EditText edit2 = (EditText) findViewById(R.id.lon);
                        String content = edit.getText().toString();
                        String content2 = edit2.getText().toString();
                        //Toast.makeText(getApplicationContext(), content + content2, Toast.LENGTH_LONG).show();
                        x = Double.parseDouble(content);
                        y = Double.parseDouble(content2);
                        mMap.clear();
                        riskcalc(x,y);

                    }
                });}


        // Add a marker in milipitas earthquake and move the camera

    public void riskcalc(double x, double y) {

        LatLng quake1 = new LatLng(37.467, -121.820);
        LatLng quake2 = new LatLng(37.590, -121.967);
        LatLng quake3 = new LatLng(37.471, -121.821);
        LatLng quake4 = new LatLng(37.804, -122.211);
        LatLng quake5 = new LatLng(37.473, -121.821);
        LatLng quake6 = new LatLng(37.467, -121.820);
        LatLng quake7 = new LatLng(38.843, -121.165);
        LatLng quake8 = new LatLng(37.886, -122.216);
        LatLng quake9 = new LatLng(37.326, -122.106);
        LatLng quake10 = new LatLng(38.785, -122.765);
        LatLng quake11 = new LatLng(37.360, -121.726);
        LatLng quake12 = new LatLng(38.754, -122.275);
        LatLng quake13 = new LatLng(38.824, -122.797);
        LatLng quake14 = new LatLng(38.785, -122.765);
        LatLng quake15 = new LatLng(38.036, -122.234);
        LatLng quake16 = new LatLng(37.473, -121.821);
        LatLng quake17 = new LatLng(37.335, -122.213);
        LatLng quake18 = new LatLng(38.793, -122.760);
        LatLng quake19 = new LatLng(37.133, -121.528);
        LatLng quake20 = new LatLng(38.117, -122.222);
        LatLng quake21 = new LatLng(38.771, -122.704);
        LatLng quake22 = new LatLng(37.747, -122.145);
        LatLng quake23 = new LatLng(38.791, -122.724);
        LatLng quake24 = new LatLng(37.901, -121.983);
        LatLng quake25 = new LatLng(38.828, -122.785);
        LatLng quake26 = new LatLng(38.827, -122.797);
        LatLng quake27 = new LatLng(38.792, -122.426);
        LatLng quake28 = new LatLng(38.793, -122.801);
        LatLng quake29 = new LatLng(38.071, -122.226);
        LatLng quake30 = new LatLng(38.823, -122.808);
        LatLng quake31 = new LatLng(38.847, -122.817);
        LatLng quake32 = new LatLng(37.901, -121.983);
        LatLng quake33 = new LatLng(38.803, -122.766);
        LatLng quake34 = new LatLng(37.901, -121.983);
        LatLng quake35 = new LatLng(38.071, -122.226);
        LatLng quake36 = new LatLng(38.117, -122.222);
        LatLng quake37 = new LatLng(37.857, -122.594);
        LatLng quake38 = new LatLng(37.130, -121.532);
        LatLng quake39 = new LatLng(38.343, -122.627);
        LatLng quake40 = new LatLng(37.857, -122.594);
        LatLng quake41 = new LatLng(37.75, -122.55);

        LatLng test = new LatLng(x, y);


        mMap.moveCamera(CameraUpdateFactory.newLatLng(test));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(7));

        double[] dists = new double[]{
                CalculationByDistance(quake1, test) / 1.60934,
                CalculationByDistance(quake2, test) / 1.60934,
                CalculationByDistance(quake3, test) / 1.60934,
                CalculationByDistance(quake4, test) / 1.60934,
                CalculationByDistance(quake5, test) / 1.60934,
                CalculationByDistance(quake6, test) / 1.60934,
                CalculationByDistance(quake7, test) / 1.60934,
                CalculationByDistance(quake8, test) / 1.60934,
                CalculationByDistance(quake9, test) / 1.60934,
                CalculationByDistance(quake10, test) / 1.60934,
                CalculationByDistance(quake11, test) / 1.60934,
                CalculationByDistance(quake12, test) / 1.60934,
                CalculationByDistance(quake13, test) / 1.60934,
                CalculationByDistance(quake14, test) / 1.60934,
                CalculationByDistance(quake15, test) / 1.60934,
                CalculationByDistance(quake16, test) / 1.60934,
                CalculationByDistance(quake17, test) / 1.60934,
                CalculationByDistance(quake18, test) / 1.60934,
                CalculationByDistance(quake19, test) / 1.60934,
                CalculationByDistance(quake20, test) / 1.60934,
                CalculationByDistance(quake21, test) / 1.60934,
                CalculationByDistance(quake22, test) / 1.60934,
                CalculationByDistance(quake23, test) / 1.60934,
                CalculationByDistance(quake24, test) / 1.60934,
                CalculationByDistance(quake25, test) / 1.60934,
                CalculationByDistance(quake26, test) / 1.60934,
                CalculationByDistance(quake27, test) / 1.60934,
                CalculationByDistance(quake28, test) / 1.60934,
                CalculationByDistance(quake29, test) / 1.60934,
                CalculationByDistance(quake30, test) / 1.60934,
                CalculationByDistance(quake31, test) / 1.60934,
                CalculationByDistance(quake32, test) / 1.60934,
                CalculationByDistance(quake33, test) / 1.60934,
                CalculationByDistance(quake34, test) / 1.60934,
                CalculationByDistance(quake35, test) / 1.60934,
                CalculationByDistance(quake36, test) / 1.60934,
                CalculationByDistance(quake37, test) / 1.60934,
                CalculationByDistance(quake38, test) / 1.60934,
                CalculationByDistance(quake39, test) / 1.60934,
                CalculationByDistance(quake40, test) / 1.60934,
                CalculationByDistance(quake41, test) / 1.60934,


                //divide by 1.60934 to convert to miles from KM

               /*1609.34 * SphericalUtil.computeDistanceBetween(quake1, test),
               SphericalUtil.computeDistanceBetween(quake2, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake3, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake4, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake5, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake6, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake7, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake8, test),
               1609.34 * SphericalUtil.computeDistanceBetween(quake9, test),*/


        };


        //Toast.makeText(getApplicationContext(),Arrays.toString(dists),Toast.LENGTH_LONG).show();

        Arrays.sort(dists);


        Polyline line2 = mMap.addPolyline(new PolylineOptions()
                .add(quake1, test)
                .width(5)
                .color(Color.RED));
        Polyline line3 = mMap.addPolyline(new PolylineOptions()
                .add(quake2, test)
                .width(5)
                .color(Color.RED));
        Polyline line4 = mMap.addPolyline(new PolylineOptions()
                .add(quake3, test)
                .width(5)
                .color(Color.RED));
        Polyline line5 = mMap.addPolyline(new PolylineOptions()
                .add(quake4, test)
                .width(5)
                .color(Color.RED));
        Polyline line6 = mMap.addPolyline(new PolylineOptions()
                .add(quake5, test)
                .width(5)
                .color(Color.RED));
        Polyline line7 = mMap.addPolyline(new PolylineOptions()
                .add(quake6, test)
                .width(5)
                .color(Color.RED));
        Polyline line8 = mMap.addPolyline(new PolylineOptions()
                .add(quake7, test)
                .width(5)
                .color(Color.RED));
        Polyline line9 = mMap.addPolyline(new PolylineOptions()
                .add(quake8, test)
                .width(5)
                .color(Color.RED));
        Polyline line10 = mMap.addPolyline(new PolylineOptions()
                .add(quake9, test)
                .width(5)
                .color(Color.RED));
        Polyline line11 = mMap.addPolyline(new PolylineOptions()
                .add(quake10, test)
                .width(5)
                .color(Color.RED));
        Polyline line12 = mMap.addPolyline(new PolylineOptions()
                .add(quake11, test)
                .width(5)
                .color(Color.RED));
        Polyline line13 = mMap.addPolyline(new PolylineOptions()
                .add(quake12, test)
                .width(5)
                .color(Color.RED));
        Polyline line14 = mMap.addPolyline(new PolylineOptions()
                .add(quake13, test)
                .width(5)
                .color(Color.RED));
        Polyline line15 = mMap.addPolyline(new PolylineOptions()
                .add(quake14, test)
                .width(5)
                .color(Color.RED));
        Polyline line16 = mMap.addPolyline(new PolylineOptions()
                .add(quake15, test)
                .width(5)
                .color(Color.RED));
        Polyline line17 = mMap.addPolyline(new PolylineOptions()
                .add(quake16, test)
                .width(5)
                .color(Color.RED));
        Polyline line18 = mMap.addPolyline(new PolylineOptions()
                .add(quake17, test)
                .width(5)
                .color(Color.RED));
        Polyline line19 = mMap.addPolyline(new PolylineOptions()
                .add(quake18, test)
                .width(5)
                .color(Color.RED));
        Polyline line20 = mMap.addPolyline(new PolylineOptions()
                .add(quake19, test)
                .width(5)
                .color(Color.RED));
        Polyline line21 = mMap.addPolyline(new PolylineOptions()
                .add(quake20, test)
                .width(5)
                .color(Color.RED));
        Polyline line22 = mMap.addPolyline(new PolylineOptions()
                .add(quake21, test)
                .width(5)
                .color(Color.RED));
        Polyline line23 = mMap.addPolyline(new PolylineOptions()
                .add(quake22, test)
                .width(5)
                .color(Color.RED));
        Polyline line24 = mMap.addPolyline(new PolylineOptions()
                .add(quake23, test)
                .width(5)
                .color(Color.RED));
        Polyline line25 = mMap.addPolyline(new PolylineOptions()
                .add(quake24, test)
                .width(5)
                .color(Color.RED));
        Polyline line26 = mMap.addPolyline(new PolylineOptions()
                .add(quake25, test)
                .width(5)
                .color(Color.RED));
        Polyline line27 = mMap.addPolyline(new PolylineOptions()
                .add(quake26, test)
                .width(5)
                .color(Color.RED));
        Polyline line28 = mMap.addPolyline(new PolylineOptions()
                .add(quake27, test)
                .width(5)
                .color(Color.RED));
        Polyline line29 = mMap.addPolyline(new PolylineOptions()
                .add(quake28, test)
                .width(5)
                .color(Color.RED));
        Polyline line30 = mMap.addPolyline(new PolylineOptions()
                .add(quake29, test)
                .width(5)
                .color(Color.RED));
        Polyline line31 = mMap.addPolyline(new PolylineOptions()
                .add(quake30, test)
                .width(5)
                .color(Color.RED));
        Polyline line32 = mMap.addPolyline(new PolylineOptions()
                .add(quake31, test)
                .width(5)
                .color(Color.RED));
        Polyline line33 = mMap.addPolyline(new PolylineOptions()
                .add(quake32, test)
                .width(5)
                .color(Color.RED));
        Polyline line34 = mMap.addPolyline(new PolylineOptions()
                .add(quake33, test)
                .width(5)
                .color(Color.RED));
        Polyline line35 = mMap.addPolyline(new PolylineOptions()
                .add(quake34, test)
                .width(5)
                .color(Color.RED));
        Polyline line36 = mMap.addPolyline(new PolylineOptions()
                .add(quake35, test)
                .width(5)
                .color(Color.RED));
        Polyline line37 = mMap.addPolyline(new PolylineOptions()
                .add(quake36, test)
                .width(5)
                .color(Color.RED));
        Polyline line38 = mMap.addPolyline(new PolylineOptions()
                .add(quake37, test)
                .width(5)
                .color(Color.RED));
        Polyline line39 = mMap.addPolyline(new PolylineOptions()
                .add(quake38, test)
                .width(5)
                .color(Color.RED));
        Polyline line40 = mMap.addPolyline(new PolylineOptions()
                .add(quake39, test)
                .width(5)
                .color(Color.RED));
        Polyline line41 = mMap.addPolyline(new PolylineOptions()
                .add(quake40, test)
                .width(5)
                .color(Color.RED));
        Polyline line42 = mMap.addPolyline(new PolylineOptions()
                .add(quake41, test)
                .width(5)
                .color(Color.RED));



        TextView txtView = (TextView) findViewById(R.id.text);

        if (dists[0] > 0 && dists[0] < 4) {
            txtView.setText("Earthquake Risk: Very High");
            txtView.setBackgroundColor(Color.RED);
            txtView.setTextColor(Color.WHITE);
            //Toast.makeText(getApplicationContext(),"Very High Risk for Earthquakes",Toast.LENGTH_LONG).show();
        }
        if (dists[0] > 4 && dists[0] < 8) {
            txtView.setText("Earthquake Risk: High");
            txtView.setBackgroundColor(Color.RED);
            txtView.setTextColor(Color.WHITE);
            //Toast.makeText(getApplicationContext(),"High Risk for Earthquakes",Toast.LENGTH_LONG).show();
        }
        if (dists[0] > 8 && dists[0] < 12) {
            txtView.setText("Earthquake Risk: Medium");
            txtView.setBackgroundColor(Color.YELLOW);
            //Toast.makeText(getApplicationContext(),"Medium High Risk for Earthquakes",Toast.LENGTH_LONG).show();
        }
        if (dists[0] > 12 && dists[0] < 16) {
            txtView.setText("Earthquake Risk: Low");
            txtView.setBackgroundColor(Color.GREEN);
            //Toast.makeText(getApplicationContext(),"Low Risk for Earthquakes",Toast.LENGTH_LONG).show();
        }
        if (dists[0] > 16) {
            txtView.setText("Earthquake Risk: Very Low");
            txtView.setBackgroundColor(Color.GREEN);
            //Toast.makeText(getApplicationContext(),"Very Low Risk for Earthquakes",Toast.LENGTH_LONG).show();
        }
    }

    public double CalculationByDistance(LatLng StartP, LatLng EndP) {
        int Radius = 6371;// radius of earth in Km
        double lat1 = StartP.latitude;
        double lat2 = EndP.latitude;
        double lon1 = StartP.longitude;
        double lon2 = EndP.longitude;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2)
                * Math.sin(dLon / 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double valueResult = Radius * c;
        double km = valueResult / 1;
        DecimalFormat newFormat = new DecimalFormat("####");
        int kmInDec = Integer.valueOf(newFormat.format(km));
        double meter = valueResult % 1000;
        int meterInDec = Integer.valueOf(newFormat.format(meter));
        Log.i("Radius Value", "" + valueResult + "   KM  " + kmInDec
                + " Meter   " + meterInDec);

        return Radius * c;
    }

}
