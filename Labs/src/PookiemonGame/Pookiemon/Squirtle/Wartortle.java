package PookiemonGame.Pookiemon.Squirtle;

import PookiemonGame.PookiemonClasses.Pookiemon;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Wartortle extends Pookiemon {
    public Wartortle() {
        super(FIRE, "Wartortle", 43, 44, 48, 65, new Blastoise());

        super.setDisadvantage(GRASS, 2);
        super.setDisadvantage(ELECTRIC, 2);

        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(WATER, 2);
        super.setAdvantage(ICE, 2);
    }
}
