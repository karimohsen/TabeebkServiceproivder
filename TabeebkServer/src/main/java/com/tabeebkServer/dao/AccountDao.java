/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.dao;

import com.tabeebkServer.pojo.Account;
import com.tabeebkServer.pojo.Accounttype;
import com.tabeebkServer.pojo.Mic;
import com.tabeebkServer.session.factory.HibernateUtilFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HMA
 */
public class AccountDao {

    //===== session per dao
    static SessionFactory fact = HibernateUtilFactory.getSessionFactory();
    static Session session = fact.openSession();

    public Account checkLogin(Account account) {
        
        Query q = session.createQuery("from Account a where a.username = :accName and a.password = :pass")
                .setParameter("accName", account.getUsername()).setParameter("pass", account.getPassword());
        List result = q.list();
        if (result.isEmpty()) {
            return null;
        } else {
            account = (Account) result.get(0);
            return account;
        }
    }
    
    public static void AddAccount(String name,String pass,String disName,Mic mic){
        Accounttype type =(Accounttype)session.get(Accounttype.class,1);
        Account acc = new Account();
        session.clear();
        System.out.println("----------------mic"+mic);
        acc.setAccounttype(type);
        acc.setDisplayName(disName);
        acc.setPassword(pass);
        acc.setUsername(name);
        acc.setMic(mic);
        if(!session.getTransaction().isActive())
            session.beginTransaction();
        session.save(acc);
        session.getTransaction().commit();
    }
    
    public void changePassword(String pass, Account acc) {
        if(!session.getTransaction().isActive())
        session.beginTransaction();
        acc.setPassword(pass);
        session.update(acc);
        session.getTransaction().commit();

    }
}
