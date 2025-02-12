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
import PookiemonGame.Pookiemon.Ekans.Arbok;
import PookiemonGame.Pookiemon.Ekans.Ekans;
import PookiemonGame.Pookiemon.Pidgey.Pidgeot;
import PookiemonGame.Pookiemon.Pidgey.Pidgeotto;
import PookiemonGame.Pookiemon.Pidgey.Pidgey;
import PookiemonGame.Pookiemon.Pikachu.Pikachu;
import PookiemonGame.Pookiemon.Pikachu.Raichu;
import PookiemonGame.Pookiemon.Rattata.Raticate;
import PookiemonGame.Pookiemon.Rattata.Rattata;
import PookiemonGame.Pookiemon.Spearow.Fearow;
import PookiemonGame.Pookiemon.Spearow.Spearow;
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
    private final ArrayList<Pookiemon> list = new ArrayList<Pookiemon>();

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
        list.add(new Pidgeot());
        list.add(new Pidgeotto());
        list.add(new Pidgey());
        list.add(new Rattata());
        list.add(new Raticate());
        list.add(new Spearow());
        list.add(new Fearow());
        list.add(new Ekans());
        list.add(new Arbok());
        list.add(new Pikachu());
        list.add(new Raichu());
    }

    public void listPookiemon() {
        for (Pookiemon pookiemon : list) {
            System.out.println(pookiemon.getName());
        }
    }

    public Pookiemon findPookiemonByName(String name) {
        for (Pookiemon pookiemon : list) {
            if (pookiemon.getName().equals(name)) return pookiemon;
        }
        return null;
    }

    public ArrayList<Pookiemon> getList() {
        return list;
    }
}
