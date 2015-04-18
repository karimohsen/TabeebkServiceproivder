package com.tabeebkServer.pojo;
// Generated Apr 7, 2015 6:46:58 PM by Hibernate Tools 4.3.1


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
 * Micratting generated by hbm2java
 */
@Entity
@Table(name="micratting"
    ,catalog="graduationprojecttabeebakdb"
)
public class Micratting  implements java.io.Serializable {


     private Integer ratingId;
     private Mic mic;
     private User user;
     private Date ratingDate;
     private String ratingComment;
     private Integer ratingValue;

    public Micratting() {
    }

	
    public Micratting(Mic mic, User user) {
        this.mic = mic;
        this.user = user;
    }
    public Micratting(Mic mic, User user, Date ratingDate, String ratingComment, Integer ratingValue) {
       this.mic = mic;
       this.user = user;
       this.ratingDate = ratingDate;
       this.ratingComment = ratingComment;
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
    @JoinColumn(name="mic_id", nullable=false)
    public Mic getMic() {
        return this.mic;
    }
    
    public void setMic(Mic mic) {
        this.mic = mic;
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

    
    @Column(name="rating_value")
    public Integer getRatingValue() {
        return this.ratingValue;
    }
    
    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }




}

