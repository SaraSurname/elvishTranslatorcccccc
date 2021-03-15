package com.example.elvishtranslator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class FamiliaAdapter extends ArrayAdapter<Family> {
    public FamiliaAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Family> familyList) {
        super(context, resource, familyList);
    }

        @NonNull
        @Override
        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
            View list_item = convertView;
            // verificamos si la vista está vacía , y si es true, inflarla/pintarla
            if (list_item == null) {
                list_item = LayoutInflater.from(getContext()).inflate(R.layout.item_list_familia, parent, false);
            }
//            //nos traemos cada una de las palabras del Array
            Family currentPalabra = getItem(position);
//
            TextView textSpanish = (TextView) list_item.findViewById(R.id.textSpanish);
            textSpanish.setText(currentPalabra.getEspanyol());
//            TextView textElvish = (TextView) list_item.findViewById(R.id.textElvish);
//            textElvish.setText(currentPalabra.getEflico());

           return list_item;
      }
    }
