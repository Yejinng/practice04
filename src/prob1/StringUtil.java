package prob1;

public class StringUtil {
    public static String concatenate( String[] str ){
        //문자열을 결합하여 리턴하는 메소드 구현
    	String string1 = "";
    	for(String string : str){
    		string1 += string;
    		
    	}
		return string1;
    }
}

