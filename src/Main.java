public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryImpl();

        Car car = carFactory.createCar();
        Color color = carFactory.createColor();

        System.out.println("Modelo: " + car.getModel());
        System.out.println("Cor: " + color.getColor());
        car.assemble();

        Car sportsCar = new SportsCar();
        Color redColor = new RedColor();

        System.out.println("Modelo: " + sportsCar.getModel());
        System.out.println("Cor: " + redColor.getColor());
        sportsCar.assemble();
    }
}
