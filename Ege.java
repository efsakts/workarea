
public class Ege implements IText {
private String text;
private char myChar;
	public Ege() {
		this.text=IText.text;
		this.myChar=IText.myChar;
	}
	
	public Ege(String text) throws Exception {
		this.text=text;
		this.myChar=IText.myChar;
	}
	public Ege(String text,char myChar) throws Exception{
		this.text=text;
		this.myChar=myChar;
	}
	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public char getMyChar() {
		return myChar;
	}

	public void setMyChar(char myChar) {
		this.myChar = myChar;
	}

	@Override
	public String minWord() {
		String str=null;
		String s[]=text.split(" ");
		int l = s[0].length();
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<l) {
				l = s[i].length();
				str = s[i];
			}
				}
		
		return str ;
	}

	@Override
	public void printWords() {
		// TODO Auto-generated method stub
		String w=null;
		String[] s2=text.split(" ");
		for (int i = 0; i < s2.length; i++) {
			
			if(Character.toLowerCase(s2[i].charAt(0))== Character.toLowerCase(myChar)) {
				System.out.println(s2[i]);
			}
		}
		
	}
public static void main(String[] args) {
	Ege e=new Ege();
	System.out.println(e.getText());
	System.out.println(e.minWord());
	e.printWords();
	}
}
