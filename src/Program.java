import model.entities.Departament;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String args[]){
        Departament d = new Departament(1, "Books");

        Seller seller = new Seller(21, "Jose", "josefino@gmail.com", new Date(), 1000.0, d);

        System.out.println(seller);

    }
}
