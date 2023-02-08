
package serpientesyescaleras;
import java.util.Scanner;
public class SerpientesYEscaleras {

    public static void main(String[] args) {
        int temp1=0;
        int temp2=0;
        int jugador = 0;
        String cadena[];
        Nodo [] tablero = new Nodo [100];
        llenarLista(tablero);
        Scanner scanner = new Scanner(System.in);
        int repeticiones = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<repeticiones;i++){
            cadena = scanner.nextLine().split(" ");
            for(int n=1;n<((cadena.length));n+=2){
                temp1=Integer.valueOf(cadena[n]);
                temp2=Integer.valueOf(cadena[n-1]);
                jugador+=(temp1+temp2);
                if(jugador>=100){
                    jugador=100;
                }else{                
                jugador=tablero[jugador-1].getValor();
                if(!(tablero[jugador].getApuntador()==0)){
                    jugador=tablero[jugador].getApuntador();
                }
                }
        }
        System.out.println(jugador);
        jugador=0;
}
        
   }
public static void llenarLista(Nodo [] lista){
lista [0]=new Nodo(0,1,0);
lista [1]=new Nodo(1,2,0);
lista [2]=new Nodo(2,3,0);
lista [3]=new Nodo(3,4,0);
lista [4]=new Nodo(4,5,0);
lista [5]=new Nodo(5,6,0);
lista [6]=new Nodo(6,7,0);
lista [7]=new Nodo(7,8,0);
lista [8]=new Nodo(8,9,0);
lista [9]=new Nodo(9,10,0);
lista [10]=new Nodo(10,11,0);
lista [11]=new Nodo(11,12,39);
lista [12]=new Nodo(12,13,0);
lista [13]=new Nodo(13,14,0);
lista [14]=new Nodo(14,15,0);
lista [15]=new Nodo(15,16,0);
lista [16]=new Nodo(16,17,0);
lista [17]=new Nodo(17,18,67);
lista [18]=new Nodo(18,19,6);
lista [19]=new Nodo(19,20,45);
lista [20]=new Nodo(20,21,0);
lista [21]=new Nodo(21,22,56);
lista [22]=new Nodo(22,23,2);
lista [23]=new Nodo(23,24,0);
lista [24]=new Nodo(24,25,0);
lista [25]=new Nodo(25,26,0);
lista [26]=new Nodo(26,27,50);
lista [27]=new Nodo(27,28,0);
lista [28]=new Nodo(28,29,0);
lista [29]=new Nodo(29,30,0);
lista [29]=new Nodo(29,30,0);
lista [30]=new Nodo(30,31,0);
lista [31]=new Nodo(31,32,0);
lista [32]=new Nodo(32,33,0);
lista [33]=new Nodo(33,34,0);
lista [34]=new Nodo(34,35,0);
lista [35]=new Nodo(35,36,0);
lista [36]=new Nodo(36,37,20);
lista [37]=new Nodo(37,38,0);
lista [38]=new Nodo(38,39,0);
lista [39]=new Nodo(39,40,0);
lista [40]=new Nodo(40,41,0);
lista [41]=new Nodo(41,42,0);
lista [42]=new Nodo(42,43,0);
lista [43]=new Nodo(43,44,84);
lista [44]=new Nodo(44,45,0);
lista [45]=new Nodo(45,46,0);
lista [46]=new Nodo(46,47,0);
lista [47]=new Nodo(47,48,0);
lista [48]=new Nodo(48,49,0);
lista [49]=new Nodo(49,50,0);
lista [50]=new Nodo(50,51,0);
lista [51]=new Nodo(51,52,0);
lista [52]=new Nodo(52,53,76);
lista [53]=new Nodo(53,54,0);
lista [54]=new Nodo(54,55,0);
lista [55]=new Nodo(55,56,0);
lista [56]=new Nodo(56,57,0);
lista [57]=new Nodo(57,58,0);
lista [58]=new Nodo(58,59,0);
lista [59]=new Nodo(59,60,0);
lista [60]=new Nodo(60,61,0);
lista [61]=new Nodo(61,62,0);
lista [62]=new Nodo(62,63,14);
lista [63]=new Nodo(63,64,0);
lista [64]=new Nodo(64,65,0);
lista [65]=new Nodo(65,66,0);
lista [66]=new Nodo(66,67,0);
lista [67]=new Nodo(67,68,0);
lista [68]=new Nodo(68,69,0);
lista [69]=new Nodo(69,70,0);
lista [70]=new Nodo(70,71,92);
lista [71]=new Nodo(71,72,0);
lista [72]=new Nodo(72,73,0);
lista [73]=new Nodo(73,74,0);
lista [74]=new Nodo(74,75,100);
lista [75]=new Nodo(75,76,0);
lista [76]=new Nodo(76,77,0);
lista [77]=new Nodo(77,78,0);
lista [78]=new Nodo(78,79,49);
lista [79]=new Nodo(79,80,0);
lista [80]=new Nodo(80,81,0);
lista [81]=new Nodo(81,82,0);
lista [82]=new Nodo(82,83,0);
lista [83]=new Nodo(83,84,8);
lista [84]=new Nodo(84,85,0);
lista [85]=new Nodo(85,86,0);
lista [86]=new Nodo(86,87,0);
lista [87]=new Nodo(87,88,0);
lista [88]=new Nodo(88,89,0);
lista [89]=new Nodo(89,90,0);
lista [90]=new Nodo(90,91,0);
lista [91]=new Nodo(91,92,0);
lista [92]=new Nodo(92,93,0);
lista [93]=new Nodo(93,94,40);
lista [94]=new Nodo(94,95,0);
lista [95]=new Nodo(95,96,0);
lista [96]=new Nodo(96,97,69);
lista [97]=new Nodo(97,98,0);
lista [98]=new Nodo(98,99,0);
lista [99]=new Nodo(99,100,0);
}    
}