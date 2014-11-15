### State-Based Testing
## `old()` Method

```
def 'add item to collection'() {
    given:
    def values = [4, 8, 15, 16]

    when:
    values << 23

    then:
    values.size() == old(values.size()) + 1
}
```
