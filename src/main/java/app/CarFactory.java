package app;

class CarFactory extends TransportFactory {
    @Override
    Transportable createTransport() {
        return new Car();
    }
}


