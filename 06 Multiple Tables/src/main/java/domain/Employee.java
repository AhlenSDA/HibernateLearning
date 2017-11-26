package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "employee") // default table
@SecondaryTable(name = "address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "employeeId"))
public class Employee {

    @Id
    private long id;

    // -------- TABLE employee ----------------------
    // There is no need to specify table name parameter because by default it is set to @Table
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "secondary_name")
    private String lastName;
    @Column(name = "salary")
    private double salary;

    // -------- SECONDARY TABLE address -------------
    // Table name in secondary table must be specified here so fields are added exactly to this table
    @Column(table = "address", name = "city")
    private String locality;
    @Column(table = "address", name = "zip_code")
    private String zipCode;
    @Column(table = "address", name = "street_name")
    private String street;
    @Column(table = "address", name = "street_number")
    private int streetNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
}
