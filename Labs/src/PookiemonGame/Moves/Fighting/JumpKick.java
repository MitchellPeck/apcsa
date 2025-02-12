package PookiemonGame.Moves.Fighting;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class JumpKick extends Move {
    public JumpKick() {
        super("Jump Kick", 1, .95, new Types[]{FIGHTING});
    }
}
