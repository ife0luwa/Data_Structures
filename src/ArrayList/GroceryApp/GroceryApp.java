package ArrayList.GroceryApp;

import java.util.ArrayList;

public class workingWithArray_List {
    //create methods to addGroceryList, printGroceryList, modifyGroceryList
    //removeGroceryList, findItem
    //create an arrayList variable
    //add items to the variable with .add method
    // get elements from variable with .get method
    // modify variable with .set method
    // remove element from variable with .remove method
    // example with getIndexOf method

    // create a field
    private ArrayList <String> groceryList = new ArrayList<>();

    //create method to addGroceryList
    public void addGroceryList (String item) {
        groceryList.add(item);
    }
    //create method to printGroceryList
    public void printGroceryList () {
        System.out.println("You have " + groceryList.size() + " items on your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println( i+1 + "." + groceryList.get(i)); //get() gets element of an array by index
        }
    }

    //create method to modifyGroceryList
    public void modifyGroceryList (int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("item " + (position + 1) + " has been removed");
    }

    //create method to removeGroceryList
    public void removeGroceryList (int position) {
        groceryList.remove(position);
    }

    //create method to find item
    public String findItem (String searchItem) {
        int position = groceryList.indexOf(searchItem); //indexOf gets index of an element
        if (position >= 0) {
            return groceryList.get(position); //return string
        }//else return null
        return null;
    }

}
