package Thread;

public class TableTest {

	public static void main(String[] args) {
		Table table  = new Table();
		
		Table1 t1 = new Table1(table);
		Table2 t2 = new Table2(table);
		
		t1.start();
		t2.start();
	}

}
