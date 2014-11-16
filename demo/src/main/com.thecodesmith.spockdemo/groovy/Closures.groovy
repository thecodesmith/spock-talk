// Functions can be assigned and passed as variables

def func = { x, y ->
    x * y
}

func(2, 3)

def method(function) {
    def x = 5
    def y = 3
    return function(x, y)
}

method(func)
