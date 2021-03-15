public class Salesperson implements Comparable {
	private String firstName, lastName;
	private int totalSales;

// Constructor: Sets up the sales person object with
// 		the given data.

	public Salesperson (String first, String last, int sales) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}

// Returns the sales person as a string.

        @Override
	public String toString() {
		return firstName + " " + lastName + " : \t" + totalSales;
	}

// Returns true if the sales people have
// the same name.

        @Override
	public boolean equals (Object other) {
            return(lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
        }
        
        @Override
        public int compareTo(Object other)
        {
            Salesperson sp = (Salesperson) other;
            int result = 0;    
        
            if (totalSales == sp.totalSales)
            {
                result = (lastName).compareTo((sp.lastName));
                if (result == 0)
                {
                    result = firstName.compareTo(sp.firstName);
                }
            }
            else if (totalSales<sp.totalSales) 
                result = -1;
            else if (totalSales>sp.totalSales) 
                result = +1;
            
            return result;
        }
// First name accessor.

	public String getFirstName() {
		return firstName;
	}

// Last name accessor.

	public String getLastName() {
		return lastName;
	}

// Total sales accessor.

	public int getSales() {
		return totalSales;
	}
}
