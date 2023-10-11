public class FamilyCar implements Car {
    @Override
    public String getModel() {
        return "Carro Familiar";
    }

    @Override
    public void assemble() {
        System.out.println("Montando um carro familiar.");
    }
}