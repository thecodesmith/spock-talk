import groovy.sql.Sql
import spock.lang.Shared
import spock.lang.Specification

class SqlSpec extends Specification {

    @Shared sql = Sql.newInstance('jdbc:h2:mem:', 'org.h2.Driver')

    def setup() {
        sql.execute '''
                create table cars (
                    id int primary key,
                    make varchar(20),
                    model varchar(20),
                    year int
                ) '''

        sql.execute '''
                insert into cars values
                    (1, 'Chevrolet', 'Malibu', 1998),
                    (2, 'Toyota', 'Corolla', 2001),
                    (3, 'Subaru', 'Forrester', 2007)'''
    }

    def 'sql datasource'() {
        when:
        def cars = sql.rows('select * from cars')

        then:
        cars*.year == [1998, 2001, 2007]
    }
}