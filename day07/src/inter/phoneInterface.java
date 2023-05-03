package inter;

public interface phoneInterface {
	public static final int TIMEOUT = 1000;
	public abstract void sendCall();
	public abstract void receivecCall();
	public default void printLogo() {
		System.out.println("===PHONE===");
	}
}
