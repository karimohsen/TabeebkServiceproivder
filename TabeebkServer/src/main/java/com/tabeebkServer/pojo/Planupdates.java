package com.tabeebkServer.pojo;
// Generated Jun 14, 2015 12:47:34 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Planupdates generated by hbm2java
 */
@Entity
@Table(name="planupdates"
    ,catalog="graduationprojecttabeebakdb"
)
public class Planupdates  implements java.io.Serializable {


     private Integer updateId;
     private int version;
     private Msptype msptype;
     private UpdateStatus updateStatus;
     private Msp msp;
     private Plan plan;

    public Planupdates() {
    }

	
    public Planupdates(UpdateStatus updateStatus, Plan plan) {
        this.updateStatus = updateStatus;
        this.plan = plan;
    }
    public Planupdates(Msptype msptype, UpdateStatus updateStatus, Msp msp, Plan plan) {
       this.msptype = msptype;
       this.updateStatus = updateStatus;
       this.msp = msp;
       this.plan = plan;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="update_id", unique=true, nullable=false)
    public Integer getUpdateId() {
        return this.updateId;
    }
    
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    
    @Column(name="version", nullable=false)
    public int getVersion() {
        return this.version;
    }
    
    public void setVersion(int version) {
        this.version = version;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="msp_type_id")
    public Msptype getMsptype() {
        return this.msptype;
    }
    
    public void setMsptype(Msptype msptype) {
        this.msptype = msptype;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="status", nullable=false)
    public UpdateStatus getUpdateStatus() {
        return this.updateStatus;
    }
    
    public void setUpdateStatus(UpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="msp_id")
    public Msp getMsp() {
        return this.msp;
    }
    
    public void setMsp(Msp msp) {
        this.msp = msp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="plan_id", nullable=false)
    public Plan getPlan() {
        return this.plan;
    }
    
    public void setPlan(Plan plan) {
        this.plan = plan;
    }




}


