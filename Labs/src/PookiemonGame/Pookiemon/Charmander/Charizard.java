package PookiemonGame.Pookiemon.Charmander;

import PookiemonGame.PookiemonClasses.Pookiemon;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Charizard extends Pookiemon {
    public Charizard() {
        super(FIRE, "Charizard", 100, 78, 84, 78);

        super.setDisadvantage(ROCK, 4);
        super.setDisadvantage(WATER, 2);
        super.setDisadvantage(ELECTRIC, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(BUG, 4);
        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(GRASS, 4);
        super.setAdvantage(FAIRY, 2);
    }
}
