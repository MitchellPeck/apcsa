package PookiemonGame.Pookiemon.Squirtle;

import PookiemonGame.PookiemonClasses.Pookiemon;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Squirtle extends Pookiemon {
    public Squirtle() {
        super(FIRE, "Squirtle", 43, 44, 48, 65, new Wartortle());

        super.setDisadvantage(GRASS, 2);
        super.setDisadvantage(ELECTRIC, 2);

        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(WATER, 2);
        super.setAdvantage(ICE, 2);
    }
}
