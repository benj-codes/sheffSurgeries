package com.bwillis

class Doctor {

    String doctorName
    String qualifications
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    String toString() {
        return doctorName
    }

    static constraints = {
        doctorName()
        qualifications()
        position()
        doctorEmail()
        password()
        doctorOffice()
        doctorPhone()
        bio()
    }

    static belongTo = [Nurse]

    static hasOne = [surgery: Surgery]

    static hasMany = [
        nurses: Nurse,
        appointments: Appointment,
        prescription: Prescription
    ]

}
