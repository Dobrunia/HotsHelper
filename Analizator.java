
public class Analizator {

    public void Swch() {

        String[] melee = {"Tracer", "Ragnaros", "Ilidan", "Greymane", "Zeratul", "Alarak", "Varian", "Karrigan", "Malthael", "Maiev", "Butcher", "Samuro"};
        String[] range ={"Li-Ming", "Orphea", "Mephisto", "Hanzo", "Genji", "Jaina", "Valla", "Raynor", "Fenix", "Guldan", "Junkrat", "Falstad", "Cassia", "Taicus", "Lunara", "Chromie"};
        //String[] maps = {"Braxis Holdout", "Battlefield of Eternity", "Infernal Shrines", "Alterac Pass", "Towers of Doom", "Tomb of the Spider Queen", "Volskaya Foundry", "Sky Temple", "Cursed Hollow", "Dragon Shrine"};

        Mapp mapp = new Mapp();
        Reader reader = new Reader();

        System.out.println("If you have melee dd in your team write \"m\" if you have range dd write \"r\" ");
        String ddtype = reader.Reader();


        //int randommelee = (int)Math.random() * melee.length;
        //int randomrange = (int)Math.random() * range.length;
        boolean ss = true;
        String p = "Pick: ";
        int df = mapp.Mapp();



            if (ddtype.equalsIgnoreCase("m")) {
                switch (df) {
                    case 1:
                        System.out.println(p + range[9] + " or " + range[5] + " or " + range[10] + " or " + range[6]);
                        reader.Reader();
                        break;
                    case 2:
                        System.out.println(p + range[6] + " or " + range[14] + " or " + range[3] + " or " + range[0]);
                        reader.Reader();
                        break;
                    case 3:
                        System.out.println(p + range[5] + " or " + range[9] + " or " + range[6] + " or " + range[10]);
                        reader.Reader();
                        break;
                    case 4:
                        System.out.println(p + range[5] + " or " + range[9] + " or " + range[11] + " or " + range[10]);
                        reader.Reader();
                        break;
                    case 5:
                        System.out.println(p + range[11] + " or " + range[15] + " or " + range[0] + " or " + range[10]);
                        reader.Reader();
                        break;
                    case 6:
                        System.out.println(p + range[5] + " or " + range[9] + " or " + range[6] + " or " + range[7]);
                        reader.Reader();
                        break;
                    case 7:
                        System.out.println(p + range[1] + " or " + range[0] + " or " + range[9] + " or " + range[10]);
                        reader.Reader();
                        break;
                    case 8:
                        System.out.println(p + range[11] + " or " + range[0] + " or " + range[6] + " or " + range[5]);
                        reader.Reader();
                        break;
                    case 9:
                        System.out.println(p + range[11] + " or " + range[0] + " or " + range[10] + " or " + range[15]);
                        reader.Reader();
                        break;
                    case 10:
                        System.out.println(p + range[11] + " or " + range[10] + " or " + range[0] + " or " + range[5]);
                        reader.Reader();
                        break;
                }

                ss = false;

            } else if (ddtype.equalsIgnoreCase("r")) {
                switch (df) {
                    case 1:
                        System.out.println(p + melee[1] + " or " + melee[5]);
                        reader.Reader();
                        break;
                    case 2:
                        System.out.println(p + melee[3] + " or " + melee[8] + " or " + melee[11] + " or " + melee[0]);
                        reader.Reader();
                        break;
                    case 3:
                        System.out.println(p + melee[7] + " or " + melee[1] + " or " + melee[3] + " or " + melee[6]);
                        reader.Reader();
                        break;
                    case 4:
                        System.out.println(p + melee[1] + " or" + melee[11]);
                        reader.Reader();
                        break;
                    case 5:
                        System.out.println(p + melee[5] + " or " + melee[3] + " or " + melee[9] + " or " + melee[0]);
                        reader.Reader();
                        break;
                    case 6:
                        System.out.println(p + melee[1] + " or " + melee[7] + " or " + melee[4] + " or " + melee[10]);
                        reader.Reader();
                        break;
                    case 7:
                        System.out.println(p + melee[8] + " or " + melee[9] + " or " + melee[5]);
                        reader.Reader();
                        break;
                    case 8:
                        System.out.println(p + melee[11] + " or " + melee[2] + " or " + melee[6] + " or " + melee[10]);
                        reader.Reader();
                        break;
                    case 9:
                        System.out.println(p + melee[0] + " or " + melee[11] + " or " + melee[5]);
                        reader.Reader();
                        break;
                    case 10:
                        System.out.println(p + melee[8] + " or " + melee[4] + " or " + melee[1] + " or " + melee[2]);
                        reader.Reader();
                        break;
                }
                    ss = false;
            } else {
                System.out.println("error! print \"m\"/\"r\"");

            }

    }
}



