package PookiemonGame.Pookiemon.Rattata;

import PookiemonGame.Pookiemon.Pidgey.Pidgeotto;
import PookiemonGame.PookiemonClasses.Pookiemon;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Rattata extends Pookiemon {
    public Rattata() {
        super(new Types[]{NORMAL}, "Rattata", 72, 30, 56, 35, new Raticate());

        super.setDisadvantage(FIGHTING, 2);

        super.setImmunity(GHOST);
    }
}
