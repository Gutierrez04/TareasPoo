import java.util.Scanner;

public class cafeteramaquinaaaaaaaaaaaaa {
    Scanner teclado = new Scanner(System.in);
    int opcion;
    private double crema = 1500;
    private double agua = 5000 ;
    private double cafe = 1000 ;
    private int menucf;
    private int vasos = 50 ;


    public cafeteramaquinaaaaaaaaaaaaa() {
    }

    public cafeteramaquinaaaaaaaaaaaaa(double crema, double agua, double cafe) {
        this.crema = crema;
        this.agua = agua;
        this.cafe = cafe;
    }

    public double getCrema() {
        return crema;
    }

    public void setCrema(double crema) {
        this.crema = crema;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getCafe() {
        return cafe;
    }

    public void setCafe(double cafe) {
        this.cafe = cafe;
    }

    @Override
    public String toString() {
        return "cafeteramaquinaaaaaaaaaaaaa{" +
                "crema=" + crema +
                ", agua=" + agua +
                ", cafe=" + cafe +
                '}';
    }
    public void americano (){
agua = agua - 180 ;
cafe = cafe - 15 ;
vasos = vasos - 1 ;
        System.out.println("Preparando cafe AMERICANO..............");
        System.out.println("tome su cafe, CUIDADO ESTA MUY CALIENTE ");
        System.out.println(" Gracias por su compra, que lo disfrute  ");
        System.out.println("Cantidad de agua restante: " + agua + "ml");
        System.out.println("Cantidad de cafe restante: " + cafe + "gr");
        System.out.println("Cantidad de vasos restantes: " + vasos);
    }
    public void expreso (){
agua = agua - 120 ;
cafe = cafe - 20 ;
vasos = vasos - 1 ;
        System.out.println("Preparando cafe EXPRESSO..............");
        System.out.println("tome su cafe, CUIDADO ESTA MUY CALIENTE ");
        System.out.println(" Gracias por su compra, que lo disfrute  ");
        System.out.println("Cantidad de agua restante: " + agua + "ml");
        System.out.println("Cantidad de cafe restante: " + cafe + "gr");
        System.out.println("Cantidad de vasos restantes: " + vasos);

    }
    public void capuccino (){
        agua = agua - 100 ;
        cafe = cafe - 14 ;
        crema = crema - 70 ;
        vasos = vasos - 1 ;

        System.out.println("Preparando cafe CAPUCCINO..............");
        System.out.println("tome su cafe, CUIDADO ESTA MUY CALIENTE ");
        System.out.println(" Gracias por su compra, que lo disfrute  ");
        System.out.println("Cantidad de agua restante: " + agua + "ml");
        System.out.println("Cantidad de cafe restante: " + cafe + "gr");
        System.out.println("Cantidad de vasos restantes: " + vasos);


    }
    public boolean servir () {
        if (agua <= 0) {
            System.out.println("Nos quedamos sin recursos, avisa al personal para rellenar los tanques y puedas disfrutar tu cafe, GRACIAS");

        }
        if (cafe <= 0) {
            System.out.println("Nos quedamos sin recursos, avisa al personal para rellenar los tanques y puedas disfrutar tu cafe, GRACIAS");

        }
        if (crema == 0) {
            System.out.println("Nos quedamos sin recursos, avisa al personal para rellenar los tanques y puedas disfrutar tu cafe, GRACIAS");
        }
        if (vasos == 0) {
            System.out.println("Nos quedamos sin recursos, avisa al personal para rellenar los tanques y puedas disfrutar tu cafe, GRACIAS");
        }
        return false;
    }
    public int getVasos () {
        return vasos;
    }

    public void menu (){

        do {

        System.out.println("Seleccione el tipo de cafe que quiere : ");
        System.out.println(" 1. Capuccino ");
        System.out.println(" 2. Americano: ");
        System.out.println(" 3. Expresso: ");
        System.out.println("Presione 4 para salir, Gracias por su visita vuelva pronto ");
        menucf = teclado.nextInt() ;
        switch ((int) menucf) {


            case 1: capuccino();

            break;
            case 2: americano();

                break;
            case 3: expreso();

                break;
            case 4 :

                break;


            default:
                System.out.println("Opcion invalida");
                break;


        }

    }  while (menucf != 4);


} }
