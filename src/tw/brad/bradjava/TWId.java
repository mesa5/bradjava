package tw.brad.bradjava;

public class TWId {
	private String id = "A223456789";
	
	// 建構子
	TWId(String id){
		this.id = id;
	}
	
	// 傳回身分證字串
	String getId(){
		return id;
	}
	// 傳回性別
	boolean getGender(){
		return id.charAt(1) == '1';
	}
	// 傳回地區
	String getArea(){
		return "台中市";
	}
	// 是否正確 => 通過驗證
	static boolean isRight(String testId){
		boolean ret = false;
		if (testId.matches("^[A-Z][12][0-9]{6}$")){
			// TODO 革命尚未成功
			ret = true;
		}else{
			ret = false;
		}
		return ret;
	}
	
}
