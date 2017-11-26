package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class PossibleTypes {

    @Id
    private long id;

    // SYNTAX - watch variables name! They can't be name as "integer", "BigDecimal" etc. It provides syntax MySQL error.

    private int anInt;
    private short aShort;
    private float aFloat;
    private double aDouble;
    private boolean aBoolean;

    private Integer someInteger;
    private BigDecimal someBigDecimal;
    private BigInteger someBigInteger;

    private int[] someIntegerArray;
    private double[] someDoubleArray;

    private MyEnum anEnum;

    @Transient // Fields marked with @Transient annotation are ignored by hibernate so it won't be added to MySQL table
    private int ignoredField; // Creating ignoreField which we don't want in our SQL database

    public int getIgnoredField() {
        return ignoredField;
    }

    public void setIgnoredField(int ignoredField) {
        this.ignoredField = ignoredField;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Integer getSomeInteger() {
        return someInteger;
    }

    public void setSomeInteger(Integer someInteger) {
        this.someInteger = someInteger;
    }

    public BigDecimal getSomeBigDecimal() {
        return someBigDecimal;
    }

    public void setSomeBigDecimal(BigDecimal someBigDecimal) {
        this.someBigDecimal = someBigDecimal;
    }

    public BigInteger getSomeBigInteger() {
        return someBigInteger;
    }

    public void setSomeBigInteger(BigInteger someBigInteger) {
        this.someBigInteger = someBigInteger;
    }

    public int[] getSomeIntegerArray() {
        return someIntegerArray;
    }

    public void setSomeIntegerArray(int[] someIntegerArray) {
        this.someIntegerArray = someIntegerArray;
    }

    public double[] getSomeDoubleArray() {
        return someDoubleArray;
    }

    public void setSomeDoubleArray(double[] someDoubleArray) {
        this.someDoubleArray = someDoubleArray;
    }

    public MyEnum getAnEnum() {
        return anEnum;
    }

    public void setAnEnum(MyEnum anEnum) {
        this.anEnum = anEnum;
    }





}