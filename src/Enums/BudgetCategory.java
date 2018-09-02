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
        NONE,
        HOUSING, 
        UTILITIES, 
        GROCERIES,
        ENTERTAINMENT,
        TRANSPORTATION,
        MISC;
    }
    
    
    private final int numVal;

    Category(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    public static String[] getComboBoxLabels() {
        Category[] categories = Category.values();
        ArrayList<String> labelsArrayList = new ArrayList<>();
        for(Category category : categories) {
            labelsArrayList.add(getBudgetCategoryString(category));
        }
        String[] labelsArray = labelsArrayList.toArray(new String[labelsArrayList.size()]);
        return labelsArray;
    }
   }
}
