import com.luminis.university.eventmanager.Event
import com.luminis.university.eventmanager.Participant

class BootStrap {

    def init = { servletContext ->

        //Add some events
        new Event(name: "Luminis University Grails 101").save()
        new Event(name: "Luminis University Grails 102").save()
        new Event(name: "Koningsdag").save()

        //Add some participants
        new Participant(firstName: "Robin", lastName: "van Kaathoven").save()
        new Participant(firstName: "Frank", lastName: "Wolferink").save()

    }
    def destroy = {
    }
}
