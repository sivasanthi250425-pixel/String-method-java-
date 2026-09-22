public class Main {
	
	    public static void main(String[] args) {
	        String name="siva";
	        int length=name.length();
	        char letter=name.charAt(1);
	        int index=name.indexOf("s");
	        int last=name.lastIndexOf("i");
	        String emp=" ";
	        name=name.toLowerCase();
	        System.out.println(name);
	        name=name.toUpperCase();
	        System.out.println(name);
	        name=name.trim();
	        		 System.out.println(name);
;
	        name=name.replace("i","u");
	        System.out.println(name);
	        System.out.println(name);
	        System.out.println(letter);
	        System.out.println(length);
	        System.out.println(index);
	        System.out.println(last);
	        if(emp.isEmpty()) {
	        	 System.out.println("emptyyy");
	        }
	        String name1="ammu";
	        String n=" ";
	       if(name1.equals("ammu")) {
	    	 
		        	 System.out.println("emp1");
		        	
		        }
	       String n3="free";
	       if(n3.contains("free")) {
	    	   System.out.println("emp1");
	       }
	       String sub=name.substring(1,4);
	       System.out.println(sub);
       	
	       }
	        	
	    }
	


