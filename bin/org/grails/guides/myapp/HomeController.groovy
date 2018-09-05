package org.grails.guides.myapp

import org.grails.guides.myapp.Vehicle

class HomeController {

    def index() {
        respond([name: session.name ?: 'Guest', vehicleTotal: Vehicle.count()])
        

    }

    def updateName(String name){
        session.name = name

        flash.message = "Name has been updated"
        redirect action: 'index'
    }
}
