class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?/$contentType?"{
            constraints {
                // apply constraints here
            }
        }

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
