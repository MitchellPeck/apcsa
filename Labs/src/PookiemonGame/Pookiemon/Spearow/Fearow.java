package PookiemonGame.Pookiemon.Spearow;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Fearow extends Pookiemon {
    public Fearow() {
        super(new Types[]{NORMAL, FLYING}, "Fearow", 100, 65, 90, 65);

        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setImmunity(GROUND);
        super.setImmunity(GHOST);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
    }
}
