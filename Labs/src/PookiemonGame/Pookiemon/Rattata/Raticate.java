package PookiemonGame.Pookiemon.Rattata;

import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Raticate extends Pookiemon {
    public Raticate() {
        super(new Types[]{NORMAL}, "Raticate", 97, 55, 81, 60);

        super.setDisadvantage(FIGHTING, 2);

        super.setImmunity(GHOST);
    }
}
