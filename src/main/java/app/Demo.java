package app;

class Demo {

    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transportable car = carFactory.createTransport();
        car.move();

        TransportFactory planeFactory = new PlaneFactory();
        Transportable plane = planeFactory.createTransport();
        plane.move();
    }
}

