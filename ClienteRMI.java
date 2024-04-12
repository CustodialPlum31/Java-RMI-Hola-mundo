import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            ServicioHolaMundo servicio = (ServicioHolaMundo) Naming.lookup("rmi://localhost/ServicioHolaMundo");



            String saludo = servicio.saludar();
            String suma = servicio.sumar();
            String resta = servicio.restar();
            String multiplicacion = servicio.multi();
            String division = servicio.div();


            System.out.println(saludo);
            System.out.println(suma);
            System.out.println(resta);
            System.out.println(multiplicacion);
            System.out.println(division);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
