package com.tabeebkServer.pojo;
// Generated May 24, 2015 2:45:18 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Micuser generated by hbm2java
 */
@Entity
@Table(name="micuser"
    ,catalog="graduationprojecttabeebakdb"
)
public class Micuser  implements java.io.Serializable {


     private MicuserId id;
     private Mic mic;
     private User user;
     private Date joinDate;

    public Micuser() {
    }

    public Micuser(MicuserId id, Mic mic, User user, Date joinDate) {
       this.id = id;
       this.mic = mic;
       this.user = user;
       this.joinDate = joinDate;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="micId", column=@Column(name="mic_id", nullable=false) ), 
        @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ) } )
    public MicuserId getId() {
        return this.id;
    }
    
    public void setId(MicuserId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mic_id", nullable=false, insertable=false, updatable=false)
    public Mic getMic() {
        return this.mic;
    }
    
    public void setMic(Mic mic) {
        this.mic = mic;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="join_date", nullable=false, length=19)
    public Date getJoinDate() {
        return this.joinDate;
    }
    
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }




}


