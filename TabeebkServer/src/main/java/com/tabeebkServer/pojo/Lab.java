package com.tabeebkServer.pojo;
// Generated May 24, 2015 2:45:18 PM by Hibernate Tools 4.3.1


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
     private int deleted;
     private Set<Labspeciality> labspecialities = new HashSet<Labspeciality>(0);

    public Lab() {
    }

    public Lab(Hospital hospital, String labName, String labNameAr, int deleted) {
        this.hospital = hospital;
        this.labName = labName;
        this.labNameAr = labNameAr;
        this.deleted = deleted;
    }

    public Lab(String labName, String labNameAr, int deleted) {
        this.labName = labName;
        this.labNameAr = labNameAr;
        this.labImagepath = labImagepath;
        this.deleted = deleted;
    }

	
    public Lab(int deleted) {
        this.deleted = deleted;
    }
    public Lab(Hospital hospital, String labName, String labNameAr, String labImagepath, int deleted, Set<Labspeciality> labspecialities) {
       this.hospital = hospital;
       this.labName = labName;
       this.labNameAr = labNameAr;
       this.labImagepath = labImagepath;
       this.deleted = deleted;
       this.labspecialities = labspecialities;
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

    
    @Column(name="lab_imagepath", length=100)
    public String getLabImagepath() {
        return this.labImagepath;
    }
    
    public void setLabImagepath(String labImagepath) {
        this.labImagepath = labImagepath;
    }

    
    @Column(name="deleted", nullable=false)
    public int getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="lab")
    public Set<Labspeciality> getLabspecialities() {
        return this.labspecialities;
    }
    
    public void setLabspecialities(Set<Labspeciality> labspecialities) {
        this.labspecialities = labspecialities;
    }




}


