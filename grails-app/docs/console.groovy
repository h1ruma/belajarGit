import org.grails.guides.*

def vehicles = Vehicle.list()

println vehicles.size()

println pickup.name
println pickup.make.name
println pickup.model.name

def honda = Make.findByName("Honda")

def hondas = Vehicle.findAllbyMake(honda)

println hondas.size()