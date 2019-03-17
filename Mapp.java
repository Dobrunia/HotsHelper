import java.util.Scanner;

public class Mapp {


    public int Mapp(){

        System.out.println("If yor map is: " +
                "\n \"Braxis Holdout\" write \"1\" " +
                "\n \"Battlefield of Eternity\" write \"2\" " +
                "\n \"Infernal Shrines\" write \"3\" " +
                "\n \"Alterac Pass\" write \"4\"" +
                "\n \"Towers of Doom\" write \"5\"" +
                "\n \"Tomb of the Spider Queen\" write \"6\"" +
                "\n \"Volskaya Foundry\" write \"7\"" +
                "\n \"Sky Temple\" write \"8\"" +
                "\n \"Cursed Hollow\" write \"9\"" +
                "\n \"Dragon Shrine\" write \"10\"");

        Scanner mp = new Scanner(System.in);
        int maps = mp.nextInt();
        return maps;





    }


}
