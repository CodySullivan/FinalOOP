package models;

import java.util.ArrayList;

public class Room {

    public boolean hasItem = false;
    public ArrayList <Item> roomItem = new ArrayList<>();

    public void addWeapon(Item item){
        roomItem.add(item);
        hasItem = true;
    }
    public void removeWeapon(Item item){
        roomItem.remove(item);
        hasItem = false;
    }
    public void displayWeapon(){
        if(hasItem){
            System.out.println("Item: " + roomItem.get(0));
        }else {
            System.out.println("This room does not have an item");
        }
    }
}
