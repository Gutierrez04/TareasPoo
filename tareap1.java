 public class  tareap1{

   public static void main(String[] args){
        String equipo = "Lakers";
 //.length

        System.out.println("Mi equipo favorito de la NBA es " + equipo);

        System.out.println("Mi equipo favorito tiene " + equipo.length() + " letras");

     //.isEmpty

	 String s1 = "LebronJames";
       		 boolean b1 = s1.isEmpty(); 
	String s2 = "";
       		 boolean b2 = s2.isEmpty();
        System.out.println("¿La primera cadena es vacia? " + s1.isEmpty());
        System.out.println("¿La segunda cadena es vacía? " + s2.isEmpty());

       //.charAt

	 for (int i=0; i<equipo.length(); i++){
           char c = equipo.charAt (i); 
        System.out.println(c);
           }

        if (equipo.equals(s1)); //.equals
        System.out.println("¿Las cadenas son iguales? " + equipo.equals(s1));
        String lakers = "Lebron James es el maximo anotador de la nba";

        int p1 = lakers.indexOf('o'); //.indexOf
        int p2 = lakers.lastIndexOf('o');  //.lastIndexOf
        System.out.println("La primera \"e\" de la frase está en: " + lakers.indexOf('e'));
        System.out.println("La ultima \"e\" de la frase está en: " + lakers.lastIndexOf('e'));

        System.out.println("convertimos a mayúsculas así: " + lakers.toUpperCase()); //.toUpperCase
        System.out.println("CONVERTIMOS A MINUSCULAS ASÍ: " + lakers.toLowerCase());  //.toUpperCase

        String i = "Lebron ha jugado 6 nba all stars, pero solo ha ganado 5";
        System.out.println("Se subdivide así: " + i.substring(0,15));  //.substring
        System.out.println("Y así: " + i.substring(16,25));
        System.out.println("Sigueindo así: " + i.substring(26,35));
        System.out.println("Al terminar así; " + i.substring(36,55));

        // Integer
                //enteros
        String numeros = "230613";
        int enteros = Integer.parseInt(numeros);
        String t1 = Integer.toString(enteros);
        System.out.println("Número enteros representados así " + Integer.parseInt(numeros) + " y así " + Integer.toString(enteros));
                //Flotantes
        String numeros2 = "2306.13";
        double decimal = Double.parseDouble(numeros2);
        String t2 = Double.toString(decimal);
        System.out.println("Numero decimal representado así: " + Double.parseDouble(numeros2) + " y así: " + Double.toString(decimal));

        //concatecar (unir)
        String u = lakers+i;
        System.out.println("Las cadenas se unen así " + lakers+i);

        //Invariza
        String uno = "Cavaliers";
        uno = "Heat";
        System.out.println(uno);
        System.out.println(uno+= ", Heat");

                //append
        StringBuilder sb = new StringBuilder();
        sb.append(" Kyrie ");
        sb.append(" Davis ");
        System.out.println(sb);

                //setCharAt
        StringBuilder sbb = new StringBuilder("Hola");
        sbb.setCharAt(3,'i');
        System.out.println(sbb);


        }
}
