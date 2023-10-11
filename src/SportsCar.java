public class SportsCar implements Car {
    @Override
    public String getModel() {
        return "Carro Esportivo";
    }

    @Override
    public void assemble() {
        System.out.println("Montando um carro esportivo.");
    }
}