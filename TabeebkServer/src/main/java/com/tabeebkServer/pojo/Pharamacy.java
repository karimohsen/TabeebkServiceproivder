package com.tabeebkServer.pojo;
// Generated May 3, 2015 3:02:41 AM by Hibernate Tools 3.6.0


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
 * Pharamacy generated by hbm2java
 */
@Entity
@Table(name="pharamacy"
    ,catalog="graduationprojecttabeebakdb"
)
public class Pharamacy  implements java.io.Serializable {


     private Integer pharamacyId;
     private Hospital hospital;
     private String pharamacyName;
     private String pharamacyNameAr;
     private String pharamacyImagepath;
     private int deleted;

    public Pharamacy() {
    }

	
    public Pharamacy(String pharamacyName, int deleted) {
        this.pharamacyName = pharamacyName;
        this.deleted = deleted;
    }
    public Pharamacy(Hospital hospital, String pharamacyName, String pharamacyNameAr, String pharamacyImagepath, int deleted) {
       this.hospital = hospital;
       this.pharamacyName = pharamacyName;
       this.pharamacyNameAr = pharamacyNameAr;
       this.pharamacyImagepath = pharamacyImagepath;
       this.deleted = deleted;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="pharamacy_id", unique=true, nullable=false)
    public Integer getPharamacyId() {
        return this.pharamacyId;
    }
    
    public void setPharamacyId(Integer pharamacyId) {
        this.pharamacyId = pharamacyId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hospital_id")
    public Hospital getHospital() {
        return this.hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    
    @Column(name="pharamacy_name", nullable=false, length=45)
    public String getPharamacyName() {
        return this.pharamacyName;
    }
    
    public void setPharamacyName(String pharamacyName) {
        this.pharamacyName = pharamacyName;
    }

    
    @Column(name="pharamacy_name_ar", length=45)
    public String getPharamacyNameAr() {
        return this.pharamacyNameAr;
    }
    
    public void setPharamacyNameAr(String pharamacyNameAr) {
        this.pharamacyNameAr = pharamacyNameAr;
    }

    
    @Column(name="pharamacy_imagepath", length=45)
    public String getPharamacyImagepath() {
        return this.pharamacyImagepath;
    }
    
    public void setPharamacyImagepath(String pharamacyImagepath) {
        this.pharamacyImagepath = pharamacyImagepath;
    }

    
    @Column(name="deleted", nullable=false)
    public int getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }




}


