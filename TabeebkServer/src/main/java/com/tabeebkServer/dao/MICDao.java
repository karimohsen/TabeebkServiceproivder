/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tabeebkServer.pojo.Clinic;
import com.tabeebkServer.pojo.Doctor;
import com.tabeebkServer.pojo.Hospital;
import com.tabeebkServer.pojo.Lab;
import com.tabeebkServer.pojo.Mic;
import com.tabeebkServer.pojo.Micuser;
import com.tabeebkServer.pojo.Msp;
import com.tabeebkServer.pojo.User;
import com.tabeebkServer.session.factory.HibernateUtilFactory;
import com.tabeebkServer.utilty.GenericMSP;

/**
 *
 * @author HMA
 */
public class MICDao {

    //===== session per dao
    static SessionFactory fact = HibernateUtilFactory.getSessionFactory();
    static Session session = fact.openSession();

    public static List<GenericMSP> viewMyMSPs(int micId) {
        //refresh session
        session.clear();
        //Generic result
        List<GenericMSP> finalResult = new ArrayList<GenericMSP>();
        //refresh session
        session.clear();
        Mic myMic = (Mic) session.get(Mic.class, micId);
        Query q = session.createQuery("from Msp m where :myMic member of mics")
                .setParameter("myMic", myMic);
        List<Msp> result = q.list();
        for (Msp m : result) {
            Hospital h = new Hospital();
            Clinic c = new Clinic();
            Doctor d = new Doctor();
            Lab l = new Lab();
            GenericMSP gmsp = new GenericMSP();
            switch (m.getMsptype().getTypeId()) {
                case 1:
                    h = (Hospital) session.get(Hospital.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(h.getHospitalName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (h.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
                case 2:
                    c = (Clinic) session.get(Clinic.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(c.getClinicName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (c.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
                case 3:
                    d = (Doctor) session.get(Doctor.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(d.getDoctorName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (d.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
                case 4:
                    l = (Lab) session.get(Lab.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(l.getLabName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (l.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
            }
        }
        return finalResult;
    }

    public static List<GenericMSP> viewOtherMSPs(int micId) {
        //refresh session
        session.clear();
        //Generic result
        List<GenericMSP> finalResult = new ArrayList<GenericMSP>();
        Mic myMic = (Mic) session.get(Mic.class, micId);
        Query q = session.createQuery("from Msp m where :myMic not member of mics")
                .setParameter("myMic", myMic);
        List<Msp> result = q.list();
        for (Msp m : result) {
            Hospital h = new Hospital();
            Clinic c = new Clinic();
            Doctor d = new Doctor();
            Lab l = new Lab();
            GenericMSP gmsp = new GenericMSP();
            switch (m.getMsptype().getTypeId()) {
                case 1:
                    h = (Hospital) session.get(Hospital.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(h.getHospitalName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (h.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
                case 2:
                    c = (Clinic) session.get(Clinic.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(c.getClinicName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (c.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
                case 3:
                    d = (Doctor) session.get(Doctor.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(d.getDoctorName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (d.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
                case 4:
                    l = (Lab) session.get(Lab.class, m.getTypeId());
                    gmsp.setMspId(m.getTypeId());
                    gmsp.setMspname(l.getLabName());
                    gmsp.setMsptypeId(m.getMsptype().getTypeId());
                    gmsp.setMsptypename(m.getMsptype().getTypeName());
                    if (l.getDeleted() == 0) {
                        finalResult.add(gmsp);
                    }
                    break;
            }
        }
        return finalResult;
    }

    public static List<User> viewMyUsers(int micId) {
        Mic mic = (Mic) session.get(Mic.class, micId);
        //fresh session
        session.clear();
        Query q = session.createQuery("from Micuser where mic = :micUser")
                .setParameter("micUser", mic);
        List<Micuser> micusers = q.list();
        List<User> result = new ArrayList<User>();
        for (Micuser micuser : micusers) {
            if(micuser.getUser().getBlocked()==0)
                result.add(micuser.getUser());
        }
        return result;
    }
    public static void updateMic(int id,String name,String namear,String desc,String descar,String url,String mail){
        Mic mic = (Mic)session.get(Mic.class, id);
        mic.setMicDescription(desc);
        mic.setMicDescriptionAr(descar);
        mic.setMicEmail(mail);
        mic.setMicName(name);
        mic.setMicNameAr(namear);
        mic.setMicUrl(url);
        if (!session.getTransaction().isActive()) {
            session.beginTransaction();
        }
        session.update(mic);
        session.getTransaction().commit();
    }
    public static Mic getMic(int id){
        return (Mic)session.get(Mic.class, id);
    }
    public static void main(String[] args) {
        //================== viewMSPs ===============================
//        System.out.println(viewOtherMSPs(1).size());
//        //================== viewMicRatting ===============================
//        List<GenericMSP> finalResult = viewMyMSPs(1);
//        for (GenericMSP fr : finalResult) {
//            System.out.println(fr.getMspId() + "  " + fr.getMspname() + " " + fr.getMsptypeId() + " " + fr.getMsptypename());
//        }
//        //================== viewMyUsers ===============================
//        List<User> result=viewMyUsers(1);
//        System.out.println("List<User> result: "+result.get(0));
    }
}
