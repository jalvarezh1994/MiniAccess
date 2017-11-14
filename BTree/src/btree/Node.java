/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btree;

/**
 *
 * @author jorge
 */
public class Node {

    int ID;
    String Position;

    public Node() {
    }

    public Node(int ID) {
        this.ID = ID;
    }

    public Node(int ID, String Position) {
        this.ID = ID;
        this.Position = Position;
    }

    @Override
    public String toString() {
        return "|ID=" + ID + " P=" + Position + "|";
    }

}