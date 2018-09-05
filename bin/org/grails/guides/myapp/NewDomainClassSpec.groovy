package org.grails.guides.myapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class NewDomainClassSpec extends Specification implements DomainUnitTest<NewDomainClass> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
