## Logical Code Blocks

`given: / when: / then:`

```
class SimpleSpec extends Specification {

    def 'maximum value of list'() {
        given:
        def values = [4, 7, 9, 5]

        when:
        def max = values.max()

        then:
        max == 9
    }
}
```
