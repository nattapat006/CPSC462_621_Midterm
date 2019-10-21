import java.io.*;
class J0303 {
static int max=0;
static int  min=999;
static int tot=0;
static int avg=0;

public static void main(String args[]) throws java.io.IOException {
String c[] = new String[min];
sub1(c);
sub2(c);
sub3(c);
	
	}
		static void sub1(String c[])throws java.io.IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

				String buf;int i =0;
		
			do {
				buf = stdin.readLine();
				System.out.println("Last="+buf);
				c[i++] = buf;
				} while (!buf.equals("0"));
				System.out.println("Last="+buf);
	}

		static void sub2(String c[])throws java.io.IOException {
		for(int j=0;j<4;j++){
		//System.out.println(c[j]);
		if(max<Integer.parseInt(c[j])) max=Integer.parseInt(c[j]);
		if(min>Integer.parseInt(c[j])) min=Integer.parseInt(c[j]);
		tot += (Integer.parseInt(c[j]));
		avg = tot/(c.length-1);	
		}	
	}
		
		static void sub3(String c[])throws java.io.IOException {
		
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);
		System.out.println("TOT="+tot);
		System.out.println("AVG="+avg);
		
		}	

}
