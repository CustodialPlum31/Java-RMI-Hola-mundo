import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorHolaMundo extends UnicastRemoteObject implements ServicioHolaMundo {
    public ServidorHolaMundo() throws RemoteException {
        super();
    }

    float x = 8.53f;
    float y = 20.23f;
    float z ;
    String res;
    
    

    public String saludar() throws RemoteException {
        return "Hola Mundo desde el servidor RMI!";
    }

    public String sumar() throws RemoteException {
        z = x+y;
        res = String.valueOf(z);
        return res;
    
    }

    public String restar() throws RemoteException {
        z = x-y;
        res = String.valueOf(z);
        return res;
    }

    public String multi() throws RemoteException {
        z = x*y;
        res = String.valueOf(z);
        return res;
    }

    public String div() throws RemoteException {
        z = x/y;
        res = String.valueOf(z);
        return res;
    }
}
