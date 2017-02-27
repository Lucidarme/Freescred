package com.gangscred.freescred;

import java.util.ArrayList;

/**
 * Created by larnicol on 27/02/17.
 */

public class Intermediaire {
    public String s_grab;
    public String s_final;
    private String s_grab_memoire="";
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

    }
    //On crée le trick + rotation
    public String Trick(){
        String s_rotation = liste_rotation_inter.get((int) (Math.random() * liste_rotation_inter.size()));
        String s_trick = liste_trick_inter.get((int) (Math.random() * liste_trick_inter.size()));
        s_final=s_rotation+s_trick;
        return(s_final);
    }

        public String Grab(){

            String sExcepInter="";
            while (sExcepInter!=s_grab) {
                if (s_grab_memoire!=s_grab) {
                    sExcepInter = s_grab;
                    s_grab_memoire = sExcepInter;
                } else {
                    s_grab = liste_grab_inter.get((int) (Math.random() * liste_grab_inter.size()));
                }
            }
            return s_grab;
        }



}


