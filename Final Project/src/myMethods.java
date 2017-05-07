public class myMethods {

	
	
	public String join(String s1, String s2, String s3,
			String s4, String s5){
		
		String newStr = s1 + s2 + s3 + s4 + s5;
		
		return newStr;
		
	}
	
	public String orderAscending(String s1, String s2){
		if(s1.compareTo(s2) > 0){
			return s1 + "," + s2;
			
		} else if(s1.compareTo(s2) < 0){
			
			return s2 + "," + s1;
			
		} else{
			
			return s1 + "," + s2;
		}
		
		
	}
	
	
	public String orderAscending(String s1, String s2, String s3){
		if(s1.compareTo(s2) > 0){
			if(s2.compareTo(s3) > 0){
				return s1 + "," + s2 + "," + s3;
			}else{
				return s1 + "," + s2 + "," + s3;
			}
		}if(s1.compareTo(s2) < 0){
			if(s2.compareTo(s3) > 0){
				return s1 + "," + s2 + "," + s3;
			}else{
				return s1 + "," + s2 + "," + s3;
			}			
		}
		
		return "fornow";
	}
	
	
	
	
	
	
	
	
	
	
	
}
