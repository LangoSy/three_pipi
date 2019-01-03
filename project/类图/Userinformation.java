package 5-关键设计.类图;


/**
 * @author del
 * @version 1.0
 * @created 03-1月-2019 21:18:05
 */
public class Userinformation {

	private int 房间号码;
	private int 身份证号码;
	private char 姓名;
	public menu m_menu;
	public room m_room;
	public style m_style;

	public Userinformation(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param a
	 */
	public boolean 就餐(char a){
		return false;
	}

	/**
	 * 
	 * @param a
	 */
	public boolean 入住(char a){
		return false;
	}

}