package com.tabeebkServer.pojo;
// Generated May 3, 2015 3:02:41 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Msp generated by hbm2java
 */
@Entity
@Table(name="msp"
    ,catalog="graduationprojecttabeebakdb"
)
public class Msp  implements java.io.Serializable {


     private Integer mspId;
     private Msptype msptype;
     private Integer typeId;
     private int deleted;
     private Set<Mic> mics = new HashSet<Mic>(0);

    public Msp() {
    }

	
    public Msp(int deleted) {
        this.deleted = deleted;
    }
    public Msp(Msptype msptype, Integer typeId, int deleted, Set<Mic> mics) {
       this.msptype = msptype;
       this.typeId = typeId;
       this.deleted = deleted;
       this.mics = mics;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="msp_id", unique=true, nullable=false)
    public Integer getMspId() {
        return this.mspId;
    }
    
    public void setMspId(Integer mspId) {
        this.mspId = mspId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="msptype_type_id")
    public Msptype getMsptype() {
        return this.msptype;
    }
    
    public void setMsptype(Msptype msptype) {
        this.msptype = msptype;
    }

    
    @Column(name="type_id")
    public Integer getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    
    @Column(name="deleted", nullable=false)
    public int getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="micmsp", catalog="graduationprojecttabeebakdb", joinColumns = { 
        @JoinColumn(name="msp_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="mic_id", nullable=false, updatable=false) })
    public Set<Mic> getMics() {
        return this.mics;
    }
    
    public void setMics(Set<Mic> mics) {
        this.mics = mics;
    }




}


