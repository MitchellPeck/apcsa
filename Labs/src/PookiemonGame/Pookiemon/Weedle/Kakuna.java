package PookiemonGame.Pookiemon.Weedle;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Kakuna extends Pookiemon {
    public Kakuna() {
        super(new Types[]{BUG, POISON}, "Kakuna", 35, 45, 25, 50, new Beedrill());

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
