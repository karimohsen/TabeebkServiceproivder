package com.tabeebkServer.pojo;
// Generated Apr 25, 2015 12:56:11 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PlanmspId generated by hbm2java
 */
@Embeddable
public class PlanmspId  implements java.io.Serializable {


     private int planId;
     private int msptypeTypeId;
     private int typeId;

    public PlanmspId() {
    }

    public PlanmspId(int planId, int msptypeTypeId, int typeId) {
       this.planId = planId;
       this.msptypeTypeId = msptypeTypeId;
       this.typeId = typeId;
    }
   


    @Column(name="plan_id", nullable=false)
    public int getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(int planId) {
        this.planId = planId;
    }


    @Column(name="msptype_type_id", nullable=false)
    public int getMsptypeTypeId() {
        return this.msptypeTypeId;
    }
    
    public void setMsptypeTypeId(int msptypeTypeId) {
        this.msptypeTypeId = msptypeTypeId;
    }


    @Column(name="type_id", nullable=false)
    public int getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PlanmspId) ) return false;
		 PlanmspId castOther = ( PlanmspId ) other; 
         
		 return (this.getPlanId()==castOther.getPlanId())
 && (this.getMsptypeTypeId()==castOther.getMsptypeTypeId())
 && (this.getTypeId()==castOther.getTypeId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPlanId();
         result = 37 * result + this.getMsptypeTypeId();
         result = 37 * result + this.getTypeId();
         return result;
   }   


}


