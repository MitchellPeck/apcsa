package PookiemonGame.Pookiemon.Weedle;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Beedrill extends Pookiemon {
    public Beedrill() {
        super(new Types[]{BUG, POISON}, "Beedrill", 75, 65, 90, 40);

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
