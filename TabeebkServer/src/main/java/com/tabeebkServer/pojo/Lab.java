package com.tabeebkServer.pojo;
// Generated Apr 7, 2015 6:46:58 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Lab generated by hbm2java
 */
@Entity
@Table(name="lab"
    ,catalog="graduationprojecttabeebakdb"
)
public class Lab  implements java.io.Serializable {


     private Integer labId;
     private Hospital hospital;
     private String labName;
     private String labNameAr;
     private String labImagepath;

    public Lab() {
    }

    public Lab(Hospital hospital, String labName, String labNameAr, String labImagepath) {
       this.hospital = hospital;
       this.labName = labName;
       this.labNameAr = labNameAr;
       this.labImagepath = labImagepath;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="lab_id", unique=true, nullable=false)
    public Integer getLabId() {
        return this.labId;
    }
    
    public void setLabId(Integer labId) {
        this.labId = labId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hospital_id")
    public Hospital getHospital() {
        return this.hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    
    @Column(name="lab_name", length=45)
    public String getLabName() {
        return this.labName;
    }
    
    public void setLabName(String labName) {
        this.labName = labName;
    }

    
    @Column(name="lab_name_ar", length=45)
    public String getLabNameAr() {
        return this.labNameAr;
    }
    
    public void setLabNameAr(String labNameAr) {
        this.labNameAr = labNameAr;
    }

    
    @Column(name="lab_imagepath", length=45)
    public String getLabImagepath() {
        return this.labImagepath;
    }
    
    public void setLabImagepath(String labImagepath) {
        this.labImagepath = labImagepath;
    }




}

