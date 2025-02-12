package PookiemonGame.Pookiemon;

import PookiemonGame.Pookiemon.Bulbasaur.Bulbasaur;
import PookiemonGame.Pookiemon.Bulbasaur.Ivysaur;
import PookiemonGame.Pookiemon.Bulbasaur.Venusaur;
import PookiemonGame.Pookiemon.Caterpie.Butterfree;
import PookiemonGame.Pookiemon.Caterpie.Caterpie;
import PookiemonGame.Pookiemon.Caterpie.Metapod;
import PookiemonGame.Pookiemon.Charmander.Charizard;
import PookiemonGame.Pookiemon.Charmander.Charmander;
import PookiemonGame.Pookiemon.Charmander.Charmeleon;
import PookiemonGame.Pookiemon.Squirtle.Blastoise;
import PookiemonGame.Pookiemon.Squirtle.Squirtle;
import PookiemonGame.Pookiemon.Squirtle.Wartortle;
import PookiemonGame.Pookiemon.Weedle.Beedrill;
import PookiemonGame.Pookiemon.Weedle.Kakuna;
import PookiemonGame.Pookiemon.Weedle.Weedle;
import PookiemonGame.PookiemonClasses.Pookiemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PookiemonList {
    private ArrayList<Pookiemon> list = new ArrayList<Pookiemon>();

    public PookiemonList() {
        list.add(new Bulbasaur());
        list.add(new Ivysaur());
        list.add(new Venusaur());
        list.add(new Charmander());
        list.add(new Charmeleon());
        list.add(new Charizard());
        list.add(new Squirtle());
        list.add(new Wartortle());
        list.add(new Blastoise());
        list.add(new Caterpie());
        list.add(new Metapod());
        list.add(new Butterfree());
        list.add(new Weedle());
        list.add(new Kakuna());
        list.add(new Beedrill());
    }

    public void listPookiemon() {
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }

    public Pookiemon findPookiemonByName(String name) {
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getName().equals(name)) return list.get(i);
        }
        return null;
    }
}
