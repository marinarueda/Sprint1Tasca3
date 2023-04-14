package exercici1;

public class Month implements Comparable<Month> {
	
	    private String name;

	    public Month(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    

	    @Override
		public String toString() {
			return "Month:" + name ;
		}

		@Override
	    public int compareTo(Month other) {
	        return this.name.compareTo(other.getName());
	    }
	

}
