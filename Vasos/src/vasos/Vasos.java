
package vasos;

public class Vasos {


    public static void main(String[] args) {
        Vaso vaso1 = new Vaso();
        Vaso vaso2 = new Vaso();
        Vaso vaso3 = new Vaso();
        
        vaso1.llenarVaso();
        vaso2.llenarVaso();
        
        vaso1.validar();
        vaso2.validar();
        
        //vaso1.moverAgua(vaso3);
      
        
        vaso1.imprimir(vaso1, vaso2, vaso3);
        
        vaso1.comprobar(vaso1, vaso2, vaso3);
        if(vaso1.comprobar(vaso1, vaso2, vaso3)){
            System.out.println("fin");
        }else{
            System.out.println("no");
        }
    }
    
}
