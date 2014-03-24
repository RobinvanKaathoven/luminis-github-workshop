package com.luminis.university.eventmanager

class Event {

    static constraints = {
    }

    Date dateCreated
    String name

    static hasMany = [
            entries : Entry
    ]

    def beforeInsert() {
        dateCreated = new Date()
    }

    String toString(){
        return name
    }
}
