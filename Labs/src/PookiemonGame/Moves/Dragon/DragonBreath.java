package PookiemonGame.Moves.Dragon;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class DragonBreath extends Move {
    public DragonBreath() {
        super("Dragon Breath", .6, 1, new Types[]{DRAGON});
    }
}
