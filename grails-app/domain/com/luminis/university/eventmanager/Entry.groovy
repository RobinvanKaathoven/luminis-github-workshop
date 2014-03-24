package com.luminis.university.eventmanager

class Entry {

    static mapping = {
        autoTimestamp true
    }

    Date dateCreated

    static belongsTo = [
            event: Event,
            participant: Participant
    ]

    static constraints = {
        event(unique: ['participant'])
    }

}
