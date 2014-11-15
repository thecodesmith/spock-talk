### State-Based Testing
## `old()` Method

```
def 'add item to collection'() {
    given: 'a list of values'
    def values = [4, 8, 15, 16]

    when: 'adding a single value'
    values << 23

    then: 'list size increases by 1'
    values.size() == old(values.size()) + 1
}
```
