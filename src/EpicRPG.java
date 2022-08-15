import java.util.Scanner;

public final class EpicRPG extends Application
{
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args)
    {
        new EpicRPG().run();
    }

    @Override
    protected void init()
    {
        System.out.print("Welcome to EpicRPG. ");
    }

    @Override
    protected void mainMenu()
    {
        System.out.println("Type \"help\" for instructions.");

        mainMenu:
        while (true)
        {
            String choice = SC.nextLine();
            switch (choice.toLowerCase())
            {
                case "help", "h" ->
                {
                    nl();
                    System.out.println("Type \"help\" for help.");
                    System.out.println("Type \"settings\" to view your settings.");
                    System.out.println("Type \"inventory\" to view your inventory.");
                    System.out.println("Type \"play\" to view your saves.");
                    System.out.println("Type \"shop\" to view the shop.");
                    System.out.println("Type \"quit\" to quit the program.");
                }
                case "quit", "q" ->
                {
                    nl();
                    if (yesNoQuestion("Are you sure want to quit the game?"))
                    {
                        nl();
                        shouldRun = false;
                        break mainMenu;
                    }
                }
            }
        }
    }

    @Override
    protected void play()
    {

    }

    @Override
    protected void settings()
    {

    }

    @Override
    protected void inventory()
    {

    }

    @Override
    protected void shop()
    {

    }

    @Override
    protected void terminate()
    {
        System.out.println("Closing...");
        SC.close();
        System.exit(0);
    }

    private boolean yesNoQuestion(String question)
    {
        System.out.println(question);
        while (true)
        {
            String choice = SC.nextLine();
            {
                switch (choice.toLowerCase())
                {
                    case "yes", "y" ->
                    {
                        return true;
                    }
                    case "no", "n" ->
                    {
                        return false;
                    }
                }
            }
        }
    }
}
