package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function.equals("앱")){
			app();
			playMusic();
			call();
			return;
		}
//		super.execute(function);
		
		
	}
	
	public void app(){
		System.out.println("앱실행");
	}
	public void playMusic(){
		System.out.println("다운로드해서 음악재생");
	}
	public void call(){
		System.out.println("통화기능시작");
	}
}
