package app;

class Demo {
    public void run() {
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        car.move();

        TransportFactory planeFactory = new PlaneFactory();
        Transport plane = planeFactory.createTransport();
        plane.move();
    }
}

