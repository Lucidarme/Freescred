package com.gangscred.freescred;



import android.text.method.HideReturnsTransformationMethod;

import java.util.ArrayList;

/**
 * Created by larnicol on 25/02/17.
 */

public final class Debutant{
    public String s_grab;
    private String s_grab_memoire="";
    private String s_rota_memoire="";
    private String s_trick_memoire="";
    public  ArrayList<String> liste_trick_deb= new ArrayList<>();
    public ArrayList<String> liste_grab_deb= new ArrayList<>();
    public ArrayList<String> liste_rotation_deb= new ArrayList<>();
    public Debutant() {
        liste_trick_deb.add("");
        liste_rotation_deb.add("180");
        liste_rotation_deb.add("360");
        liste_rotation_deb.add("0");
        liste_grab_deb.add("No grab");
        liste_grab_deb.add("safety");
        liste_grab_deb.add("mute");
        liste_grab_deb.add("Kozak");
        liste_grab_deb.add("japan");


    }
    //On crée le trick + rotation
    public String Trick(){
        String s1="";
        String s2="";
        String s_final="";
        String s_rotation = liste_rotation_deb.get((int) (Math.random() * liste_rotation_deb.size()));
        String s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
        while (s1!=s_rotation) {
            if (s_rota_memoire!=s_rotation) {
                s1 = s_rotation;
                s_rota_memoire = s1;
                s_final=s1;
            } else {
                s_rotation = liste_rotation_deb.get((int) (Math.random() * liste_rotation_deb.size()));
            }
        }
        while (s2!=s_trick) {
            if (s1 != "0" && (s_trick.equals("front") || s_trick.equals("back"))) {
                s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
            }
            if(s_trick=="front" || s_trick=="back"){
                s2=s_trick;
                s_final=s2;
            }

            else {
                if((s_rotation=="180") && (s_trick=="cork" || s_trick=="misty" || s_trick=="flat" || s_trick=="bio")){
                    s_trick=liste_trick_deb.get((int) (Math.random()*liste_trick_deb.size()));
                }
                else{
                    if (s_trick_memoire != s_trick) {
                        s2 = s_trick;
                        s_trick_memoire = s2;
                        s_final=s2 + " " + s_final;
                    } else {
                        s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
                    }
                }

            }
        }
        return(s_final);
    }

    //Crée le grab
    public String Grab(){

        String sExcepDeb="";
        while (sExcepDeb!=s_grab) {
            if (s_grab_memoire!=s_grab) {
                sExcepDeb = s_grab;
                s_grab_memoire = sExcepDeb;
            } else {
                s_grab = liste_grab_deb.get((int) (Math.random() * liste_grab_deb.size()));
            }
        }
        return s_grab;
    }



}

