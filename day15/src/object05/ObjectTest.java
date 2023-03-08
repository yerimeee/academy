package object05;

public class ObjectTest {

	public static void main(String[] args) {
		ObjectDao dao = new ObjectDao();
		dao.fileSave();
		dao.fileRead();
	}
}
