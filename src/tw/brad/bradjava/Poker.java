package tw.brad.bradjava;

public class Poker {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52];	// 0,0,...0
		for (int i=0; i<poker.length; i++){
			int rand = (int)(Math.random()*poker.length);
			
			// 檢查機制
			boolean isOK = true;
			for (int j=0;j<i;j++){
				if (poker[j]==rand){
					isOK = false;
					break;
				}
			}
			if (!isOK){
				i--;
				continue;
			}
			
			poker[i] = rand;
			System.out.println(poker[i]);
		}
		
		
		// 發牌 => 四個玩家
		
		// 理牌 => 攤牌
	}

}
