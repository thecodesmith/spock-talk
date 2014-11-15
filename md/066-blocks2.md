## Logical Code Blocks

`setup: / expect: / where:`

```
import groovy.sql.Sql

class SimpleSpec extends Specification {
    
    def 'sorted crew names'() {
        setup:
        def starship = new Expando(name: 'Enterprise', captain: name)

        expect:
        starship.captain == name
        
        where:
        name << ['Kirk', 'Picard']
    }
}
```
