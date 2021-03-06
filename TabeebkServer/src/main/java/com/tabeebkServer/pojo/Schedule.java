package com.tabeebkServer.pojo;
// Generated Jun 15, 2015 12:46:00 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Schedule generated by hbm2java
 */
@Entity
@Table(name="schedule"
    ,catalog="graduationprojecttabeebakdb"
)
public class Schedule  implements java.io.Serializable {


     private Integer scheduleId;
     private Msptype msptype;
     private Integer msptypeId;
     private Date date;
     private Date startTime;
     private Date endTime;
     private Integer serveTime;
     private Integer maxPatients;
     private Double fees;
     private Double deduct;
     private Set<Reservation> reservations = new HashSet<Reservation>(0);

    public Schedule() {
    }

    public Schedule(Msptype msptype, Integer msptypeId, Date date, Date startTime, Date endTime, Integer serveTime, Integer maxPatients, Double fees, Double deduct, Set<Reservation> reservations) {
       this.msptype = msptype;
       this.msptypeId = msptypeId;
       this.date = date;
       this.startTime = startTime;
       this.endTime = endTime;
       this.serveTime = serveTime;
       this.maxPatients = maxPatients;
       this.fees = fees;
       this.deduct = deduct;
       this.reservations = reservations;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="schedule_id", unique=true, nullable=false)
    public Integer getScheduleId() {
        return this.scheduleId;
    }
    
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="msptype")
    public Msptype getMsptype() {
        return this.msptype;
    }
    
    public void setMsptype(Msptype msptype) {
        this.msptype = msptype;
    }

    
    @Column(name="msptype_id")
    public Integer getMsptypeId() {
        return this.msptypeId;
    }
    
    public void setMsptypeId(Integer msptypeId) {
        this.msptypeId = msptypeId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="start_time", length=8)
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="end_time", length=8)
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    
    @Column(name="serve_time")
    public Integer getServeTime() {
        return this.serveTime;
    }
    
    public void setServeTime(Integer serveTime) {
        this.serveTime = serveTime;
    }

    
    @Column(name="max_patients")
    public Integer getMaxPatients() {
        return this.maxPatients;
    }
    
    public void setMaxPatients(Integer maxPatients) {
        this.maxPatients = maxPatients;
    }

    
    @Column(name="fees", precision=22, scale=0)
    public Double getFees() {
        return this.fees;
    }
    
    public void setFees(Double fees) {
        this.fees = fees;
    }

    
    @Column(name="deduct", precision=22, scale=0)
    public Double getDeduct() {
        return this.deduct;
    }
    
    public void setDeduct(Double deduct) {
        this.deduct = deduct;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="schedule")
    public Set<Reservation> getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }




}


