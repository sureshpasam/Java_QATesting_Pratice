


public class AdpOverride {
	private static int AdpOverride() {
		int i =0;
		try {
			i++;
			throw new NullPointerException();
		}catch (NullPointerException e) {
			// TODO: handle exception
			return i++;
		}
	finally {
		return ++i;
	}
	}
	public static void main(String[] args) {
		AdpOverride s = new AdpOverride();
		System.out.println(s.AdpOverride());
		
		
	}
	}
