package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class PayDay extends Move {
    public PayDay() {
        super("Pay Day", .4, 1, new Types[]{NORMAL});
    }
}
