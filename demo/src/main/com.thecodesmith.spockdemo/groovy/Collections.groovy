// Looping / Ranges
// Star-dot operator
// Enhanced collection methods: collect, findAll, sum, max, sort

[1, 2, 4, 8].each { println it }
[1, 2, 4, 8]*.toString()
[1, 2, 4, 8].collect {
    it * 2
}.max()
