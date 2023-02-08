package vasosfis;
import static java.lang.Math.random;
import java.util.Stack;
public class Vaso {
    
    Stack stack = new Stack();
    
    public void validar(){
        if(this.stack.size()>=2){
        if(this.stack.peek().equals(this.stack.get(this.stack.size()-2))){
            stack.clear();  
        llenarVaso();
        validar();             
        }
        }
       
    }
    public void moverAgua(Vaso vaso2){
        
        vaso2.stack.push(this.stack.peek());
        this.stack.pop();
        
    }
    public void llenarVaso(){
        double tope=Math.floor(Math.random()*2+0);
        for(int i=0;i<=tope;i++){
            this.stack.push(Math.floor(Math.random()*2+0));
        }    
    }
    public boolean comprobar(Vaso vaso1, Vaso vaso2, Vaso vaso3){
        Stack v1,v2,v3;
        v1=vaso1.stack;
        v2=vaso2.stack;
        v3=vaso3.stack;
        if(!v1.empty()){
        if(v1.peek().equals(0.0)){
            if(v1.contains(1)){
                return false;
            }
        }
        if(v1.peek().equals(1.0)){
            if(v1.contains(0)){
                return false;
            }
        }
        }
        if(!v2.empty()){
        if(v2.peek().equals(0.0)){
            if(v2.contains(1.0)){
                return false;
            }
        }        
        if(v2.peek().equals(1.0)){
            if(v2.contains(0.0)){
                return false;
            }
        }
        }
        if(!v3.empty()){
        if(v3.peek().equals(0.0)){
            if(v3.contains(1.0)){
                return false;
            }
        }        
        if(v3.peek().equals(1.0)){
            if(v3.contains(0.0)){
                return false;
            }
        }
        }
        return true;
    }
    public void imprimir(Vaso vaso1, Vaso vaso2, Vaso vaso3){
        Stack v1,v2,v3;
        v1=(Stack)vaso1.stack.clone();
        v2=(Stack)vaso2.stack.clone();
        v3=(Stack)vaso3.stack.clone();
        if(!v1.empty()){
        System.out.println("Vaso 1");
        for(int i=0;i<=v1.size();i++){
            if(v1.peek().equals(1.0)){
            System.out.println("|"+"rojo"+"|");
            v1.pop();                
            }else{
            System.out.println("|"+"azul"+"|");
            v1.pop();                 
            }
        }
        System.out.println("--------");
        }else{
            System.out.println("vaso 1");
            System.out.println("|   |");
            System.out.println("--------");
        }
        if(!v2.empty()){
        System.out.println("Vaso 2");
        for(int i=0;i<=v2.size();i++){
            if(v2.peek().equals(1.0)){
            System.out.println("|"+"rojo"+"|");
            v2.pop();                
            }else{
            System.out.println("|"+"azul"+"|");
            v2.pop();                 
            }
        }
        System.out.println("--------");
        }else{
            System.out.println("vaso 2");
            System.out.println("|   |");
            System.out.println("--------");
        }
        if(!v3.empty()){
        System.out.println("Vaso 3");
        for(int i=0;i<=v3.size();i++){
            if(v3.peek().equals(1.0)){
            System.out.println("|"+"rojo"+"|");
            v3.pop();                
            }else{
            System.out.println("|"+"azul"+"|");
            v3.pop();                 
            }
        }
        System.out.println("--------");
        }else{
            System.out.println("vaso 3");
            System.out.println("|   |");
            System.out.println("--------");
        }
    }
}

    
    

