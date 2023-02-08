//Luis Leonardo Rivera Toerrafría 
//Todo número complejo puede representarse como la suma de un número real y un número imaginario 
//(que es un múltiplo real de la unidad imaginaria, que se indica con la letra i)
//Se define cada número complejo z como un par ordenado de números reales: z = (a, b). A su vez el primer elemento a se define como parte real de z
//el segundo elemento b se define como parte imaginaria de z
package numeroscomplejos;

public class numero {
private double real;
private double imaginario;


    @Override
    public String toString() {
        return "{" +real+ "," + imaginario + "i}";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

}
