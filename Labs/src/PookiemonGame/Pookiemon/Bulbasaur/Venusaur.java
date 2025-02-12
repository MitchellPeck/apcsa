package PookiemonGame.Pookiemon.Bulbasaur;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Venusaur extends Pookiemon {
    public Venusaur() {
        super(new Types[]{GRASS, POISON}, "Venusaur", 80, 80, 82, 83);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(FIRE, 2);
        super.setDisadvantage(PSYCHIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(WATER, 2);
        super.setAdvantage(GRASS, 4);
        super.setAdvantage(ELECTRIC, 2);
        super.setAdvantage(FAIRY, 2);
    }
}
