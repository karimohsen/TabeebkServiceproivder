package com.tabeebkServer.pojo;
// Generated May 10, 2015 10:16:11 PM by Hibernate Tools 3.6.0


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
 * Doctor generated by hbm2java
 */
@Entity
@Table(name="doctor"
    ,catalog="graduationprojecttabeebakdb"
)
public class Doctor  implements java.io.Serializable {


     private Integer doctorId;
     private Doctorspeciality doctorspeciality;
     private String doctorName;
     private String doctorNameAr;
     private String doctorDegree;
     private String doctorDegreeAr;
     private Integer genderId;
     private String doctorImagepath;
     private int deleted;
     private Set<DoctorClinc> doctorClincs = new HashSet<DoctorClinc>(0);

    public Doctor() {
    }

	
    public Doctor(int deleted) {
        this.deleted = deleted;
    }
    public Doctor(Doctorspeciality doctorspeciality, String doctorName, String doctorNameAr, String doctorDegree, String doctorDegreeAr, Integer genderId, String doctorImagepath, int deleted, Set<DoctorClinc> doctorClincs) {
       this.doctorspeciality = doctorspeciality;
       this.doctorName = doctorName;
       this.doctorNameAr = doctorNameAr;
       this.doctorDegree = doctorDegree;
       this.doctorDegreeAr = doctorDegreeAr;
       this.genderId = genderId;
       this.doctorImagepath = doctorImagepath;
       this.deleted = deleted;
       this.doctorClincs = doctorClincs;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="doctor_id", unique=true, nullable=false)
    public Integer getDoctorId() {
        return this.doctorId;
    }
    
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="doctorSpeciality_id")
    public Doctorspeciality getDoctorspeciality() {
        return this.doctorspeciality;
    }
    
    public void setDoctorspeciality(Doctorspeciality doctorspeciality) {
        this.doctorspeciality = doctorspeciality;
    }

    
    @Column(name="doctor_name", length=45)
    public String getDoctorName() {
        return this.doctorName;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    
    @Column(name="doctor_name_ar", length=45)
    public String getDoctorNameAr() {
        return this.doctorNameAr;
    }
    
    public void setDoctorNameAr(String doctorNameAr) {
        this.doctorNameAr = doctorNameAr;
    }

    
    @Column(name="doctor_degree", length=45)
    public String getDoctorDegree() {
        return this.doctorDegree;
    }
    
    public void setDoctorDegree(String doctorDegree) {
        this.doctorDegree = doctorDegree;
    }

    
    @Column(name="doctor_degree_ar", length=45)
    public String getDoctorDegreeAr() {
        return this.doctorDegreeAr;
    }
    
    public void setDoctorDegreeAr(String doctorDegreeAr) {
        this.doctorDegreeAr = doctorDegreeAr;
    }

    
    @Column(name="gender_id")
    public Integer getGenderId() {
        return this.genderId;
    }
    
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    
    @Column(name="doctor_imagepath", length=45)
    public String getDoctorImagepath() {
        return this.doctorImagepath;
    }
    
    public void setDoctorImagepath(String doctorImagepath) {
        this.doctorImagepath = doctorImagepath;
    }

    
    @Column(name="deleted", nullable=false)
    public int getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="doctor")
    public Set<DoctorClinc> getDoctorClincs() {
        return this.doctorClincs;
    }
    
    public void setDoctorClincs(Set<DoctorClinc> doctorClincs) {
        this.doctorClincs = doctorClincs;
    }




}


