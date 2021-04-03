package solutions.mud;

import java.rmi.RemoteException;
import java.util.List;

public class PlayerImpl implements PlayerInterface{
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public List<String> get_things() {
        return _things;
    }

    public void set_things(List<String> _things) {
        this._things = _things;
    }

    public void set_position(Vertex _position) {
        this._position = _position;
    }

    public Vertex get_position() {
        return _position;
    }

    //Attributes
    private String _name;
    private List<String> _things;
    private Vertex _position;

    //Methods

    @Override
    public String move(String dir) throws RemoteException {
        //Check if there is an edge in dir
        //If there is,
        //  setPosition to whatever that edge leads to
        //  return action was successful (String)
        //Else,
        //  don't move display
        //  return explanation message

        return "Move method successful";

    }

    @Override
    public String pick_up(String thing) throws RemoteException {
        //Add item to _things (check is not empty)

        //return action was successful (String)
        return "Pick up method successful";
    }

    @Override
    public String remove_thing(String thing) throws RemoteException {
        //If thing exists
        //  remove item from _things (only once)
        //  return action was successful (String)
        //Else,
        //  don't change _things
        //  return explanation message
        return "Remove thing method successful";

    }

}
