package PookiemonGame.Pookiemon.Caterpie;

import PookiemonGame.PookiemonClasses.Pookiemon;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Caterpie extends Pookiemon {
    public Caterpie() {
        super(FIRE, "Caterpie", 45, 45, 30, 35, new Metapod());

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(FIRE, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(GROUND, 2);
        super.setAdvantage(GRASS, 2);
    }
}
