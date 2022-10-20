package models;

import utils.Utilities;

public class Item {

    private String itemDescription = "No Description";
    private boolean isItemCompleted = false;

    public Item(String itemDescriptionIn)
    {
        itemDescription = utils.Utilities.truncateString(itemDescriptionIn, 50);

    }

    public Item(String itemDescriptionIn, boolean isItemCompletedIn)
    {
        itemDescription = utils.Utilities.truncateString(itemDescriptionIn, 50);

        isItemCompleted = isItemCompletedIn;

    }

    public String getItemDescrption() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescriptionption) {
        this.itemDescription = itemDescription;
    }

    public boolean isItemCompleted() {
        return isItemCompleted;
    }

    public void setItemCompleted(boolean itemCompleted) {
        isItemCompleted = itemCompleted;
    }

    //public boolean equals(Item itemIn)
    //{
        //return 0;
//    }

    public String toString()
    {
        String comp = "";

        if(isItemCompleted == true)
        {
            comp = "[Completed]";
        }
        else
        {
            comp = "[TODO]";
        }


        return "Item description: " + itemDescription
                + ", Is item completed: " + comp;

    }

}

