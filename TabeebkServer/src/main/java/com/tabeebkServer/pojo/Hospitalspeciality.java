package com.tabeebkServer.pojo;
// Generated Jun 15, 2015 12:46:00 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Hospitalspeciality generated by hbm2java
 */
@Entity
@Table(name = "hospitalspeciality", catalog = "graduationprojecttabeebakdb"
)
public class Hospitalspeciality implements java.io.Serializable {

    private Integer id;
    private Hospital hospital;
    private Doctorspeciality doctorspeciality;
    private Integer deleted;

    public Hospitalspeciality() {
    }

    public Hospitalspeciality(Hospital hospital, Doctorspeciality doctorspeciality, Integer deleted) {
        this.hospital = hospital;
        this.doctorspeciality = doctorspeciality;
        this.deleted = deleted;
    }

    public Hospitalspeciality(Doctorspeciality doctorspeciality, Hospital hospital, Integer deleted) {
        this.hospital = hospital;
        this.doctorspeciality = doctorspeciality;
        this.deleted = deleted;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "speciality_id")
    public Doctorspeciality getDoctorspeciality() {
        return this.doctorspeciality;
    }

    public void setDoctorspeciality(Doctorspeciality doctorspeciality) {
        this.doctorspeciality = doctorspeciality;
    }

    @Column(name = "deleted")
    public Integer getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}
