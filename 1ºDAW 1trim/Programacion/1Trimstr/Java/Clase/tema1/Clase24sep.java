

public class Clase24sep {
    public static void main(String[] args) {

    /*SINTASIX
    variable expresion
    el operador = asigna valor. Otros que asignan valores pueden ser:
    %=, &=,|=. <<=, >>=, >>>=
    */


    // Definimos a,b y c como un número entero para luego darle un valor y poder a partir ed ahí hacer diferentes operaciones
   int a,b,c;
   a=b=c=45;

   System.out.println(a);

   // ++ = b+=1/b=b+1   Dependiendo de donde posiciones el ++ hace la suma antes o después, por eso el c la 2ª ya da 46
   System.out.println(++b);
   System.out.println(c++);
   System.out.println(b);
   System.out.println(c);

   int d=1, e;
   e= d++;
   e=++a;
   System.out.println(e); //este print no nos exp`resa nadaya que lo que está definido es d pero influye luego para su suma
   System.out.println(d);

   //OPERADORES
   /* Los operadores lógicos/booleanos  operan con la idea de cierto o true y falso o false 
    Mayor: !,  >>=, <<=, ==, !=, &&
    Menor: ||

    Negación: !
    Conjunción (Y): &&
    Disyunción (O): || 
   */

   int g=6;
   g =g <<1;
   System.out.println("a="+g);
   g =g <<1;
   System.out.println("a="+g);
   g =g <<1;
   System.out.println("a="+g);
   g =g <<1;
   System.out.println("a="+g);
   g =g <<1;

    }
}