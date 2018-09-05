package org.grails.guides.myapp

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')

class Vehicle {

    Integer year
    String name
    Model model
    Make make // buat kolom make dari file "Make" (otomatis tersambung (mengambil ID) kayak bikin query di msaccess)


    static constraints = {
        year min:1900
        name maxSize:255 //max karakter untuk data name
    }
}
