package com.tabeebkServer.pojo;
// Generated May 24, 2015 7:54:12 AM by Hibernate Tools 4.3.1


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
 * Labspecialities generated by hbm2java
 */
@Entity
@Table(name="labspecialities"
    ,catalog="graduationprojecttabeebakdb"
)
public class Labspecialities  implements java.io.Serializable {


     private Integer id;
     private String specialityName;
     private String specialityNamear;
     private String specialityDescription;
     private String specialityDescriptionar;
     private Set<Labspeciality> labspecialities = new HashSet<Labspeciality>(0);

    public Labspecialities() {
    }

    public Labspecialities(String specialityName, String specialityNamear, String specialityDescription, String specialityDescriptionar, Set<Labspeciality> labspecialities) {
       this.specialityName = specialityName;
       this.specialityNamear = specialityNamear;
       this.specialityDescription = specialityDescription;
       this.specialityDescriptionar = specialityDescriptionar;
       this.labspecialities = labspecialities;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="speciality_name", length=45)
    public String getSpecialityName() {
        return this.specialityName;
    }
    
    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    
    @Column(name="speciality_namear", length=45)
    public String getSpecialityNamear() {
        return this.specialityNamear;
    }
    
    public void setSpecialityNamear(String specialityNamear) {
        this.specialityNamear = specialityNamear;
    }

    
    @Column(name="speciality_description", length=45)
    public String getSpecialityDescription() {
        return this.specialityDescription;
    }
    
    public void setSpecialityDescription(String specialityDescription) {
        this.specialityDescription = specialityDescription;
    }

    
    @Column(name="speciality_descriptionar", length=45)
    public String getSpecialityDescriptionar() {
        return this.specialityDescriptionar;
    }
    
    public void setSpecialityDescriptionar(String specialityDescriptionar) {
        this.specialityDescriptionar = specialityDescriptionar;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="labspecialities")
    public Set<Labspeciality> getLabspecialities() {
        return this.labspecialities;
    }
    
    public void setLabspecialities(Set<Labspeciality> labspecialities) {
        this.labspecialities = labspecialities;
    }




}


