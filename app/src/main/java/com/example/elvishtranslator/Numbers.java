package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.ListView;


import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ListView list = (ListView) findViewById(R.id.mainContainer);

        ArrayList<Palabra> palabraList = new ArrayList<Palabra>();
        Palabra pal1 = new Palabra("Uno", "mîn");
        palabraList.add(pal1);
        Palabra pal2 = new Palabra("Dos", "tâd");
        palabraList.add(pal2);
        Palabra pal3 = new Palabra("Tres", "nêl");
        palabraList.add(pal3);
        Palabra pal4 = new Palabra("Cuatro", "canad");
        palabraList.add(pal4);
        Palabra pal5 = new Palabra("Cinco", "leben");
        palabraList.add(pal5);
        Palabra pal6 = new Palabra("Seis", "eneg");
        palabraList.add(pal6);
        Palabra pal7 = new Palabra("Siete", "odog");
        palabraList.add(pal7);
        Palabra pal8 = new Palabra("Ocho", "tolodh");
        palabraList.add(pal8);
        Palabra pal9 = new Palabra("Nueve", "neder");
        palabraList.add(pal9);
        Palabra pal10 = new Palabra("Diez", "pae");
        palabraList.add(pal10);

        PalabraAdapter palabraAdapter = new PalabraAdapter(this, 0, palabraList);
        list.setAdapter(palabraAdapter);


    }


}