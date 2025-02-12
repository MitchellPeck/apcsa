package PookiemonGame.Moves;

import PookiemonGame.Moves.Bug.*;
import PookiemonGame.Moves.Dark.*;
import PookiemonGame.Moves.Dragon.*;
import PookiemonGame.Moves.Electric.*;
import PookiemonGame.Moves.Fairy.*;
import PookiemonGame.Moves.Fighting.*;
import PookiemonGame.Moves.Fire.*;
import PookiemonGame.Moves.Flying.*;
import PookiemonGame.Moves.Ghost.*;
import PookiemonGame.Moves.Grass.*;
import PookiemonGame.Moves.Ground.*;
import PookiemonGame.Moves.Ice.*;
import PookiemonGame.Moves.Normal.*;
import PookiemonGame.PookiemonClasses.Move;

import java.util.ArrayList;

public class MovesList {
    private final ArrayList<Move> list = new ArrayList<Move>();

    public MovesList() {
        list.add(new LeechLife());
        list.add(new PinMissile());
        list.add(new Twineedle());
        list.add(new Bite());
        list.add(new Pursuit());
        list.add(new Thief());
        list.add(new DragonBreath());
        list.add(new Outrage());
        list.add(new Twister());
        list.add(new Thunderbolt());
        list.add(new ThunderPunch());
        list.add(new ThunderShock());
        list.add(new DisarmingVoice());
        list.add(new DrainingKiss());
        list.add(new PlayRough());
        list.add(new DoubleKick());
        list.add(new JumpKick());
        list.add(new KarateChop());
        list.add(new Ember());
        list.add(new FirePunch());
        list.add(new Flamethrower());
        list.add(new Fly());
        list.add(new Gust());
        list.add(new WingAttack());
        list.add(new Astonish());
        list.add(new Lick());
        list.add(new ShadowBall());
        list.add(new Absorb());
        list.add(new MegaDrain());
        list.add(new VineWhip());
        list.add(new BoneClub());
        list.add(new Dig());
        list.add(new Earthquake());
        list.add(new Blizzard());
        list.add(new IceBeam());
        list.add(new IcePunch());
        list.add(new Bind());
        list.add(new CometPunch());
        list.add(new Cut());
        list.add(new DoubleSlap());
        list.add(new MegaPunch());
        list.add(new PayDay());
        list.add(new Pound());
        list.add(new RazorWind());
        list.add(new Scratch());
        list.add(new Slam());
        list.add(new ViseGrip());
    }

    public void listMoves() {
        for (Move move : list) {
            System.out.println(move.getName());
        }
    }

    public Move findMoveByName(String name) {
        for (Move move : list) {
            if (move.getName().equals(name)) return move;
        }
        return null;
    }

    public ArrayList<Move> getList() {
        return list;
    }
}
