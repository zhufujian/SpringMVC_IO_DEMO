import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.studemo.demo.test.Test3;
import com.studemo.demo.test.Transient_Bean02;


public class Test2 {
	  int lineNumber;
	public static void main(String[] args) {
		/*Transient_Bean02 userInfo = new Transient_Bean02("张三", "123456");  
         System.out.println(userInfo);  
         try {  
             // 序列化，被设置为transient的属性没有被序列化  
             ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(  
                     "D:/Transient_Bean02.out"));  
             o.writeObject(userInfo);  
             o.close();  
         } catch (Exception e) {  
             // TODO: handle exception  
             e.printStackTrace();  
         }  
         try {  
             // 重新读取内容  
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(  
                     "D:/Transient_Bean02.out"));  
             Transient_Bean02 readUserInfo = (Transient_Bean02) in.readObject();  
             //读取后psw的内容为null  
             System.out.println(readUserInfo.toString());  
         } catch (Exception e) {  
             // TODO: handle exception  
             e.printStackTrace();  
         }  */
		//new Test2().test();
	/*	System.out.println(Integer.toBinaryString(127));
		//Float.MIN_VALUE;*/
		System.out.println(Integer.toBinaryString(127));
		
		System.out.println(Float.toHexString(Float.MIN_VALUE));
		//System.out.println(Float.intBitsToFloat(0x7f800001)+"|"+Integer.MAX_VALUE);
		//PipedInputStream
	/*	DataInputStream
	BufferedInputStream
		PushbackInputStream*/
		
	}
	private static int a=1,b=2;
	private void test(){
		System.out.println(lineNumber==0);
        add(a, b);
		System.out.println(a);
	}
	
	private void add(int a,int b){
		a=a+b;
		System.out.println("a+b:"+a);
	}

}
