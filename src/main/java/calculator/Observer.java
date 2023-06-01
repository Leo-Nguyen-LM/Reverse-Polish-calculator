package calculator;

/**
 * observer to update.
 * @author Leo Nguyen.
 *
 */
@FunctionalInterface
public interface Observer {
  /**
  * notifys observer to update.
  */
  public void notifyObservers();
}
