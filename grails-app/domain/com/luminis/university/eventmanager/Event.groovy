package com.luminis.university.eventmanager

class Event {

    static constraints = {
    }

    String name
    static hasMany = [
            participant : Participant
    ]
}
