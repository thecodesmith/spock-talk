### Getting Started
## Extend `Specification` Class

```
import spock.lang.Specification

class SimpleSpec extends Specification {

    def 'maximum of two numbers'() {
        expect:
        Math.max(1, 3) == 4
    }
}
```
