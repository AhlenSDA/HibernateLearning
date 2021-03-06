import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee karolinaKroszel = new Employee();

        karolinaKroszel.setFirstName("Karolina");
        karolinaKroszel.setLastName("Kroszel");
        karolinaKroszel.setSalary(2000);

        entityManager.getTransaction().begin();
        entityManager.persist(karolinaKroszel);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
