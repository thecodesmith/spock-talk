import groovy.transform.Canonical
import spock.lang.Specification
import spock.lang.Unroll

class StackSpec extends Specification {

    def 'adding item to stack'() {
        setup:
        def stack = new Stack()

        when:
        stack.push(5)

        then:
        stack.size() == 1
    }

    def 'adding multiple items'() {
        given:
        def stack = new Stack()

        when:
        values.each { val ->
            stack.push(val)
        }

        then:
        stack.size() == values.size()

        where:
        values  | _
        [1,2,3] | _
        [1,2,3] | _
        [1,2,3] | _
    }

    @Unroll
    def 'driving #distance with #gas gallons'() {
        given:
        def car = new Car(driver: 'brian', gas: 20)
        car.gas = gas

        when:
        car.drive(distance)

        then:
        car.gas == old(car.gas) - (distance / 20)

        where:
        gas | distance
        20  | 100
        0   | 100
        10  | 10
        20  | 0
    }

    def 'catch out of gas'() {
        given:
        def car = new Car()
        car.gas = 1

        when:
        car.drive(10)

        then:
        notThrown Exception
    }
}

@Canonical
class Car {
    def driver
    def gas

    def drive(distance) {
        gas -= (distance / 20)
        if (gas < 0) {
            throw new Exception('out of gas')
        }
    }
}
