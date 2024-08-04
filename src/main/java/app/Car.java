package app;

class Car implements Transportable {
    @Override
    public void move() {
        System.out.println("Car is moving on the road");
    }
}
