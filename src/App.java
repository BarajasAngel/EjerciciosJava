import java.util.Scanner;

public class App {    
    public static void main(String[] args) throws Exception {                

        Saludo();
        Triangulos();
        numeros();        
    }
    // 1
    public static void Saludo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor introduce una hora: ");    
        try{
            int hora = Integer.parseInt(teclado.nextLine());
            System.out.println(GetSaludo(hora));
        }
        catch (Exception ex){
            System.out.println("Por favor ingresa un entero válido");    
        }
    }
    public static String GetSaludo(int hora){
        if(hora >= 6 && hora <= 12){
            return "Buenos días";   
        }        
        if(hora >= 13 && hora <= 20 )
        {
            return "Buenas tardes";
        }
        if(hora >= 21 && hora <= 5 && hora <= 24){
            return "Buenas noches";
        }
        return "Lo siento el formato de hora ingresado es incorrecto";
    } 
    // 2
    public static void Triangulos(){        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");   
        int tamaño = 0;     
        try{
            tamaño = Integer.parseInt(teclado.nextLine());                      
            Triangulo1(tamaño);
            Triangulo2(tamaño);
        }catch(Exception ex){
            System.out.println("Por favor ingresa un entero válido");    
        }
    }    
    public static void Triangulo1(int tamaño){
        int tamaño2 = tamaño;
        for(int j = 0; j< tamaño; j++){
            for(int i = 0; i < tamaño2; i++){
                System.out.print("*");
            }
            System.out.print("\n\n");
            tamaño2--;
        }
    }
    public static void Triangulo2(int tamaño){
        int tamaño2 = tamaño;            
        boolean aux = false;
        for(int j = 0; j< tamaño; j++){
            for(int i = 0; i < tamaño2; i++){              
                if(aux){
                    if(i == 0 || i == tamaño2-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                }
            }
            aux = true;
            System.out.print("\n\n");
            tamaño2--;
        }
    }
    // 3
    public static void numeros()
    {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int aux = 0;
        int[] arreglo = new int[100];
        do{
            try{
                System.out.print("Escribe un número: ");
                num = Integer.parseInt(teclado.nextLine());
            }catch(Exception ex){
                System.out.println(ex.getMessage());                
            }
            arreglo[aux] = num;
            aux++;
        }while(num != -1);
        System.out.print(MayorNumero(arreglo));
        System.out.print(MenorNumero(arreglo));
        System.out.print(NumerosPositivos(arreglo));
        System.out.print(NumerosNegativos(arreglo));
        System.out.print(NumerosNegativosPrimos(arreglo));
    }
    public static int MayorNumero(int[] objects){
        int aux = 0;
        for (int i = 0; i < objects.length; i++) {           
           if(aux < objects[i]){
            aux = objects[i];
           }
        }
        return aux;
    }
    public static int MenorNumero(int[] objects){
        int aux = 0;
        for (int i = 0; i < objects.length; i++) {           
           if(aux > objects[i]){
            aux = objects[i];
           }
        }
        return aux;
    }
    public static int NumerosPositivos(int[] objects){
        int aux = 0;
        for (int i = 0; i < objects.length; i++) {           
            if(objects[i] > 0){
             aux += objects[i];
            }
         }
        return aux;
    }
    public static int NumerosNegativos(int[] objects){
        int aux = 0;
        for (int i = 0; i < objects.length; i++) {           
            if(objects[i] < 0){
             aux -= objects[i];
            }
         }
        return aux;
    }
    public static String NumerosNegativosPrimos(int[] objects){        
        return "No existen números negativos primos";
    }
    // 4
    //Proximente
}
