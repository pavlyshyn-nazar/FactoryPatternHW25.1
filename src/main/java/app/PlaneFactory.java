package app;

class PlaneFactory extends TransportFactory {
    @Override
    Transportable createTransport() {
        return new Plane();
    }
}