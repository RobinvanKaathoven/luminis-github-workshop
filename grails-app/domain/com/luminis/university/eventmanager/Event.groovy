package com.luminis.university.eventmanager

class Event {

    static constraints = {
    }

    String name

    static hasMany = [
            entries : Entry
    ]

    String toString(){
        return name
    }
}
