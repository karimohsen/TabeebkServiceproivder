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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clinic generated by hbm2java
 */
@Entity
@Table(name="clinic"
    ,catalog="graduationprojecttabeebakdb"
)
public class Clinic  implements java.io.Serializable {


     private Integer clinicId;
     private String clinicName;
     private String clinicNameAr;
     private String clinicImagepath;
     private int deleted;
     private Set<DoctorClinc> doctorClincs = new HashSet<DoctorClinc>(0);

    public Clinic() {
    }

	
    public Clinic(int deleted) {
        this.deleted = deleted;
    }
    public Clinic(String clinicName, String clinicNameAr, String clinicImagepath, int deleted, Set<DoctorClinc> doctorClincs) {
       this.clinicName = clinicName;
       this.clinicNameAr = clinicNameAr;
       this.clinicImagepath = clinicImagepath;
       this.deleted = deleted;
       this.doctorClincs = doctorClincs;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="clinic_id", unique=true, nullable=false)
    public Integer getClinicId() {
        return this.clinicId;
    }
    
    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    
    @Column(name="clinic_name", length=45)
    public String getClinicName() {
        return this.clinicName;
    }
    
    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    
    @Column(name="clinic_name_ar", length=45)
    public String getClinicNameAr() {
        return this.clinicNameAr;
    }
    
    public void setClinicNameAr(String clinicNameAr) {
        this.clinicNameAr = clinicNameAr;
    }

    
    @Column(name="clinic_imagepath", length=100)
    public String getClinicImagepath() {
        return this.clinicImagepath;
    }
    
    public void setClinicImagepath(String clinicImagepath) {
        this.clinicImagepath = clinicImagepath;
    }

    
    @Column(name="deleted", nullable=false)
    public int getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="clinic")
    public Set<DoctorClinc> getDoctorClincs() {
        return this.doctorClincs;
    }
    
    public void setDoctorClincs(Set<DoctorClinc> doctorClincs) {
        this.doctorClincs = doctorClincs;
    }




}


