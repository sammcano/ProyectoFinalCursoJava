package herencia.pasteleria;

public class Pastel {
    protected String sabor;
    private double precio;

    //Metodo constructor
    public Pastel(){
    }

    public Pastel(String sabor, double precio){
        this.sabor = sabor;
        this.precio = precio;
    }

    // Gets y sets
    public String getSabor(){
        if(this.sabor == null) {
            this.sabor = "Vainilla";
            return sabor;
        }
        else {
            return sabor;
        }
    }

    public void setSabor(String Sabor){
        this.sabor = Sabor;
    }


    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }






}
