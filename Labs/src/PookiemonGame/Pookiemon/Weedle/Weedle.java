package PookiemonGame.Pookiemon.Weedle;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Weedle extends Pookiemon {
    public Weedle() {
        super(new Types[]{BUG, POISON}, "Weedle", 50, 40, 35, 30, new Kakuna());

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(FIRE, 2);
        super.setDisadvantage(PSYCHIC, 2);

        super.setAdvantage(FIGHTING, 4);
        super.setAdvantage(POISON, 2);
        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 4);
        super.setAdvantage(FAIRY, 2);
    }
}
