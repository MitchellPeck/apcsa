package PookiemonGame.Pookiemon.Caterpie;

import PookiemonGame.PookiemonClasses.Pookiemon;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Butterfree extends Pookiemon {
    public Butterfree() {
        super(FIRE, "Butterfree", 70, 60, 45, 50);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 4);
        super.setDisadvantage(FIRE, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(FIGHTING, 4);
        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 4);
    }
}
