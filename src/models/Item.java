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

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription)
    {
        if(Utilities.validateStringLength(itemDescription, 50))
        {
        this.itemDescription = itemDescription;
        }
    }
    public boolean isItemCompleted()
    {
        if(isItemCompleted == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setItemCompleted(boolean itemCompleted)
    {
        isItemCompleted = itemCompleted;
    }

    public boolean equals(Item itemIn)
    {
        return(this == itemIn);
    }


    public String toString()
    {
        String comp ="";

        if(isItemCompleted)
        {
            comp ="[Complete]";
        }
        else
        {
            comp = "[TODO]";
        }
        return getItemDescription() + comp;


    }

}

