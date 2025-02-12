package PookiemonGame.Pookiemon.Spearow;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Spearow extends Pookiemon {
    public Spearow() {
        super(new Types[]{NORMAL, FLYING}, "Spearow", 70, 40, 60, 30, new Fearow());

        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setImmunity(GROUND);
        super.setImmunity(GHOST);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
    }
}
