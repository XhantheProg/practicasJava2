package practicasJava2;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;








   class Persona{
       String nombreCompleto;
       int ticket;
       public Persona(String nombreCompleto, int ticket){
           this.nombreCompleto=nombreCompleto;
           this.ticket=ticket;
       }
       public String getNombreCompleto(){
           return nombreCompleto;
       }
       public int getTicket(){
           return ticket;

       }
   }
   public class menucola {

       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           Queue<Persona> colaPersonas= new LinkedList<>();
           boolean continuar =true;
           while (continuar){
               System.out.println("Menu");
               System.out.println("1. Agregar Persona");
               System.out.println("2. Mostar cantidad de personas de la cola");
               System.out.println("3. Mostra primera persona en la cola");
               System.out.println("4. Libera cola");
               System.out.println("5. Salir");
               int opcion=sc.nextInt();
               sc.nextLine();
               switch (opcion){
                   case 1:
                       System.out.println("Ingrese el nombre completo de la persona");
                       String nombreCompleto=sc.nextLine();
                       System.out.println("Ingrese el ticket de la persona");
                       int ticket=sc.nextInt();
                       sc.nextLine();
                       colaPersonas.offer(new Persona(nombreCompleto, ticket));
                       System.out.println("Persona agregada a la cola.");
                       break;
                   case 2:
                       System.out.println("Cantidad de personas en la cola:" + colaPersonas.size());
                       break;
                   case 3:
                       if (!colaPersonas.isEmpty()){
                           Persona primeraPersona= colaPersonas.peek();
                           System.out.println("Primear persona en la cola:");
                           System.out.println("Nombre: " + primeraPersona.getNombreCompleto());
                           System.out.println("Ticket: " + primeraPersona.getTicket());
                       } else {
                           System.out.println("No hay personas en la cola.");
                       }
                       break;
                   case 4:
                       colaPersonas.poll();
                       System.out.println("La cola a sido liberada");
                       break;
                   case 5:
                       continuar=false;
                       System.out.println("Programa finalizado");
                       break;
                   default:
                       System.out.println("Opcion invalida.");


               }
               System.out.println();
           }
           sc.close();
       }
}
