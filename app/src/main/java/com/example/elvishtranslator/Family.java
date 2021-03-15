package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_familia);


       // ListView listf = (ListView) findViewById(R.id.mainFamily);

      ArrayList<Palabra> familyList = new ArrayList<Palabra>();
        Palabra fam1 = new Palabra("Madre", "Naneth");
        familyList.add(fam1);
        Palabra fam2 = new Palabra("Padre", "Adanadar");
        familyList.add(fam2);
        Palabra fam3 = new Palabra("Hijo", "Ionn");
        familyList.add(fam3);
        Palabra fam4 = new Palabra("Hija", "Sell");
        familyList.add(fam4);
        Palabra fam5 = new Palabra("Hermano", "Muindor");
        familyList.add(fam5);
        Palabra fam6 = new Palabra("Hermana", "Muinthel");
        familyList.add(fam6);

        FamiliaAdapter familyAdapter = new FamiliaAdapter(this, 0, familyList);
       // listf.setAdapter(familyAdapter);

    }

}