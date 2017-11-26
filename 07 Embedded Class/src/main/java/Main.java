import domain.Address;
import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee marcinKroszel = new Employee();
        Address address = new Address();

        marcinKroszel.setFirstName("Marcin");
        marcinKroszel.setLastName("Kroszel");
        marcinKroszel.setSalary(2980.99);

        marcinKroszel.setAddress(address);

        address.setLocality("Bydgoszcz");
        address.setZipCode("85-864");
        address.setStreet("Modrakowa");
        address.setStreetNumber(42);

        entityManager.getTransaction().begin();
        entityManager.persist(marcinKroszel);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
