import domain.Modrakowa;
import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee karolinaKroszel = new Employee();

        Modrakowa modrakowa42 = new Modrakowa();

        // ------------------------------------------
        karolinaKroszel.setFirstName("Karolina");
        karolinaKroszel.setLastName("Kroszel");
        karolinaKroszel.setSalary(0);
        karolinaKroszel.setModrakowa(modrakowa42);



        entityManager.getTransaction().begin();
        // IMPORTANT we must save to database employee and address as well
        entityManager.persist(karolinaKroszel);

        entityManager.persist(modrakowa42);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
