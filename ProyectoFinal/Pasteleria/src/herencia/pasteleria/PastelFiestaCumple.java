package herencia.pasteleria;

public class PastelFiestaCumple extends Pastel{
    private int velas;

    //Metodo constructor
    public PastelFiestaCumple(){
    }

    public PastelFiestaCumple(String sabor, double precio, int velas){
        super(sabor,precio);
        this.velas = velas;
    }

    public void setVelas(int velas){
        this.velas = velas;
    }

    public int getVelas(){
        return  velas;
    }

    public String getSabor(){
        if(super.sabor == null) {
            super.sabor = "Chocolate";
            return sabor;
        }
        else {
            return sabor;
        }
    }

}
