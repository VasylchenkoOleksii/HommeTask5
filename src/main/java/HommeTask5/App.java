package HommeTask5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*System.out.println("Hello World!1");*/
        /*Task1*/
        ContragentType contragenttype = new ContragentType("19", "hgdfhghghgghg", 4);
        Category category = new Category("OLE ole", new Date());

        /*Task2*/
        Address address = new Address();
        address.setCountry("USA");
        address.setCity("Chicago");
        address.setDistrict("NBA");
        address.setStreet("NiggaMan");
        address.setHouseno("18");
        address.setFlat("145");
        address.setPostcode("61058");
        /*System.out.println("Hello World!2");*/

        /*Task3*/
        ContragentId contragentId = new ContragentId(2, 852258);

        Contragent contragent = new Contragent (contragentId.getId(),contragentId.getSiteid(),"deal deal","7656836883", category, contragenttype);

        Account account = new Account(contragent, new Date(), "2400587456", new Date(), new BigDecimal("156.15"));

               /*Task4*/
        ContragentGroup contragentGroup = new ContragentGroup("Valuable");
        ContragentGroup contragentGroup1 = new ContragentGroup ("Gariga");
        ContragentGroup contragentGroup2 = new ContragentGroup ( "Abebka");

        /*Task5*/
        Address address2 = new Address("USA", "NY", "NHL", "SnowMan", "18", "145", "61058", contragent );


        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("TEST");
        EntityManager em1 = emf1.createEntityManager();
        EntityTransaction tx1 = em1.getTransaction();
        tx1.begin();
        em1.persist(contragenttype);
        em1.persist(category);
        em1.persist(address);
        em1.persist(address2);
        em1.persist(contragent);
        em1.persist(account);
        em1.persist(contragentGroup);
        em1.persist(contragentGroup1);
        em1.persist(contragentGroup2);
        tx1.commit();
        em1.close();
        emf1.close();

    }
}
