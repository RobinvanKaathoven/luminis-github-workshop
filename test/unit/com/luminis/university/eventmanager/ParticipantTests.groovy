package com.luminis.university.eventmanager



import grails.test.mixin.*
import net.luminis.university.eventmanager.Participant

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Participant)
class ParticipantTests {

    void testParticipantIsDisplayedWithFirstAndLastNameSeperatedByASpace() {
        def p = new Participant(firstName: "First", lastName: "Last")

        assert p.toString() == "First Last"
    }
}
