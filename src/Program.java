import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String args[]){
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ===");

        Seller seller = sellerDao.findById(1);

        System.out.println(seller);

        System.out.println("=== Test 2: seller findByDepartment ===");
        Department department = new Department(1, "carro");
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }
        System.out.println("=== Test 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("=== Test 4: Seller insert ===");
        Seller newSeller = new Seller (null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id: " + newSeller.getId());

        System.out.println("=== Test 5: Seller update ===");
        seller = sellerDao.findById(15);
        seller.setName("Gabrielly");
        sellerDao.update(seller);
        System.out.println("Updated!");

        System.out.println("=== Test 6: Seller Delete ===");
        sellerDao.deleteById(898985);
        System.out.println("Deleted!");


    }
}
