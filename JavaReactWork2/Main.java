package JavaReactWork2;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {	
	System.out.println("1= All Course \n"
			+ "2= Frequently Asked Questions \n"
			+ "3= Camp Preparation \n"
			+ "4= My Course \n");
Scanner k=new Scanner(System.in);
int selection=k.nextInt();


switch (selection){

case 1:
AllCourse course1=new AllCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR) ",1,
		"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz. ",
		"Engin Demiro�", "�cretsiz");
	
	AllCourse course2=new AllCourse();
	course2.setName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT) ");
	course2.setId(2);
	course2.setDetail("S�f�rdan yaz�l�m geli�tirme.");
	course2.setTeacher("Engin Demiro�");
	course2.setPrice("�cretsiz");
	
	
	
	
	AllCourse course3=new AllCourse();
	course3.setName("Programlamaya Giri� ��in Temel Kurs ");
	course3.setId(3);
	course3.setDetail("PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");
	course3.setTeacher("Engin Demiro�");
	course3.setPrice("�cretsiz");
	
	
	
	System.out.println(course1.getName() );
	System.out.println(course1.getDetail());
	System.out.println(course1.getTeacher());
	System.out.println(course1.getPrice());
	
	System.out.println(course2.getName() );
	System.out.println(course2.getDetail());
	System.out.println(course2.getTeacher());
	System.out.println(course2.getPrice());
	
	System.out.println(course3.getName());
	System.out.println(course3.getDetail());
	System.out.println(course3.getTeacher());
	System.out.println(course3.getPrice());
	
	 break;
	 
case 2:
	FrequentlyAskedQuestions question1 =new FrequentlyAskedQuestions();
	
	question1.setNumber(1);
	question1.setQuestion("Yaz�l�m Geli�tirici Yeti�tirme Kamp� nerede yay�nlanacak?"
			+ "\n");
	question1.setAnswer("Kamp�m�z canl� olarak yay�nlanacak.Canl� yay�n YouTube kanal�mda ger�ekle�ecek. "
			+ "\nCanl� yay�n sonras� videolar, �devler ve testler kodlama.io 'da yay�nlanacak."
			+ "\n");
	
	
FrequentlyAskedQuestions question2 =new FrequentlyAskedQuestions();
	
	question2.setNumber(2);
	question2.setQuestion("Yaz�l�m Geli�tirici Yeti�tirme Kamp�n�n canl� yay�n tarihi ne zaman ve saat ka�ta ba�layacak?"
			+ " "
			+ "\nBir canl� yay�n s�resi ne kadar olacak? Canl� yay�n hangi g�nlerde yap�lacak?"
			+ "\n");
	question2.setAnswer("Canl� yay�n balang�� tarihi : 9 Ocak Cumartesi 2021"
			+ "\n"
			+ "Canl� yay�n saati : 21.30"
			+ "\n"
			+ "Canl� yay�n s�resi : 3 ders saati"
			+ "\n"
			+ "Canl� yay�n g�nleri : �ar�amba ve Cumartesi"
			+ "\n"
			+ "(�lk canl� ders tarihini takip eden her haftan�n �ar�amba ve Cumartesi g�nlerinde devam edecek)"
			+ "\n");
	
	
FrequentlyAskedQuestions question3 =new FrequentlyAskedQuestions();
	
	question3.setNumber(3);
	question3.setQuestion("Yaz�l�m Geli�tirici Yeti�tirme Kamp program� ne kadar s�recek? "
			+ "\n");
	question3.setAnswer("�cretsiz olarak verece�im bu kamp 2 ay boyunca s�recek."
			+ "\n");
	
	
FrequentlyAskedQuestions question4 =new FrequentlyAskedQuestions();
	
	question4.setNumber(4);
	question4.setQuestion("Canl� yay�n sonras� videolar, �devler ve testler olacak m�? Olacak ise bunlara nas�l ula�abilirim?"
			+ "\n");
	question4.setAnswer("Evet, canl� yay�n sonras� videolar, �devler ve testler olacak."
			+ " \n Kodlama.io 'da Yaz�l�m Geli�tirici Yeti�tirme Kamp�n�n i�inde bulunan ders program�n�za ekleyece�iz."
			+ "\n");
	
	
	
FrequentlyAskedQuestions question5 =new FrequentlyAskedQuestions();
	
	question5.setNumber(5);
	question5.setQuestion("Canl� yay�na kat�lamayacak ki�ilerin, dersleri herhangi bir platform �zerinden "
			+ "takip etme, tekrar�n� izleme gibi bir �ans� olacak m�? "
			+ "\n");
	question5.setAnswer(" Evet, canl� yay�ndan sonra kodlama.io 'ya ekleyece�iz. "
			+ "\n Kat�lamad���n�z veya tekrar izlemek istedi�iniz yay�nlara kodlama.io 'dan ula�abilirsiniz."
			+ "\n");
	
	
	
