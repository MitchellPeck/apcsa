package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class Bind extends Move {
    public Bind() {
        super("Bind", .15, .85, new Types[]{NORMAL});
    }
}
