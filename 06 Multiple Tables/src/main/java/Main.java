import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee employee = new Employee();
        employee.setFirstName("Marcin");
        employee.setLastName("Kroszel");
        employee.setSalary(2980);
        employee.setLocality("Bydgoszcz");
        employee.setZipCode("85-864");
        employee.setStreet("Modrakowa");
        employee.setStreetNumber(42);

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}