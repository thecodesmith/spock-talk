import groovy.transform.Canonical

// Dynamic typing
// public optional
// Map constructor
// Getters/setters
// @Canonical
// Expando class

def stack = new Stack()
def list = []
def map = [:]

@Canonical
class Demo {
    def name
    def id
}

def demo = new Demo(name: 'brian', id: 2014)

println demo


