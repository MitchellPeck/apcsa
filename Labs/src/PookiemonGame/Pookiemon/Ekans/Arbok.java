package PookiemonGame.Pookiemon.Ekans;

import PookiemonGame.Pookiemon.Spearow.Fearow;
import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Arbok extends Pookiemon {
    public Arbok() {
        super(new Types[]{POISON}, "Arbok", 80, 60, 95, 69);

        super.setDisadvantage(GROUND, 2);
        super.setDisadvantage(PSYCHIC, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(POISON, 2);
        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
        super.setAdvantage(FAIRY, 2);
    }
}
