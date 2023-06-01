package calculator;

/**
 * Main driver for whole project.
 * @author Leo Nguyen
 *
 */
public class MainDriver {
  
  /**
   * checks if enter commands before opening,
   * opening GUI view or terminal view if so.
   * @param args data before opening.
   */
  public static void main(String[] args) {
    ViewInterface view = new AsciiView();

    CalcModel model = new CalcModel();
    System.out.println("hello");
    
    // Decide which view to build.
    if (System.console() == null) {
      System.out.println("hello");
      view = MyView.getInstance();
    }
    new CalcController(view, model);
    // All ready so begin the interface.
    view.runMenu();
  }
}
