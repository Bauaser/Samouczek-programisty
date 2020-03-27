public class Pogoda {
    public static void main(String[]args) {
       String message = "Dzisiejsza pogoda przedstawia się następująco: Pochmurnie, z niewielkimi plamkami słońca.\n";
        String message2 = "Do tego zdarza się że zawieje leciutki wiaterek.\n";
        String message3= "Ale nawet w taką pogodę chce się wyjść bo Korona szaleje.";
        System.out.println(message +message2+message3);
        System.out.println("A przy okazji wszystkie trzy zdania mają razem " + (message.length()+message2.length() +message3.length()) + " znaków." );
        System.out.println("ale gdybym zapomniał w kodzie o dodatkowych znakach \"()\" wyskoczyłoby \"" +message.length()+message2.length() +message3.length() + " znaków\"");

    }
        }
