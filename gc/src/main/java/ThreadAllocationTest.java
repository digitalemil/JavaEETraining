import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

class MyTask2 extends TimerTask {

	HashMap<String,byte[]> data= new HashMap<String,byte[]>();
	HashMap<String,Thread> threads= new HashMap<String,Thread>();
	
	static final int MB = 1024 * 1024;
	@Override
	public void run() {
		 byte[] a1 = new byte[2 * MB];
		 a1[1] = 1;
//		 data.put(a1.toString(), a1);
try {
		 Thread thread= new ThreadAllocationTest();
		 thread.start();
		 threads.put(thread.toString(), thread);
		 Runtime runtime = Runtime.getRuntime();
         System.out.print("total java heap:" + (runtime.totalMemory() / 1024)+ " KB\n");
         long free = runtime.freeMemory() / 1024;
		 System.out.print("free java heap:" + free+ " KB\n");
		 System.out.println("Total number of threads: "+Thread.getAllStackTraces().keySet().size());
}catch(Error er) {
	System.out.println(er+"\n");
	System.err.println(er+"\n");
	System.exit(1);
}
	}
}

public class ThreadAllocationTest extends Thread {
	static final int MB = 1024 * 1024;
	static public void main(String[] arg) throws ClassNotFoundException{
		Class.forName("java.lang.Shutdown");
	
		Timer timer = new Timer();
		    timer.schedule(new MyTask2(), 20, 20);
		}

		public void run() {
			int i1=1,i2=2,i3=3,i4=4,i5=5,i6=6,i7=7,i8=8,i9=9,i10=10,i11=11,i12=12,i13=13,i14=14,i15=15,i16=16,i17=17,i18=18,i19=19;
			while(true) {
				
				String t= ("Thread: "+(i1+i2+i3+i4+i5+i6+i7+i8+i9+i10+i11+i12+i13+i14+i15+i16+i17+i18+i19));
				i1++;
				try {
					Thread.currentThread().sleep(1);
					run();
				} catch (Exception e) {
					System.out.println(e);
					System.err.println(e);
					System.exit(1);
				}
				catch (Error er) {
					System.out.println(er+"\n");
					System.err.println(er+"\n");
					System.exit(1);
					
				}
			}
		}
}