<%@ page import="com.luminis.university.eventmanager.Participant" %>



<div class="fieldcontain ${hasErrors(bean: participantInstance, field: 'entries', 'error')} ">
    <label for="entries">
        <g:message code="participant.entries.label" default="Entries"/>

    </label>

    <ul class="one-to-many">
        <g:each in="${participantInstance?.entries ?}" var="e">
            <li><g:link controller="entry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
        </g:each>
        <li class="add">
            <g:link controller="entry" action="create"
                    params="['participant.id': participantInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'entry.label', default: 'Entry')])}</g:link>
        </li>
    </ul>

</div>

<div class="fieldcontain ${hasErrors(bean: participantInstance, field: 'firstName', 'error')} ">
    <label for="firstName">
        <g:message code="participant.firstName.label" default="First Name"/>

    </label>
    <g:textField name="firstName" value="${participantInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: participantInstance, field: 'lastName', 'error')} ">
    <label for="lastName">
        <g:message code="participant.lastName.label" default="Last Name"/>

    </label>
    <g:textField name="lastName" value="${participantInstance?.lastName}"/>
</div>

