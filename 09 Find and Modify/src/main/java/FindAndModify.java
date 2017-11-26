import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAndModify {

    public static void main(String[] args) {

        // PERSISTENCE PROPERTIES WERE MODIFIED! CHECK COMMENTS IN FILE!

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Employee employee;
        employee = entityManager.find(Employee.class, 1L); // Be warned about field types, in this example we must use '1L' to work because it's long, simple '1' will not work providing an error.
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());

        employee.setSalary(5000);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
