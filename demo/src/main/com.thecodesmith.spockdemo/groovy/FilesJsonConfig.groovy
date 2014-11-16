import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

// JSON Builder
def builder = new JsonBuilder()
builder.people {
    person {
        firstName 'Brian'
        lastName 'Stewart'
        student true
        address(
                city: 'Eau Claire',
                country: 'USA',
                zip: 54703,
        )
    }
}

println builder.toString()

// JSON Slurper
def slurper = new JsonSlurper()
def result = slurper.parseText('{"person":{"name":"Brian","age":28,"pets":["dog","cat"]}}')

assert result.person.name == "Brian"
assert result.person.age == 28
assert result.person.pets.size() == 2
assert result.person.pets[0] == "dog"
assert result.person.pets[1] == "cat"

// Files
new File('items.csv').eachLine { line ->
    println line.split(',')
}

def file = new File('items.csv')

file.withWriter { writer ->
    10.times { i ->
        writer.write("line $i")
    }
}
