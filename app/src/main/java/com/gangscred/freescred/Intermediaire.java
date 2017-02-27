package com.gangscred.freescred;

import java.util.ArrayList;

/**
 * Created by larnicol on 27/02/17.
 */

public class Intermediaire {
    public String s_final="";
    public String s_grab;
    public ArrayList<String> liste_trick_inter = new ArrayList<>();
    public ArrayList<String> liste_grab_inter = new ArrayList<>();
    public ArrayList<String> liste_rotation_inter = new ArrayList<>();
    public Intermediaire() {
        liste_trick_inter.add("");

        liste_rotation_inter.add("180");
        liste_rotation_inter.add("360");
        liste_rotation_inter.add("540");
        liste_rotation_inter.add("720");
        liste_rotation_inter.add("0");

        liste_grab_inter.add("No grab");
        liste_grab_inter.add("safety");
        liste_grab_inter.add("mute");
        liste_grab_inter.add("Kozak");
        liste_grab_inter.add("japan");
        liste_grab_inter.add("double japan");
        liste_grab_inter.add("tail");
        liste_grab_inter.add("blunt");
        liste_grab_inter.add("nose");
        String s1="";
        String s2="";

        String s_rotation = liste_rotation_inter.get((int) (Math.random() * liste_rotation_inter.size()));
        String s_trick = liste_trick_inter.get((int) (Math.random() * liste_trick_inter.size()));
        s1=s_rotation;
        s2=s_trick;
        s_final=s1+s2;
        String s3="";
        s_grab = liste_grab_inter.get((int) (Math.random() * liste_grab_inter.size()));



    }
}


