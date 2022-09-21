
public class listeler {

	public static void main(String[] args) {
		String ogrenci1="Ali";
		String ogrenci2="Veli";
		String ogrenci3="Kırkdokuz";
		String ogrenci4="Elli";
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]=ogrenci1;
		ogrenciler[1]=ogrenci2;
		ogrenciler[2]=ogrenci3;
		ogrenciler[3]=ogrenci4;
		
		for(int i=0;i<4;i++) {
			
			System.out.println(ogrenciler[i]);
			
		}
		ogrenciler[0]=ogrenci1;
		

	}

}
