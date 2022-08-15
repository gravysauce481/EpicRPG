package item;

import game.NPC;
import game.Player;

public abstract class Usable extends Item
{
    public Usable(int value)
    {
        super(value);
    }

    protected abstract void use(NPC user, NPC target);
}
