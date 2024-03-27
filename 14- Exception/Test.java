
class Test {
	public static void main(String[] args) {
		try {
			Temps T = new Temps(23, 200, 37);
		} catch (TempsException e) {
			e.printStackTrace();
			// System.out.println(e.getMessage());

		}
	}
}


