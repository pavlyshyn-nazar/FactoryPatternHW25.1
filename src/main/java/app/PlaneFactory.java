package app;

class PlaneFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Plane();
    }
}