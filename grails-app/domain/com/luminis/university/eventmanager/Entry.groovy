package com.luminis.university.eventmanager

class Entry {

    static constraints = {
        event(unique: ['participant'])
    }

    static mapping = {
        autoTimestamp true
        version false
    }

    Date dateCreated

    static belongsTo = [
            event: Event,
            participant: Participant
    ]

    String toString() {
        "$participant on $event"
    }
}
