package vm;

public class NotesSlot extends MoneySlots {

  private int noteValue;

  public NotesSlot(int ID, String type) {
    super(ID, type);
  }

  public int getNoteValue() {
    return noteValue;
  }

  public void setNoteValue(int noteValue) {
    this.noteValue = noteValue;
  }

}