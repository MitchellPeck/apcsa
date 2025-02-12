package PookiemonGame.Pookiemon.Pidgey;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Pidgeot extends Pookiemon {
    public Pidgeot() {
        super(new Types[]{NORMAL, FLYING}, "Pidgeot", 101, 83, 80, 75);

        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
    }
}
