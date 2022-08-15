public abstract class Application implements Runnable
{
    protected GameState gameState = GameState.MAIN_MENU;

    protected boolean shouldRun = true;

    public void run()
    {
        init();
        loop();
        terminate();
    }

    protected abstract void init();

    private void loop()
    {
        while (shouldRun)
        {
            if (gameState == GameState.MAIN_MENU)
            {
                mainMenu();
            }
            else if (gameState == GameState.PLAY)
            {
                play();
            }
            else if (gameState == GameState.CONFIG)
            {
                settings();
            }
            else if (gameState == GameState.INVENTORY)
            {
                inventory();
            }
            else if (gameState == GameState.SHOP)
            {
                shop();
            }
        }
    }

    protected abstract void mainMenu();

    protected abstract void play();

    protected abstract void settings();

    protected abstract void inventory();

    protected abstract void shop();

    protected abstract void terminate();

    protected final void nl()
    {
        System.out.println();
    }
}
