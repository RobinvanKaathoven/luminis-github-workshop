package com.luminis.university.eventmanager

import grails.converters.JSON
import org.springframework.dao.DataIntegrityViolationException

class EntryController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
    static scaffold = true

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)

        def entryInstanceList = Entry.list(params)
        def entryInstanceTotal = Entry.count()

        if(params.contentType == "json") {
            render entryInstanceList as JSON
            return
        } else if (params.contentType == "xml") {
            render(contentType: "text/xml") {
                entries {
                    entryInstanceList.each { entryInstance ->
                        entry(participant: entryInstance.participant, event: entryInstance.event)
                    }

                }

            }
            return
        }

        [entryInstanceList: entryInstanceList, entryInstanceTotal: entryInstanceTotal]
    }

    def show(Long id) {
        def entryInstance = Entry.get(id)

        if (!entryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'entry.label', default: 'Entry'), id])
            redirect(action: "list")
            return
        }

        if(params.contentType == "json") {
            render entryInstance as JSON
            return
        } else if (params.contentType == "xml") {
            render(contentType: "text/xml") {
                entry(participant: entryInstance.participant, event: entryInstance.event)
            }
            return
        }

        [entryInstance: entryInstance]
    }
}
