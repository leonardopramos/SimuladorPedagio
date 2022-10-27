public class App {
    public static void main(String[] args) throws Exception {

        Cabine c1 = new Cabine(1);

        Veiculo v1 = new Veiculo("IMO3038", "Carro");
        Veiculo v2 = new Veiculo("IZH2309", "Carro");
        Veiculo v3 = new Veiculo("FOKD9405", "Moto");

        c1.getCabine().adicionar(v1);
        c1.getCabine().adicionar(v2);
        c1.getCabine().adicionar(v3);

        System.out.println("Cabine " + c1.getNumeroCabine() + ": " + c1.getCabine());
        System.out.println("Próximo a ser atendido: " + c1.getCabine().retornaFinal());
    }
}
