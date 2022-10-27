public class Cabine{

    private int qtdVeiculos;
    private Fila cabine;
    private boolean temCarro;
    private int numeroCabine;

    public Cabine(int numeroCabine){
        this.cabine = new Fila();
        this.qtdVeiculos = cabine.getQuantidade();
        this.temCarro = false;
        this.numeroCabine = numeroCabine;
    }

    public String statusDaCabine(){
        String status = "Não há carros na fila da cabine.";
        if(getQtdVeiculos() > 0){
            status = "Há carros na fila da cabine" + this.getNumeroCabine() + ".";
            temCarro = true;
        }
        return status;
    }
    
    public int getNumeroCabine() {
        return numeroCabine;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }
    public Fila getCabine() {
        return cabine;
    }

    
}