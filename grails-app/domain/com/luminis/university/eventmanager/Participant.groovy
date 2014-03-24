package com.luminis.university.eventmanager

class Participant {

    static constraints = {
    }

    String firstName
    String lastName

    String toString() {
        return firstName + " " + lastName
    }

    static hasMany = [
            entries : Entry
    ]
}
