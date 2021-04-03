package solutions.mud;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PlayerInterface extends Remote {
    String move(String dir) throws RemoteException;

    String pick_up(String thing) throws RemoteException;

    String remove_thing(String thing) throws RemoteException;
}
