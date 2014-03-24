package com.luminis.university.eventmanager

class Entry {

    static belongsTo = [
            event: Event,
            participant: Participant
    ]

    static constraints = {
        event(unique: ['participant'])
    }

}
