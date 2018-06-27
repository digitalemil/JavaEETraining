import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

class MyTask3 extends TimerTask {

	HashMap<String,byte[]> data= new HashMap<String,byte[]>();
	HashMap<String,Thread> threads= new HashMap<String,Thread>();
	
	static final int MB = 1024 * 1024;
	@Override
	public void run() {
		 byte[] a1 = new byte[2 * MB];
		 a1[1] = 1;
		// data.put(a1.toString(), a1);
		 Runtime runtime = Runtime.getRuntime();
         System.out.print("total java heap:" + (runtime.totalMemory() / 1024)+ " KB\n");
         long free = runtime.freeMemory() / 1024;
		 System.out.print("free java heap:" + free+ " KB\n");
		 System.out.println("Total number of threads: "+Thread.getAllStackTraces().keySet().size());
	}
}

public class Idle {
	static final int MB = 1024 * 1024;
	static public void main(String[] arg){
		    Timer timer = new Timer();
		    timer.schedule(new MyTask3(), 20, 20);
		}
}