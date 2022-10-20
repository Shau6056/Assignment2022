package models;

import java.util.ArrayList;


public class Note {

    private String noteTitle = "No Title";
    private int notePriorty = 1;
    private String noteCategory = "";
    private boolean isNoteArchived = false;
    private ArrayList<Item> items = new ArrayList();

    public Note(String noteTitleIn, int notePriortyIn, String noteCategoryIn)
    {
        setNoteTitle(noteTitleIn);

        setNotePriorty(notePriortyIn);

        setNoteCategory(noteCategoryIn);
    }

    public String getNoteTitle()
    {
        return noteTitle;

    }

    public void setNoteTitle(String noteTitleIn)
    {
        if(utils.Utilities.validateStringLength(noteTitleIn, 20))
        {
            noteTitle = noteTitleIn;
        }
    }

    public int getNotePriorty()
    {
        return notePriorty;
    }

    public void setNotePriorty(int notePriortyIn)
    {
        boolean notePriorityCheck = utils.Utilities.validRange(notePriortyIn, 1, 5);

        if(notePriorityCheck)
        {
            notePriorty = notePriortyIn;
        }

    }

    public String getNoteCategory()
    {
        return noteCategory;
    }

    public void setNoteCategory(String noteCategoryIn)
    {
        String [] noteCategoryCheck = {"Home", "Work", "Hobby", "Holiday","College"};

        for(int i = 0; i < noteCategoryCheck.length; i++)
        {
            if(noteCategoryCheck[i].equals(noteCategoryIn) == true)
            {
                noteCategory = noteCategoryIn;
            }
        }
    }

    public boolean isNoteArchived()
    {
        return isNoteArchived;
    }

    public void setNoteArchived(boolean isNoteArchivedIn)
    {
        isNoteArchived = isNoteArchivedIn;
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<Item> itemsIn)
    {
        ArrayList<Item> items = itemsIn;
    }

    public int numberOfItems()
    {
        return items.size();
    }

   // public boolean checkNoteCompletionStatus()
    //{

   // }

    public boolean addItem(Item itemIn)
    {
        return items.add(itemIn);
    }





}
