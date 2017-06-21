package HommeTask5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   System.out.println( "Hello World!1" );
        ContragentType contragenttype = new ContragentType("19","hgdfhghghgghg", 4);
        Category category = new Category("OLE ole", new Date());
        Address address = new Address();
        address.setCountry("USA");
        address.setCity("Chicago");
        address.setDistrict("NBA");
        address.setStreet("NiggaMan");
        address.setHouseno("18");
        address.setFlat("145");
        address.setPostcode("61058");
        System.out.println( "Hello World!2" );
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("TEST");
        EntityManager em1 = emf1.createEntityManager();
        EntityTransaction tx1 = em1.getTransaction();
        tx1.begin();
        em1.persist(contragenttype);
        em1.persist(category);
        em1.persist(address);
        tx1.commit();
        em1.close();
        emf1.close();

    }
}
