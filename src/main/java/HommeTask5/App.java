package HommeTask5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   System.out.println( "Hello World!1" );
        ContragentType contragenttype = new ContragentType("1C","bingobongo", 2);
        System.out.println( "Hello World!2" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TMP_CONTRAGENTTYPE");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(contragenttype);
        tx.commit();
        em.close();
        emf.close();
        System.out.println( "Hello World!4" );
    }
}
