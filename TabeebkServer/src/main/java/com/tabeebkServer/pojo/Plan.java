package com.tabeebkServer.pojo;
// Generated May 3, 2015 3:02:41 AM by Hibernate Tools 3.6.0


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Plan generated by hbm2java
 */
@Entity
@Table(name="plan"
    ,catalog="graduationprojecttabeebakdb"
)
public class Plan  implements java.io.Serializable {


     private Integer planId;
     private Integer version;
     private Mic mic;
     private String planName;
     private String planNameAr;
     private String planDescription;
     private String planDescriptionAr;
     private Date planInsertDate;
     private Date planUpdatedDate;
     private Integer deleted;
     private Set<Planmsp> planmsps = new HashSet<Planmsp>(0);

    public Plan() {
    }

    public Plan(Mic mic, String planName, String planNameAr, String planDescription, String planDescriptionAr, Date planInsertDate, Date planUpdatedDate, Integer deleted, Set<Planmsp> planmsps) {
       this.mic = mic;
       this.planName = planName;
       this.planNameAr = planNameAr;
       this.planDescription = planDescription;
       this.planDescriptionAr = planDescriptionAr;
       this.planInsertDate = planInsertDate;
       this.planUpdatedDate = planUpdatedDate;
       this.deleted = deleted;
       this.planmsps = planmsps;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="plan_id", unique=true, nullable=false)
    public Integer getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @Version
    @Column(name="version")
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mic_id")
    public Mic getMic() {
        return this.mic;
    }
    
    public void setMic(Mic mic) {
        this.mic = mic;
    }

    
    @Column(name="plan_name", length=45)
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    
    @Column(name="plan_name_ar", length=45)
    public String getPlanNameAr() {
        return this.planNameAr;
    }
    
    public void setPlanNameAr(String planNameAr) {
        this.planNameAr = planNameAr;
    }

    
    @Column(name="plan_description", length=150)
    public String getPlanDescription() {
        return this.planDescription;
    }
    
    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    
    @Column(name="plan_description_ar", length=100)
    public String getPlanDescriptionAr() {
        return this.planDescriptionAr;
    }
    
    public void setPlanDescriptionAr(String planDescriptionAr) {
        this.planDescriptionAr = planDescriptionAr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Plan_insert_date", length=19)
    public Date getPlanInsertDate() {
        return this.planInsertDate;
    }
    
    public void setPlanInsertDate(Date planInsertDate) {
        this.planInsertDate = planInsertDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="plan_updated_date", length=19)
    public Date getPlanUpdatedDate() {
        return this.planUpdatedDate;
    }
    
    public void setPlanUpdatedDate(Date planUpdatedDate) {
        this.planUpdatedDate = planUpdatedDate;
    }

    
    @Column(name="deleted")
    public Integer getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="plan")
    public Set<Planmsp> getPlanmsps() {
        return this.planmsps;
    }
    
    public void setPlanmsps(Set<Planmsp> planmsps) {
        this.planmsps = planmsps;
    }




}


