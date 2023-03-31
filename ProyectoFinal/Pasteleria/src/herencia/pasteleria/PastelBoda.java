package herencia.pasteleria;

public class PastelBoda extends Pastel {
    private int niveles;

    public void setNiveles(int niveles){
        this.niveles = niveles;
    }

    public int getNiveles(){
        return  niveles;
    }

    public String getSabor(){
        if(super.sabor == null) {
            this.sabor = "Almendra";
            return sabor;
        }
        else {
            return sabor;
        }
    }

}
