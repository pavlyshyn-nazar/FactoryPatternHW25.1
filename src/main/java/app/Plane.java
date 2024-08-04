package app;

class Plane implements Transportable {
    @Override
    public void move() {
        System.out.println("Plane is flying in the sky");
    }
}
