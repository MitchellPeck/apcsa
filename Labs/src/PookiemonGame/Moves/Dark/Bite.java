package PookiemonGame.Moves.Dark;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Bite extends Move {
    public Bite() {
        super("Bite", .6, 1, new Types[]{DARK});
    }
}
