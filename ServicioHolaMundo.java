import java.rmi.Remote;//Paquetes para conexion
import java.rmi.RemoteException;//Paquetes pata conexion

public interface ServicioHolaMundo extends Remote { //Se declara la inerfaz "Nombre" al ponerle remote este servicio se vuelve descubribe o identificable alfo como hacerlo "publico"
    String saludar() throws RemoteException; //Definicion, la implenetacion es solo codigo

    String sumar() throws RemoteException; 
    String restar() throws RemoteException; 
    String multi() throws RemoteException; 
    String div() throws RemoteException; 

}
