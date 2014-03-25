package com.luminis.university.eventmanager

class Participant {

    static constraints = {
        email email: true, blank: false
    }

    static mapping = {
        firstName column: 'First_Name'
        lastName column: 'Last_Name'
    }

    String firstName
    String lastName
    String email

    String toString() {
        "$firstName $lastName"
    }

    static hasMany = [
        entries : Entry
    ]
}
