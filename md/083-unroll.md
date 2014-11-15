### Data-Driven Testing
## Method Unrolling

```
@Unroll
def 'maximum of two numbers'() {
    expect:
    Math.max(a, b) == c

    where:
    a | b || c
    1 | 3 || 3
    7 | 3 || 3
    0 | 0 || 0
}
```

Test iterations reported separately:

```
maximum of two numbers[0]   PASSED
maximum of two numbers[1]   FAILED

Math.max(a, b) == c
    |    |  |  |  |
    |    7  3  |  3
    7          false

maximum of two numbers[2]   PASSED
```
