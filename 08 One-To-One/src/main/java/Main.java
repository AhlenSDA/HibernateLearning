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
        Employee katarzynaKroszel = new Employee();
        Employee alicjaKroszel = new Employee();
        Address modrakowa42 = new Address();

        // ------------------------------------------
        marcinKroszel.setFirstName("Marcin");
        marcinKroszel.setLastName("Kroszel");
        marcinKroszel.setSalary(2980.99);
        marcinKroszel.setAddress(modrakowa42);
        modrakowa42.setLocality("Bydgoszcz");
        modrakowa42.setZipCode("85-864");
        modrakowa42.setStreet("Modrakowa");
        modrakowa42.setStreetNumber(42);

        // ------------------------------------------
        katarzynaKroszel.setFirstName("Katarzyna");
        katarzynaKroszel.setLastName("Kroszel");
        katarzynaKroszel.setSalary(2500);
        katarzynaKroszel.setAddress(modrakowa42);
        modrakowa42.setLocality("Bydgoszcz");
        modrakowa42.setZipCode("85-864");
        modrakowa42.setStreet("Modrakowa");
        modrakowa42.setStreetNumber(42);

        // ------------------------------------------
        alicjaKroszel.setFirstName("Alicja");
        alicjaKroszel.setLastName("Kroszel");
        alicjaKroszel.setSalary(0);
        alicjaKroszel.setAddress(modrakowa42);
        modrakowa42.setLocality("Bydgoszcz");
        modrakowa42.setZipCode("85-864");
        modrakowa42.setStreet("Modrakowa");
        modrakowa42.setStreetNumber(42);



        entityManager.getTransaction().begin();
        // IMPORTANT we must save to database employee and address as well
        entityManager.persist(marcinKroszel);
        entityManager.persist(katarzynaKroszel);
        entityManager.persist(alicjaKroszel);
        entityManager.persist(modrakowa42);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
