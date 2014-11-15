### Interaction-Based Testing
## Mocks and Stubs

```
class Publisher {
    List<Subscriber> subscribers
    void send(String message)
}

interface Subscriber {
    void receive(String message)
}

class PublisherSpec extends Specification {
    Publisher publisher = new Publisher()
}
```

