package PookiemonGame.Pookiemon.Charmander;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Charmeleon extends Pookiemon {
    public Charmeleon() {
        super(new Types[]{FIRE}, "Charmeleon", 80, 58, 64, 58, new Charizard());

        super.setDisadvantage(GROUND, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(WATER, 2);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(GRASS, 2);
        super.setAdvantage(ICE, 2);
        super.setAdvantage(FAIRY, 2);
    }
}
