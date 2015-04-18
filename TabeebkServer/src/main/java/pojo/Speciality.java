package pojo;
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
import javax.persistence.UniqueConstraint;

/**
 * Speciality generated by hbm2java
 */
@Entity
@Table(name="speciality"
    ,catalog="graduationprojecttabeebakdb"
    , uniqueConstraints = @UniqueConstraint(columnNames="speciality_name") 
)
public class Speciality  implements java.io.Serializable {


     private Integer specialityId;
     private Msptype msptype;
     private String specialityName;
     private String specialityNameAr;
     private String specialityDescrption;
     private String specialityDescrptionAr;
     private int msptypeTypeId;

    public Speciality() {
    }

	
    public Speciality(int msptypeTypeId) {
        this.msptypeTypeId = msptypeTypeId;
    }
    public Speciality(Msptype msptype, String specialityName, String specialityNameAr, String specialityDescrption, String specialityDescrptionAr, int msptypeTypeId) {
       this.msptype = msptype;
       this.specialityName = specialityName;
       this.specialityNameAr = specialityNameAr;
       this.specialityDescrption = specialityDescrption;
       this.specialityDescrptionAr = specialityDescrptionAr;
       this.msptypeTypeId = msptypeTypeId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="speciality_id", unique=true, nullable=false)
    public Integer getSpecialityId() {
        return this.specialityId;
    }
    
    public void setSpecialityId(Integer specialityId) {
        this.specialityId = specialityId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type_id")
    public Msptype getMsptype() {
        return this.msptype;
    }
    
    public void setMsptype(Msptype msptype) {
        this.msptype = msptype;
    }

    
    @Column(name="speciality_name", unique=true, length=45)
    public String getSpecialityName() {
        return this.specialityName;
    }
    
    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    
    @Column(name="speciality_name_ar", length=45)
    public String getSpecialityNameAr() {
        return this.specialityNameAr;
    }
    
    public void setSpecialityNameAr(String specialityNameAr) {
        this.specialityNameAr = specialityNameAr;
    }

    
    @Column(name="speciality_descrption", length=45)
    public String getSpecialityDescrption() {
        return this.specialityDescrption;
    }
    
    public void setSpecialityDescrption(String specialityDescrption) {
        this.specialityDescrption = specialityDescrption;
    }

    
    @Column(name="speciality_descrption_ar", length=45)
    public String getSpecialityDescrptionAr() {
        return this.specialityDescrptionAr;
    }
    
    public void setSpecialityDescrptionAr(String specialityDescrptionAr) {
        this.specialityDescrptionAr = specialityDescrptionAr;
    }

    
    @Column(name="msptype_type_id", nullable=false)
    public int getMsptypeTypeId() {
        return this.msptypeTypeId;
    }
    
    public void setMsptypeTypeId(int msptypeTypeId) {
        this.msptypeTypeId = msptypeTypeId;
    }




}


