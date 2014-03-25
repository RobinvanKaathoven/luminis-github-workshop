package com.luminis.university.eventmanager

class Entry {

    Date dateCreated

    static belongsTo = [
            event: Event,
            participant: Participant
    ]

    static constraints = {
        event(unique: ['participant'])
    }

    static mapping = {
        autoTimestamp true
        version false
    }

    String toString() {
        "$participant on $event"
    }
}
