package com.gangscred.freescred;



import java.util.ArrayList;

/**
 * Created by larnicol on 25/02/17.
 */

public final class Debutant{
    public String s_final="";
    public String s_grab;
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
        String s1="";
        String s2="";

        String s_rotation = liste_rotation_deb.get((int) (Math.random() * liste_rotation_deb.size()));
        String s_trick = liste_trick_deb.get((int) (Math.random() * liste_trick_deb.size()));
        s1=s_rotation;
        s2=s_trick;
        s_final=s1+s2;
        s_grab = liste_grab_deb.get((int) (Math.random() * liste_grab_deb.size()));



    }
}