FrequentlyAskedQuestions question6 =new FrequentlyAskedQuestions();
	
	question6.setNumber(6);
	question6.setQuestion("Yaz�l�m Geli�tirici Yeti�tirme Kamp�ndan en b�y�k verimi nas�l alabilirim?"
			+ " \n Kamp s�ras�nda neler yapmam� �nerirsiniz?"
			+ "\n");
	question6.setAnswer("1-�ki ekranda takip etmeye �al���n."
			+ "2-�kinci ekran yoksa? Bu durumda bilgisayar ekran�n�z� ikiye b�lebilirsiniz."
			+ "\n "
			+ "Windows + Sol Y�n tu�uyla mevcut ekran� sola, Windows + sa� y�n tu�u ikilisiyle de mevcut di�er ekran� sa�a atabilirsiniz."
			+ "(�ncesinde deneyiniz.)"
			+ "\n"
			+ "3-Ne kurmal�y�m? E�itimin ilk g�n� i�in bir �ey kurman�z gerekmiyor."
			+ "\n "
			+ " Online edit�r kullanaca��z."
			+ "\n"
			+ " Repl.it sitesinden bir hesap a�man�z yeterlidir. �kinci g�n itibariyle Visual Studio kullanaca��z.");
	
	
	System.out.println(question1.getQuestion() + question1.getAnswer());
	System.out.println(question2.getQuestion() + question2.getAnswer());	
	System.out.println(question3.getQuestion() + question3.getAnswer());
	System.out.println(question4.getQuestion() + question4.getAnswer());
	System.out.println(question5.getQuestion() + question5.getAnswer());
	System.out.println(question6.getQuestion() + question6.getAnswer());
	 break;
	
case 3 :
	
	CampPreparation notice1=new CampPreparation() ;
		notice1.setNotice("        YAZLIM GEL��T�R�C� YET��T�RME PROGRAMIMIZA �OK AZ KALDI.                            "
				+ "\n ");
		notice1.setDetails("Programdan en b�y�k verimi alman�z i�in �imdiden �nlemler alman�z� "
				+ "ve haz�rl�k yapman�z� �nerece�im t�yolar� bu sayfada toplamaya karar verdim."
				+ "\n");
		
		
		CampPreparation notice2=new CampPreparation() ;
		notice2.setNotice("        PAYLA�MAK �ST�YORUM!                  "
				+ "\n");
		notice2.setDetails("Bu projeye g�sterilen ilginin b�y�kl���n� a��k�as� beklemiyordum."
				+ "�imdiden 30.000 kayd� ge�tik."
				+ "Bu da demek oluyor ki muhtemelen T�rkiye'de bug�ne kadar yap�lm�� en kalabal�k "
				+ "profesyonel yaz�l�m geli�tirme e�itimini yapaca��z."
				+ "\n ��rencilerimin heyecan� beni en az onlar kadar motive ediyor. "
				+ " Ben ve ekibim �ok iyi haz�rlan�yoruz."
				+ "\n");
		
		
		CampPreparation notice3=new CampPreparation() ;
		notice3.setNotice("        �K� EKRANDAN TAK�P ETMEYE �ALI�IN!        "
				+ "\n");
		notice3.setDetails("Bu ekranlardan birinde beni izlerken di�erinde kod yaz�p"
				+ "soru cevap platformumuzdan destek alabilirsiniz. "
				+ " Yard�mc� ekran tablet, monit�r veya evdeki HDMI destekli TV olabilir."
				+ "\n");
	
	
		CampPreparation notice4=new CampPreparation() ;
		notice4.setNotice("        �K�NC� EKRAN YOKSA;              "
				+ "\n ");
		notice4.setDetails("Bu durumda bilgisayar ekran�n�z� ikiye b�lebilirsiniz. "
				+ "\n Windows + Sol Y�n tu�uyla mevcut ekran� sola,"
				+ " Windows + sa� y�n tu�u ikilisiyle de mevcut di�er ekran� sa�a atabilirsiniz. "
				+ "\n �ncesinde deneyiniz."
				+ "\n ");
		
		System.out.println(notice1.getNotice()+notice1.getDetails());
		System.out.println(notice2.getNotice()+notice2.getDetails());
		System.out.println(notice3.getNotice()+notice3.getDetails());
		System.out.println(notice4.getNotice()+notice4.getDetails());
		
		 break;
case 4:
		
		MyCourse courseName=new MyCourse();
		courseName.setName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT) ");
		courseName.setPercentageOfCompletion(0.69);
		courseName.setTeacher("Engin Demiro�");
		
		System.out.println(courseName.getName());
		System.out.println(courseName.getPercentageOfCompletion());
		System.out.println(courseName.getTeacher());
		
		 break;
			
		
}	
}
}
