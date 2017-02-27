package com.gangscred.freescred;

import java.util.ArrayList;

/**
 * Created by larnicol on 27/02/17.
 */

public class Expert {
    public String s_final = "";
    private String s_grab_memoire="";
    String sExcepExp="";
    public ArrayList<String> liste_trick_exp = new ArrayList<>();
    public ArrayList<String> liste_grab_exp = new ArrayList<>();
    public ArrayList<String> liste_rotation_exp = new ArrayList<>();
    public String s_grab;
    public Expert() {
        liste_trick_exp.add("");
        liste_trick_exp.add("switch");
        liste_trick_exp.add("back");
        liste_trick_exp.add("front");
        liste_trick_exp.add("flat");
        liste_trick_exp.add("bio");
        liste_trick_exp.add("cork");
        liste_trick_exp.add("misty");

        liste_rotation_exp.add("180");
        liste_rotation_exp.add("360");
        liste_rotation_exp.add("540");
        liste_rotation_exp.add("720");
        liste_rotation_exp.add("900");
        liste_rotation_exp.add("1080");

        liste_grab_exp.add("No grab");
        liste_grab_exp.add("safety");
        liste_grab_exp.add("mute");
        liste_grab_exp.add("Kozak");
        liste_grab_exp.add("japan");
        liste_grab_exp.add("double japan");
        liste_grab_exp.add("tail");
        liste_grab_exp.add("blunt");
        liste_grab_exp.add("nose");
        liste_grab_exp.add("truck driver");
        liste_grab_exp.add("dub nose");
        liste_grab_exp.add("Octo");
        liste_grab_exp.add("Screaming seamon");

    }

    //On crée le trick + rotation
    public String Trick(){
        String s_rotation = liste_rotation_exp.get((int) (Math.random() * liste_rotation_exp.size()));
        String s_trick = liste_trick_exp.get((int) (Math.random() * liste_trick_exp.size()));
        s_final=s_rotation+s_trick;
        return(s_final);
    }
    public String Grab() {
        while (sExcepExp != s_grab) {
            if (s_grab_memoire != s_grab) {
                sExcepExp = s_grab;
                s_grab_memoire = sExcepExp;
            } else {
                s_grab = liste_grab_exp.get((int) (Math.random() * liste_grab_exp.size()));
            }
        }
        return(s_grab);
    }
}
