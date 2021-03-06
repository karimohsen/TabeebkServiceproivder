package com.tabeebkServer.pojo;
// Generated Jun 15, 2015 12:46:00 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ratting generated by hbm2java
 */
@Entity
@Table(name="ratting"
    ,catalog="graduationprojecttabeebakdb"
)
public class Ratting  implements java.io.Serializable {


     private Integer ratingId;
     private User user;
     private Msptype msptype;
     private Date ratingDate;
     private String ratingComment;
     private int typeId;
     private Integer ratingValue;

    public Ratting() {
    }

	
    public Ratting(User user, Msptype msptype, int typeId) {
        this.user = user;
        this.msptype = msptype;
        this.typeId = typeId;
    }
    public Ratting(User user, Msptype msptype, Date ratingDate, String ratingComment, int typeId, Integer ratingValue) {
       this.user = user;
       this.msptype = msptype;
       this.ratingDate = ratingDate;
       this.ratingComment = ratingComment;
       this.typeId = typeId;
       this.ratingValue = ratingValue;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="rating_id", unique=true, nullable=false)
    public Integer getRatingId() {
        return this.ratingId;
    }
    
    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="msptype_type_id", nullable=false)
    public Msptype getMsptype() {
        return this.msptype;
    }
    
    public void setMsptype(Msptype msptype) {
        this.msptype = msptype;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="rating_date", length=19)
    public Date getRatingDate() {
        return this.ratingDate;
    }
    
    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }

    
    @Column(name="rating_comment", length=45)
    public String getRatingComment() {
        return this.ratingComment;
    }
    
    public void setRatingComment(String ratingComment) {
        this.ratingComment = ratingComment;
    }

    
    @Column(name="type_id", nullable=false)
    public int getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    
    @Column(name="rating_value")
    public Integer getRatingValue() {
        return this.ratingValue;
    }
    
    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }




}


