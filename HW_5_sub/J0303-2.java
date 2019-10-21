import java.io.*;
class J0303 {
public static void main(String args[]) throws java.io.IOException {


BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

String buf; int i =0;
String c[] = new String[5];

do {
buf = stdin.readLine();

c[i++] = buf;
} while (!buf.equals("0"));

int max=0;int  min=999;
int tot=0;int avg=0;
	for(int j=0;j<4;j++){
	System.out.println(c[j]);

	
	if(max<Integer.parseInt(c[j])) max=Integer.parseInt(c[j]);
	if(min>Integer.parseInt(c[j])) min=Integer.parseInt(c[j]);
	tot += (Integer.parseInt(c[j]));
	avg = tot/(c.length-1);		
			}
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);
		System.out.println("TOT="+tot);
		System.out.println("AVG="+avg);
	}
}


