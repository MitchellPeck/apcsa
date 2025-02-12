package PookiemonGame.Pookiemon.Pidgey;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Pidgey extends Pookiemon {
    public Pidgey() {
        super(new Types[]{NORMAL, FLYING}, "Pidgey", 56, 40, 45, 40, new Pidgeotto());

        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 2);
    }
}
