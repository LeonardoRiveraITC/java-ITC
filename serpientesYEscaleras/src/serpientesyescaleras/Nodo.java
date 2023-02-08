
package serpientesyescaleras;


public class Nodo {
int numeroLista, valor,  apuntador;

    public Nodo(int numeroLista, int valor, int apuntador) {
        this.numeroLista = numeroLista;
        this.valor = valor;
        this.apuntador = apuntador;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getApuntador() {
        return apuntador;
    }

    public void setApuntador(int apuntador) {
        this.apuntador = apuntador;
    }
    

}
