package prob3;

public class Marine extends Unit{
	
	// 현재 위치
	private int x;
	private int y; 
	
	@Override
	void move(int x, int y) {
		/* 지정된 위치로 이동 */ 
		super.move(x, y);
	}
	@Override
	void stop() {
		/* 현재 위치에 정지 */ 
		super.stop();
	}
	
	void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}
}
