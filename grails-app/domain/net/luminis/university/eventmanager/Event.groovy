package net.luminis.university.eventmanager

class Event {

    Date dateCreated
    Date eventStart
    Date eventEnd
    String name

    static hasMany = [
            entries : Entry
    ]
    static constraints = {
        name blank: false, minSize: 5
        eventStart nullable: true
        eventEnd nullable: true, validator: { val, obj ->
            if (val < obj.eventStart) {
                return "net.luminis.university.eventmanager.Event.endDate.before.startDate.error"
            }
        }
    }

    static mapping = {
        sort eventStart: "asc"
    }

    def beforeInsert() {
        dateCreated = new Date()
    }

    String toString(){
        name
    }
}