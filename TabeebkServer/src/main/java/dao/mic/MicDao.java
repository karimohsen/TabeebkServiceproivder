/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.mic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pojo.Mic;
import session.factory.HibernateUtilFactory;

/**
 *
 * @author Karim
 */
public class MicDao {
    static SessionFactory factory = HibernateUtilFactory.getSessionFactory();
    static Session session = factory.openSession();
    public Mic getMicDetails(int id){
        return (Mic)session.get(Mic.class, id);
    } 

}
