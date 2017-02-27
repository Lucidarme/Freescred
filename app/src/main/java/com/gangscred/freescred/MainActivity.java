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

    public ArrayList<String> tab_trick = new ArrayList<>();
    public ArrayList<String> tab_rotation = new ArrayList<>();
    public ArrayList<String> tab_grab = new ArrayList<>();
    public ArrayList<String> tab_final_trick = new ArrayList<>();
    public ArrayList<String> tab_final_rotation = new ArrayList<>();
    public ArrayList<String> tab_final_grab = new ArrayList<>();



    public String s_grab_memoire;
    public  String s_rota_memoire;
    public  String s_trick_memoire;
    Button but_level;
    public String level;
    Button but_trick;
    Button but_grab;
    TextView text_level;
    TextView text_trick;
    TextView text_grab;
    private Spinner spinner_list_level=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //On définit nos rotations,tricks et grabs
        tab_rotation.add("0");
        tab_rotation.add("180");
        tab_rotation.add("360");
        tab_rotation.add("540");
        tab_rotation.add("720");
        tab_rotation.add("1080");
        tab_rotation.add("1440");



        tab_trick.add("");
        tab_trick.add("switch");
        tab_trick.add("back");
        tab_trick.add("front");
        tab_trick.add("flat");
        tab_trick.add("bio");
        tab_trick.add("cork");
        tab_trick.add("misty");


        tab_grab.add("No grab");
        tab_grab.add("safety");
        tab_grab.add("mute");
        tab_grab.add("Kozak");
        tab_grab.add("japan");
        tab_grab.add("double japan");
        tab_grab.add("tail");
        tab_grab.add("blunt");
        tab_grab.add("nose");
        tab_grab.add("truck driver");
        tab_grab.add("dub nose");
        tab_grab.add("Octo");
        tab_grab.add("Screaming seamon");



        spinner_list_level=(Spinner) findViewById(R.id.spinner_level);
       // level= spinner_list_level.getSelectedItem().toString();
        spinner_list_level.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                level=spinner_list_level.getSelectedItem().toString();
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
              /*  String s1="";
                String s2="";
                String s_final="";
                String s_rotation = tab_final_rotation.get((int) (Math.random() * tab_final_rotation.size()));
                String s_trick = tab_final_trick.get((int) (Math.random() * tab_final_trick.size()));
                while (s1!=s_rotation) {
                    if (s_rota_memoire!=s_rotation) {
                        s1 = s_rotation;
                        s_rota_memoire = s1;
                        s_final=s1;
                    } else {
                        s_rotation = tab_final_rotation.get((int) (Math.random() * tab_final_rotation.size()));
                    }
                }
                while (s2!=s_trick) {
                    if (s1 != "0" && (s_trick.equals("front") || s_trick.equals("back"))) {
                        s_trick = tab_final_trick.get((int) (Math.random() * tab_final_trick.size()));
                    }
                    if(s_trick=="front" || s_trick=="back"){
                        s2=s_trick;
                        s_final=s2;
                    }

                    else {
                        if((s_rotation=="180") && (s_trick=="cork" || s_trick=="misty" || s_trick=="flat" || s_trick=="bio")){
                            s_trick=tab_final_trick.get((int) (Math.random()*tab_final_trick.size()));
                        }
                        else{
                            if (s_trick_memoire != s_trick) {
                                s2 = s_trick;
                                s_trick_memoire = s2;
                                s_final=s2 + " " + s_final;
                            } else {
                                s_trick = tab_final_trick.get((int) (Math.random() * tab_final_trick.size()));
                            }
                        }

                    }
                }


                text_trick.setText(s_final);
*/              if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    Debutant Deb=new Debutant();
                    text_trick.setText(Deb.s_final);
                    }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        Intermediaire Inter = new Intermediaire();
                        text_trick.setText(Inter.s_final);
                    }
                    else{
                        Expert Exp = new Expert();
                        text_trick.setText(Exp.s_final);
                    }

                }

            }
        });

        but_grab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* String s1="";
                String s_grab = tab_final_grab.get((int) (Math.random() * tab_final_grab.size()));
                while (s1!=s_grab) {
                    if (s_grab_memoire!=s_grab) {
                        s1 = s_grab;
                        s_grab_memoire = s1;
                    } else {
                        s_grab = tab_final_grab.get((int) (Math.random() * tab_final_grab.size()));
                    }
                }
                text_grab.setText(s1);*/
                if (spinner_list_level.getSelectedItem().toString().equals("Debutant")){
                    Debutant Deb=new Debutant();
                    text_grab.setText(Deb.s_grab);
                }
                else{
                    if (spinner_list_level.getSelectedItem().toString().equals("Intermediaire")){
                        Intermediaire Inter = new Intermediaire();
                        text_grab.setText(Inter.s_grab);
                    }
                    else{
                        Expert Exp = new Expert();
                        text_grab.setText(Exp.s_grab);
                    }

                }
            }
        });
    }
}
