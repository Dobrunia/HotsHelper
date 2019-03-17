
public class Main {


    public static void main(String[] args) {
        /*
        TODO: рограмма считаыает 1)есть ли уже дд (маг или авто а) 1.2)предпочтения если нет 3)карту
         */

        Analizator analizator = new Analizator();
        Reader reader = new Reader();
        Ifno ifno = new Ifno();

        System.out.println("Write \" yes \" if you already have dd in you team else write \" no \"");
        String es = reader.Reader();


        if (es.equalsIgnoreCase("yes")){

            analizator.Swch();

        } else if (es.equalsIgnoreCase("no")){

            ifno.Ifno();

            } else {
            System.out.println("Try again:)");
        }

    }


}
