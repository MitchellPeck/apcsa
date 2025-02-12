package PookiemonGame.Pookiemon.Pikachu;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Raichu extends Pookiemon {
    public Raichu() {
        super(new Types[]{ELECTRIC}, "Raichu", 110, 60, 90, 55);

        super.setDisadvantage(GROUND, 2);

        super.setAdvantage(FLYING, 2);
        super.setAdvantage(STEEL, 2);
        super.setAdvantage(ELECTRIC, 2);
    }
}
