package com.tabeebkServer.pojo;
// Generated May 20, 2015 2:56:36 PM by Hibernate Tools 3.6.0


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
 * Mspimage generated by hbm2java
 */
@Entity
@Table(name="mspimage"
    ,catalog="graduationprojecttabeebakdb"
)
public class Mspimage  implements java.io.Serializable {


     private Integer mspImageId;
     private String mspImageImageurl;
     private Set<Branche> branches = new HashSet<Branche>(0);

    public Mspimage() {
    }

	
    public Mspimage(String mspImageImageurl) {
        this.mspImageImageurl = mspImageImageurl;
    }
    public Mspimage(String mspImageImageurl, Set<Branche> branches) {
       this.mspImageImageurl = mspImageImageurl;
       this.branches = branches;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mspImage_id", unique=true, nullable=false)
    public Integer getMspImageId() {
        return this.mspImageId;
    }
    
    public void setMspImageId(Integer mspImageId) {
        this.mspImageId = mspImageId;
    }

    
    @Column(name="mspImage_imageurl", nullable=false, length=100)
    public String getMspImageImageurl() {
        return this.mspImageImageurl;
    }
    
    public void setMspImageImageurl(String mspImageImageurl) {
        this.mspImageImageurl = mspImageImageurl;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mspimage")
    public Set<Branche> getBranches() {
        return this.branches;
    }
    
    public void setBranches(Set<Branche> branches) {
        this.branches = branches;
    }




}


