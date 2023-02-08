
package filosofos;


public class Filosofos {
    
    public static void main(String[] args) throws InterruptedException {
       boolean tenedor1=true,tenedor2=true,tenedor3=true,tenedor4=true,tenedor5=true;
       filosofo fil1=new filosofo(true,tenedor1,tenedor5,"F1");
       filosofo fil2=new filosofo(false,tenedor2,tenedor1,"F2");
       filosofo fil3=new filosofo(false,tenedor3,tenedor2,"F3");
       filosofo fil4=new filosofo(false,tenedor4,tenedor3,"F4");
       filosofo fil5=new filosofo(false,tenedor5,tenedor4,"F5");
       fil1.setDerecha(fil5);
       fil5.setDerecha(fil4);
       fil4.setDerecha(fil3);
       fil3.setDerecha(fil2);
       fil2.setDerecha(fil1);
       
       
       fil1.start();fil2.start();fil3.start();fil4.start();fil5.start();
       
    }
    
}
