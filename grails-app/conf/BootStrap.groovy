import com.luminis.university.eventmanager.Entry
import com.luminis.university.eventmanager.Event
import com.luminis.university.eventmanager.Participant

class BootStrap {

    def init = { servletContext ->

        //Add some events
        def grails101 = new Event(name: "Luminis University Grails 101").save()
        def grails102 = new Event(name: "Luminis University Grails 102").save()
        def koningsdag = new Event(name: "Koningsdag").save()

        //Add some participants
        def robin = new Participant(firstName: "Robin", lastName: "van Kaathoven").save()
        def frank = new Participant(firstName: "Frank", lastName: "Wolferink").save()

        //Add some entries
        def robinGrails101Entry = new Entry(participant: robin, event: grails101).save()
        def robinGrails102Entry = new Entry(participant: robin, event: grails102).save()
        def frankGrails101Entry = new Entry(participant: frank, event: grails101).save()

    }
    def destroy = {
    }
}
