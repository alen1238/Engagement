public class App {
    public static void main(String[] args) throws Exception {
       int likes = 100;
       int comments = 45;
       int shares = 20;
       double rating = 7.5;
       String contenido1 = "Pelicula Accion: Jhon wick";

       int visualizaciones = 1000;
       
       double engagement = (likes + comments + shares + rating)* 100 / visualizaciones;
       System.out.println("Engagement publicacion 1" + engagement);

       int likes2 = 250;
       int comments2 = 76;
       int shares2 = 12;
       double rating2 = 7.9;
       String contenido2 = "Pelicula Ciencia Ficción: Volver Al futuro";

       int visualizaciones2 = 1000;
       
       double engagement2 = (likes2 + comments2 + shares2 + rating2)* 100 / visualizaciones2;
       System.out.println("Engagement publicacion 2" + engagement2);

       if(engagement > engagement2){
        System.out.println("Sugerencias:");
        System.out.println(contenido1);
        System.out.println(contenido2);
       }
       else{
         System.out.println("Sugerencias:");
         System.out.println( contenido2);
         System.out.println( contenido1);
       }

    }

    public static void parte1(){
         int likes = 120;
        System.out.println("tu publicación tiene " + likes + " likes");

        likes += 100;

        System.out.println("tu publicación tiene " + likes + " likes");

        // Ejercicio: Declara una variable llamada vistas igual a 500 y muestra el total
    
        double rating = 7.5;

        boolean viral = false;

        String title = "Este es mi primer Vlog";


    
    }
}
