package com.mitakartinasari.miiitashopy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class HalamanKatalog extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.katalog_halaman);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://media.iyaa.com/wp-content/uploads/2018/11/ig-wardah.jpg");
        mNames.add("Lipstik Wardah");

        mImageUrls.add("http://www.cosmogirl.co.id/gallery/photo/855a9fec1eeaf960f11b1ac62e6189a2.jpg");
        mNames.add("Lipstik Make Over");

        mImageUrls.add("https://s4.bukalapak.com/img/4742635403/w-1000/Lightening_Two_Way_Cake_03_Sheer_Pink_Wardah___Bedak.jpg");
        mNames.add("Bedak Wardah");

        mImageUrls.add("http://www.beautyhealthproduct.com/wp-content/uploads/2018/02/La-girl-beauty-brick-eyeshadow.jpg");
        mNames.add("Eyeshadow Nudes");

        mImageUrls.add("https://ecs7.tokopedia.net/img/product-1/2016/12/10/113580/113580_440b9739-0975-43af-aa17-7bea8d96ff60_638_450.jpg");
        mNames.add("Foundation Make Over");

        mImageUrls.add("http://www.amusecosmetic.com/images/20180905124348_ME006-N.jpg");
        mNames.add("Mascara dan Eyeliner");

        mImageUrls.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2017/10/27/0/0_3a18e195-92ab-436d-bf15-c2fd75d9c5a2_640_640.jpg");
        mNames.add("Blush On");

        mImageUrls.add("https://media.dinomarket.com/docs/imgTD/2018-03/contour1_030318110348_ll.jpg.jpg");
        mNames.add("Contour");

        mImageUrls.add("https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/beauty/Wardah_Perfect_Bright_Moisturizer/Wardah_Perfect_Bright_Moisturizer_L_1.jpg");
        mNames.add("Pelembab Wardah");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
