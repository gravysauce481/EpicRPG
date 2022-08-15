package game;

public class NPC
{
    private String name;
    private int health;
    private int maxHealth;
    private int damage;

    public NPC(String name, int maxHealth, int health, int damage)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.damage = damage;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void getMaxHealth(int maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public int setMaxHealth()
    {
        return maxHealth;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }
}
