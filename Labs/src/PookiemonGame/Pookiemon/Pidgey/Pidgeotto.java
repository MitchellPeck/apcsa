package PookiemonGame.Pookiemon.Pidgey;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Pidgeotto extends Pookiemon {
    public Pidgeotto() {
        super(new Types[]{NORMAL, FLYING}, "Pidgeotto", 71, 63, 60, 55, new Pidgeot());

        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
    }
}
