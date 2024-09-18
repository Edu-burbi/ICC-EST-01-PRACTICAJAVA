public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola mundo";
        int edad = 10; 
        int i;

        System.out.println(cadena);
        System.out.println("Tamaño de la cadena" );
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        for ( i = 0 ; i < cadena.length() ; i++ ) {
            if(i == cadena.length()){
            System.out.print(cadena.charAt(i));
        }else{
            System.out.print(cadena.charAt(i) + "-");
            }
    
        }
        System.out.println();
        //contar palabras
        int palabras =cadena.split(" ").length;
        System.out.println(palabras);
        /// Contar cuantas a hay en la cadena

    }

}
