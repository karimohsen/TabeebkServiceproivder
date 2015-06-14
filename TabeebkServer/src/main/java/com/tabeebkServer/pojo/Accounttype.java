package com.tabeebkServer.pojo;
// Generated Jun 14, 2015 12:47:34 PM by Hibernate Tools 3.6.0


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
 * Accounttype generated by hbm2java
 */
@Entity
@Table(name="accounttype"
    ,catalog="graduationprojecttabeebakdb"
)
public class Accounttype  implements java.io.Serializable {


     private Integer accountTypeId;
     private String accountTypeName;
     private Set<Account> accounts = new HashSet<Account>(0);

    public Accounttype() {
    }

	
    public Accounttype(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }
    public Accounttype(String accountTypeName, Set<Account> accounts) {
       this.accountTypeName = accountTypeName;
       this.accounts = accounts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="accountType_id", unique=true, nullable=false)
    public Integer getAccountTypeId() {
        return this.accountTypeId;
    }
    
    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    
    @Column(name="accountType_name", nullable=false, length=45)
    public String getAccountTypeName() {
        return this.accountTypeName;
    }
    
    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="accounttype")
    public Set<Account> getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }




}


