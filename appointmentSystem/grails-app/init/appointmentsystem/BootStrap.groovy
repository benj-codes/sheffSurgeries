package appointmentSystem

class BootStrap {

    def init = { servletContext ->
/*
        println "Run Bootstrap"

        def surgery = new com.bwillis.Surgery
            (
                name: 'Matilda Surgical Practice',
                address: '50 Matilda Street, Sheffield',
                postcode: 'S1 4YU',
                telephone: '0114 124 4572',
                numberOfPatients: 150,
                description: 'We are a medical surgery practice in the City of Sheffield.',
                openingTime: '8:00 - 22:00',
                registerNewPatients: true
            ).save()

        def doctor = new com.bwillis.Doctor
            (
                doctorName: 'Dr. Mike Bass',
                qualifications: 'MBChB (Sheffield)',
                position: 'GP, Surgeon',
                doctorEmail: 'mbass@gmail.com',
                password: 'passwordle',
                doctorOffice: 'B-098',
                doctorPhone: '0114 123 8900',
                bio: 'I am a GP and Surgeon',
                surgery: surgery
            ).save()
        
        def patient = new com.bwillis.Patient 
            (
                patientName: 'Nick Jonson',
                patientAddress: '65 Abbey Road, Abbeydale',
                patientResidence: 'Sheffield, Chesterfield',
                patientDOB: '14-07-1995',
                patientID: 'E67854',
                dateRegistered: '2023-08-30',
                patientPhone: '0114 123 0987',
                surgery: surgery
            ).save()

        def receptionist = new com.bwillis.Receptionist
            (
                recepName: 'Luisa Costa',
                recepEmail: 'lcosta@gmail.com',
                recepUsername: 'lcosta',
                recepPassword: 'password876',
                recepPhone: '0114 123 1145',
                surgery: surgery
            ).save()

        def nurse = new com.bwillis.Nurse
            (
                nurseName: 'Geeta Singh',
                qualifications: 'Registered Surgical Nurse',
                nurseEmail: 'gsingh@gmail.com',
                nurseOffice: 'C-576',
                nursePhone: '0114 123 0980',
                surgery: surgery
            ).save()
        
        def appointment = new com.bwillis.Appointment
            (
                appDateTime: new Date(2023 - 1900, 7, 11, 13, 0, 0),
                duration: 30,
                roomNumber: 'A-5610',
                surgery: surgery,
                doctor: doctor,
                patient: patient
            ).save()

        def prescription = new com.bwillis.Prescription
            (
                pharmacyName: 'Steeltree Pharmacy',
                prescriptionNumber: '2567',
                medicine: 'Morphine',
                daysSupply: 5,
                totalCost: 25.99,
                dateIssued: new Date(2023 - 1900, 2, 10),
                patientPaying: false,
                doctor: doctor,
                patient: patient
            ).save()
            */
    }

    def destroy = {
    }
}
