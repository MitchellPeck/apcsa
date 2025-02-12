package PookiemonGame.Pookiemon.Caterpie;

import PookiemonGame.PookiemonClasses.Pookiemon;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Metapod extends Pookiemon {
    public Metapod() {
        super(FIRE, "Metapod", 30, 50, 20, 55, new Butterfree());

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(FIRE, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(GROUND, 2);
        super.setAdvantage(GRASS, 2);
    }
}
