package com.tabeebkServer.pojo;
// Generated May 24, 2015 2:45:18 PM by Hibernate Tools 4.3.1


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
     private Msptype msptype;
     private User user;
     private Date ratingDate;
     private String ratingComment;
     private int typeId;
     private Integer ratingValue;

    public Ratting() {
    }

	
    public Ratting(Msptype msptype, User user, int typeId) {
        this.msptype = msptype;
        this.user = user;
        this.typeId = typeId;
    }
    public Ratting(Msptype msptype, User user, Date ratingDate, String ratingComment, int typeId, Integer ratingValue) {
       this.msptype = msptype;
       this.user = user;
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
    @JoinColumn(name="msptype_type_id", nullable=false)
    public Msptype getMsptype() {
        return this.msptype;
    }
    
    public void setMsptype(Msptype msptype) {
        this.msptype = msptype;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
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


