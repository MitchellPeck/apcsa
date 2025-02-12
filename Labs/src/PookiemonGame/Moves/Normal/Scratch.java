package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class Scratch extends Move {
    public Scratch() {
        super("Scratch", .4, 1, new Types[]{NORMAL});
    }
}
