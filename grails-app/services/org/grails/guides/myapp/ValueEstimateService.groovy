package org.grails.guides.myapp
//import grails.gorm.transactions.Transactional
import grails.transaction.Transactional

@Transactional
class ValueEstimateService {

    def getEstimate(Vehicle, vehicle) {
      log.info 'Estimating Vehicle Value.....'

      Math.round (vehicle.name.size() + vehicle.model.name.size() * vehicle.year) * 2

    }
}
