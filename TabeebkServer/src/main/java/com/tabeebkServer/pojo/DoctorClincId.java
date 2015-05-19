package com.tabeebkServer.pojo;
// Generated May 15, 2015 3:04:27 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DoctorClincId generated by hbm2java
 */
@Embeddable
public class DoctorClincId  implements java.io.Serializable {


     private int doctorId;
     private int clincId;

    public DoctorClincId() {
    }

    public DoctorClincId(int doctorId, int clincId) {
       this.doctorId = doctorId;
       this.clincId = clincId;
    }
   


    @Column(name="doctor_id", nullable=false)
    public int getDoctorId() {
        return this.doctorId;
    }
    
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }


    @Column(name="clinc_id", nullable=false)
    public int getClincId() {
        return this.clincId;
    }
    
    public void setClincId(int clincId) {
        this.clincId = clincId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DoctorClincId) ) return false;
		 DoctorClincId castOther = ( DoctorClincId ) other; 
         
		 return (this.getDoctorId()==castOther.getDoctorId())
 && (this.getClincId()==castOther.getClincId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getDoctorId();
         result = 37 * result + this.getClincId();
         return result;
   }   


}


