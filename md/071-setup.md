### State-Based Testing
## `setup()` and `setupSpec()`

```
class StateSpec extends Specification {

    Car car

    def setupSpec() {
        car = new Car(make: 'Toyota', model: 'Corolla')
    }

    def setup() {
        car.mileage = 20000
    }
}
```
