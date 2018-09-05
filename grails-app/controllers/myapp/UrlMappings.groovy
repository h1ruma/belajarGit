package myapp

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"home") //folder:"nama file"
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
