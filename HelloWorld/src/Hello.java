import javax.swing.*;

public class Hello {
	public static void main(String args[]) {
		String hi="hello world";
		String helloworld="";
		for(int i=0;i<hi.length();i++) {
			if(hi.charAt(i)!=' ') {
				helloworld+=Integer.valueOf(hi.charAt(i));
			}
			else
				helloworld+=' ';
		}
		JOptionPane.showMessageDialog(null,helloworld+"!");
	}
}
