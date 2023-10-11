public class CarImpl implements Car {
    @Override
    public String getModel() {
        return "Carro Padrão";
    }

    @Override
    public void assemble() {
        System.out.println("Montando um carro padrão.");
    }
}