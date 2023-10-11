public class CarFactoryImpl implements CarFactory {
    @Override
    public Car createCar() {
        return new CarImpl();
    }

    @Override
    public Color createColor() {
        return new ColorImpl();
    }
}
