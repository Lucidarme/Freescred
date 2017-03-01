package com.gangscred.freescred;

import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    Button but_trick;
    Button but_grab;
    TextView text_trick;
    TextView text_grab;
    private Spinner spinner_list_level=null;

    //On crée nos 3 objets contenant les listes des différents niveaux
    Debutant Deb;
    Intermediaire Inter;
    Expert Exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Deb= new Debutant(this);
        Inter=new Intermediaire(this);
        Exp=new Expert(this);
        //Declaration du spinner level.
        spinner_list_level=(Spinner) findViewById(R.id.spinner_level);
       // level= spinner_list_level.getSelectedItem().toString();
        spinner_list_level.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //On définit nos boutons, text

        but_trick = (Button) findViewById(R.id.trick);
        but_grab = (Button) findViewById(R.id.grab);
        text_trick = (TextView) findViewById(R.id.text_trick);
        text_grab = (TextView) findViewById(R.id.text_grab);

        //évènements
        but_trick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String trick_Deb="";
                String trick_Inter="";
                String trick_Exp="";
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    trick_Deb=Deb.Trick();
                    text_trick.setText(trick_Deb);
                    }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        trick_Inter=Inter.Trick();
                        text_trick.setText(trick_Inter);
                    }
                    else{
                        trick_Exp=Exp.Trick();
                        text_trick.setText(trick_Exp);
                    }

                }

            }
        });

        but_grab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grab_Deb;
                String grab_Inter;
                String grab_Exp;
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                   //DEBUTANT
                    grab_Deb=Deb.Grab();
                    text_grab.setText(grab_Deb);
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        //INTERMEDIAIRE
                        grab_Inter=Inter.Grab();
                        text_grab.setText(grab_Inter);
                    }
                    else{
                       //EXPERT
                        grab_Exp=Exp.Grab();
                        text_grab.setText(grab_Exp);
                    }

                }

            }
        });
    }
}
