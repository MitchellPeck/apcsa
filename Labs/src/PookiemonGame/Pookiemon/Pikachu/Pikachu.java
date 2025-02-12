package PookiemonGame.Pookiemon.Pikachu;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Pikachu extends Pookiemon {
    public Pikachu() {
        super(new Types[]{ELECTRIC}, "Pikachu", 90, 35, 55, 30, new Raichu());

        super.setDisadvantage(GROUND, 2);

        super.setAdvantage(FLYING, 2);
        super.setAdvantage(STEEL, 2);
        super.setAdvantage(ELECTRIC, 2);
    }
}
