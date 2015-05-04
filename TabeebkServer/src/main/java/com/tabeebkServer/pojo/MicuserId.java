package com.tabeebkServer.pojo;
// Generated May 3, 2015 3:02:41 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MicuserId generated by hbm2java
 */
@Embeddable
public class MicuserId  implements java.io.Serializable {


     private int micId;
     private int userId;

    public MicuserId() {
    }

    public MicuserId(int micId, int userId) {
       this.micId = micId;
       this.userId = userId;
    }
   


    @Column(name="mic_id", nullable=false)
    public int getMicId() {
        return this.micId;
    }
    
    public void setMicId(int micId) {
        this.micId = micId;
    }


    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MicuserId) ) return false;
		 MicuserId castOther = ( MicuserId ) other; 
         
		 return (this.getMicId()==castOther.getMicId())
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMicId();
         result = 37 * result + this.getUserId();
         return result;
   }   


}


