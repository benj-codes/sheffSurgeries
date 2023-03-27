package com.bwillis

class Surgery {
    String name
    String address
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime
    boolean registerNewPatients

    String toString() {
        return name
    }

    static constraints = {
        name()
        address()
        postcode()
        telephone()
        numberOfPatients(min: 1)
        description()
        openingTime()
        registerNewPatients()
    }

    static hasMany = [
        doctors: Doctor,
        nurses: Nurse,
        patients: Patient,
        receptionists: Receptionist,
        appointments: Appointment
    ]
}
