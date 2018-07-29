/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Ella
 */
public class BudgetCategory {
    
    public enum Category {
    
    HOUSING(0), 
    UTILITIES(1), 
    GROCERIES(2),
    ENTERTAINMENT(3),
    TRANSPORTATION(4),
    MISC(5);
    
    private final int numVal;

    Category(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
   }
}
