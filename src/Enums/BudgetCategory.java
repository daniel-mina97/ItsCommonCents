package Enums;

import java.util.ArrayList;

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
    
    public static Category convertIntToCategory(int number) {
        switch(number) {
            case 1:
                return Category.HOUSING;
            case 2:
                return Category.UTILITIES;
            case 3:
                return Category.GROCERIES;
            case 4:
                return Category.ENTERTAINMENT;
            case 5:
                return Category.TRANSPORTATION;
            case 6:
                return Category.MISC;
            default:
                return Category.NONE;
        }
    }
    
    public static int convertCategoryToInt(Category category) {
        switch(category) {
            case HOUSING:
                return 1;
            case UTILITIES:
                return 2;
            case GROCERIES:
                return 3;
            case ENTERTAINMENT:
                return 4;
            case TRANSPORTATION:
                return 5;
            case MISC:
                return 6;
            default:
                return 0; 
        }
    }
    public static String getBudgetCategoryString(int categoryValue) {
        Category category = convertIntToCategory(categoryValue);
        switch(category) {
            case HOUSING:
                return "Housing";
            case UTILITIES:
                return "Utilities";
            case GROCERIES:
                return "Groceries";
            case ENTERTAINMENT:
                return "Entertainment";
            case TRANSPORTATION:
                return "Transportation";
            case MISC:
                return "Miscellaneous";
            default:
                return "No Category Chosen";
        }
    }
    
    public static String getBudgetCategoryString(Category category) {
        switch(category) {
            case NONE:
                return "";
            case HOUSING:
                return "Housing";
            case UTILITIES:
                return "Utilities";
            case GROCERIES:
                return "Groceries";
            case ENTERTAINMENT:
                return "Entertainment";
            case TRANSPORTATION:
                return "Transportation";
            case MISC:
                return "Miscellaneous";
            default:
                return "Invalid Category";
        }
    }
    
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
