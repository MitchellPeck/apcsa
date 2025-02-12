package PookiemonGame.Pookiemon.Bulbasaur;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Bulbasaur extends Pookiemon {
    public Bulbasaur() {
        super(new Types[]{GRASS, POISON}, "Bulbasaur", 45, 45, 49, 49, new Ivysaur());

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
