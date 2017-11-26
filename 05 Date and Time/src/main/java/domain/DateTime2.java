package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

@Entity
public class DateTime2 {

    @Id
    private long id;

    // libraries used in setting time
    // this classes are wrappers for java util dates classes
    private Date dateSQL;
    private Time timeSQL;
    private Timestamp timestampSQL; // keeps date and time

    // In Java we use those types
    @Temporal(TemporalType.DATE)
    private java.util.Date utilDate;

    @Temporal(TemporalType.TIME)
    private java.util.Date utilTime;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimeStamp;

    @Temporal(TemporalType.DATE)
    private Calendar calendar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateSQL() {
        return dateSQL;
    }

    public void setDateSQL(Date dateSQL) {
        this.dateSQL = dateSQL;
    }

    public Time getTimeSQL() {
        return timeSQL;
    }

    public void setTimeSQL(Time timeSQL) {
        this.timeSQL = timeSQL;
    }

    public Timestamp getTimestampSQL() {
        return timestampSQL;
    }

    public void setTimestampSQL(Timestamp timestampSQL) {
        this.timestampSQL = timestampSQL;
    }

    public java.util.Date getUtilDate() {
        return utilDate;
    }

    public void setUtilDate(java.util.Date utilDate) {
        this.utilDate = utilDate;
    }

    public java.util.Date getUtilTime() {
        return utilTime;
    }

    public void setUtilTime(java.util.Date utilTime) {
        this.utilTime = utilTime;
    }

    public java.util.Date getUtilTimeStamp() {
        return utilTimeStamp;
    }

    public void setUtilTimeStamp(java.util.Date utilTimeStamp) {
        this.utilTimeStamp = utilTimeStamp;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
