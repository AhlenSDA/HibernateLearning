package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "employee") // table name can contain only small letters
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "FirstName") // name field cannot contain spaces
    private String firstName;

    @Column(name = "LastName", nullable = false) // nullable = field must be inserted
    private String lastName;

    @Column(name = "Salary", columnDefinition = "VARCHAR(5) NOT NULL") // SQL statement
    private int salary;

    @Column(name = "Salary2", precision = 10, scale = 2) // precision = length, scale = round value
    private BigDecimal salary2;

    public BigDecimal getSalary2() {
        return salary2;
    }

    public void setSalary2(BigDecimal salary2) {
        this.salary2 = salary2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
