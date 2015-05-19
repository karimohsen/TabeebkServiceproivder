package com.tabeebkServer.pojo;
// Generated May 15, 2015 3:04:27 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Reservationstatus generated by hbm2java
 */
@Entity
@Table(name="reservationstatus"
    ,catalog="graduationprojecttabeebakdb"
)
public class Reservationstatus  implements java.io.Serializable {


     private Integer id;
     private String statusEng;
     private String statusAr;

    public Reservationstatus() {
    }

    public Reservationstatus(String statusEng, String statusAr) {
       this.statusEng = statusEng;
       this.statusAr = statusAr;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="status_eng", length=45)
    public String getStatusEng() {
        return this.statusEng;
    }
    
    public void setStatusEng(String statusEng) {
        this.statusEng = statusEng;
    }

    
    @Column(name="status_ar", length=45)
    public String getStatusAr() {
        return this.statusAr;
    }
    
    public void setStatusAr(String statusAr) {
        this.statusAr = statusAr;
    }




}


