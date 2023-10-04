package Thread;

public class Table2 extends Thread {
	Table t;
	public Table2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
	t.printTable(7);
	}
}
