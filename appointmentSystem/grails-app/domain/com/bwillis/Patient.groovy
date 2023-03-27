package com.bwillis

class Patient {

    String patientName
    String patientAddress
    String patientResidence
    String patientDOB
    String patientID
    Date dateRegistered
    String patientPhone

    String toString() {
        return patientName
    }

    static constraints = {
        patientName()
        patientAddress()
        patientResidence()
        patientDOB()
        patientID()
        dateRegistered()
        patientPhone()
    }

    static hasOne = [surgery: Surgery]

    static hasMany =
    [
        appointments: Appointment,
        prescriptions: Prescription
    ]

}
