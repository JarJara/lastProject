package solutions.mud;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class PlayerServer extends PlayerImpl{
    public PlayerServer(){};

    public static void main(String[] args) {
        try {
            //Instantiating PlayerImpl
            PlayerImpl obj = new PlayerImpl();

            //Exporting the object of implementation class
            //(here we are exporting the remote object to the stub)
            //TODO change 0 to whatever port we use
            PlayerInterface stub = (PlayerInterface) UnicastRemoteObject.exportObject(obj, 10);

            //Binding the remote object (stub) in registry)
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("player", stub);
            System.err.println("Server ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
