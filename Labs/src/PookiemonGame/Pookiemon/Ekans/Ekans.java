package PookiemonGame.Pookiemon.Ekans;

import PookiemonGame.Pookiemon.Spearow.Fearow;
import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Ekans extends Pookiemon {
    public Ekans() {
        super(new Types[]{POISON}, "Ekans", 55, 35, 60, 44, new Arbok());

        super.setDisadvantage(GROUND, 2);
        super.setDisadvantage(PSYCHIC, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(POISON, 2);
        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
        super.setAdvantage(FAIRY, 2);
    }
}
