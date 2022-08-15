package game;

import item.Item;

import java.util.ArrayList;

public class Player extends NPC
{
    private int coins = 0;

    private final ArrayList<Item> inventory = new ArrayList<>();

    public Player()
    {
        super("player", 150, 150, 20);
    }
    
    public int getCoins()
    {
        return coins;
    }

    public void setCoins(int coins)
    {
        this.coins = coins;
    }
}
