package com.luminis.university.eventmanager

class Event {

    static constraints = {
        name blank: false, minSize: 5
        eventStart nullable: true
        eventEnd nullable: true, validator: { val, obj -> val >= obj.eventStart }
    }

    static mapping = {
        sort eventStart: "asc"
    }

    Date eventStart
    Date eventEnd
    Date dateCreated
    String name

    static hasMany = [
            entries : Entry
    ]

    def beforeInsert() {
        dateCreated = new Date()
    }

    String toString(){
        name
    }
}
