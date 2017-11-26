import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee marcinKroszel = new Employee();
        marcinKroszel.setFirstName("Marcin");
        marcinKroszel.setLastName("Kroszel");
        marcinKroszel.setSalary(2980.99);

        entityManager.getTransaction().begin();
        entityManager.persist(marcinKroszel);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        entityManager.remove(marcinKroszel);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
