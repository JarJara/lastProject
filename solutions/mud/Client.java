package solutions.mud;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {};
    //TODO Attributes (Username)

    public static void main(String[] args) {
        try {
            //Getting the registry
            //TODO change null to correct host
            Registry registry = LocateRegistry.getRegistry(null);

            //Looking up the registry for the remote object
            PlayerImpl stub = (PlayerImpl) registry.lookup("player");

            //TODO Set user_name
            //TODO Display initial Location
            //TODO Request to move
            //TODO Display new location info
            stub.move("");
            stub.pick_up("");
            stub.remove_thing("");

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }


    }
}
