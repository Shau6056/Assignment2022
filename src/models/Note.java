package models;

import utils.Utilities;

import java.util.ArrayList;

//This is the class for Note
public class Note {

    private String noteTitle = "No Title";
    private int notePriority = 1;
    private String noteCategory = "";
    private boolean isNoteArchived = false;
    private ArrayList<Item> items = new ArrayList();

    public Note(String noteTitleIn, int notePriorityIn, String noteCategoryIn) {
        setNoteTitle(noteTitleIn);

        setNotePriority(notePriorityIn);

        setNoteCategory(noteCategoryIn);
    }

    public String getNoteTitle() {
        return noteTitle;

    }

    public void setNoteTitle(String noteTitleIn) {
        if (utils.Utilities.validateStringLength(noteTitleIn, 20)) {
            noteTitle = noteTitleIn;
        }
    }

    public int getNotePriority() {
        return notePriority;
    }

    public void setNotePriority(int notePriorityIn) {
        boolean notePriorityCheck = utils.Utilities.validRange(notePriorityIn, 1, 5);

        if (notePriorityCheck) {
            notePriority = notePriorityIn;
        }

    }

    public String getNoteCategory() {
        return noteCategory;
    }

    public void setNoteCategory(String noteCategoryIn) {
        String[] noteCategoryCheck = {"Home", "Work", "Hobby", "Holiday", "College"};

        for (int i = 0; i < noteCategoryCheck.length; i++) {
            if (noteCategoryCheck[i].equals(noteCategoryIn) == true) {
                noteCategory = noteCategoryIn;
            }
        }
    }

    public boolean isNoteArchived() {
        return isNoteArchived;
    }

    public void setNoteArchived(boolean isNoteArchivedIn) {
        isNoteArchived = isNoteArchivedIn;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> itemsIn) {
        ArrayList<Item> items = itemsIn;
    }

    public int numberOfItems() {
        return items.size();
    }

    public boolean checkNoteCompletionStatus()
    {
        for(int i = 0; i < items.size(); i++) {
            if (items.get(i).isItemCompleted()) {
                return true;
            }
        }
        return false;
    }


    public boolean addItem(Item itemIn) {
        return items.add(itemIn);
    }

    public String listItems() {
        if (items.size() < 0) {
            return "Put info in here";
        } else {
            return "No items added";
        }
    }

    public boolean isValidIndex(int numIn) {
        if (numIn >= items.size() || numIn < 0) {

            return true;
        } else {
            return false;
        }
    }

    public Item findItem(int indexIn) {
        if (isValidIndex(indexIn)) {
            return items.get(indexIn);
        } else {
            return null;
        }
    }

    public Item deleteItem(int indexIn) {

        if (isValidIndex(indexIn)) {
            return items.remove(indexIn);
        } else {
            return null;
        }
    }

    public boolean updateItem(int numIn, String infoIn, boolean yesNoIn) {
        Item searchItem = findItem(numIn);

        if (searchItem != null) {
            searchItem.setItemCompleted(yesNoIn);
            searchItem.setItemDescription(infoIn);
            return true;

        } else {
            return false;
        }
    }
    public boolean equals(Note noteIn) {
        if (this == noteIn) return true;

        if (noteIn == null || getClass() != noteIn.getClass()) return false;
        Note note = (Note) noteIn;
        return notePriority == note.notePriority
                && isNoteArchived
                == note.isNoteArchived
                && items.equals(noteTitle)
                && items.equals(noteCategory)
                && items.equals(items);
    }

    public String toString()
    {
        return noteTitle + "," + " Priority = " + notePriority +"," + "Category=" + noteCategory
                +"," + " Archived"+ Utilities.booleanToYN(isNoteArchived) +
                items.toString();
    }

}







