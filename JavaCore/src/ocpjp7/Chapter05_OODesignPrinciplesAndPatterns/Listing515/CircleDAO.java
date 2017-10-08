
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing515;

public interface CircleDAO {
	public void insertCircle(CircleTransfer circle);
	public CircleTransfer findCircle(int id);
	public void deleteCircle(int id);
}