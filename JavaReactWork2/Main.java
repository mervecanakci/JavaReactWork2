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
AllCourse course1=new AllCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR) ",1,
		"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz. ",
		"Engin Demiroð", "ücretsiz");
	
	AllCourse course2=new AllCourse();
	course2.setName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT) ");
	course2.setId(2);
	course2.setDetail("Sýfýrdan yazýlým geliþtirme.");
	course2.setTeacher("Engin Demiroð");
	course2.setPrice("ücretsiz");
	
	
	
	
	AllCourse course3=new AllCourse();
	course3.setName("Programlamaya Giriþ Ýçin Temel Kurs ");
	course3.setId(3);
	course3.setDetail("PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");
	course3.setTeacher("Engin Demiroð");
	course3.setPrice("ücretsiz");
	
	
	
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
	question1.setQuestion("Yazýlým Geliþtirici Yetiþtirme Kampý nerede yayýnlanacak?"
			+ "\n");
	question1.setAnswer("Kampýmýz canlý olarak yayýnlanacak.Canlý yayýn YouTube kanalýmda gerçekleþecek. "
			+ "\nCanlý yayýn sonrasý videolar, ödevler ve testler kodlama.io 'da yayýnlanacak."
			+ "\n");
	
	
FrequentlyAskedQuestions question2 =new FrequentlyAskedQuestions();
	
	question2.setNumber(2);
	question2.setQuestion("Yazýlým Geliþtirici Yetiþtirme Kampýnýn canlý yayýn tarihi ne zaman ve saat kaçta baþlayacak?"
			+ " "
			+ "\nBir canlý yayýn süresi ne kadar olacak? Canlý yayýn hangi günlerde yapýlacak?"
			+ "\n");
	question2.setAnswer("Canlý yayýn balangýç tarihi : 9 Ocak Cumartesi 2021"
			+ "\n"
			+ "Canlý yayýn saati : 21.30"
			+ "\n"
			+ "Canlý yayýn süresi : 3 ders saati"
			+ "\n"
			+ "Canlý yayýn günleri : Çarþamba ve Cumartesi"
			+ "\n"
			+ "(Ýlk canlý ders tarihini takip eden her haftanýn Çarþamba ve Cumartesi günlerinde devam edecek)"
			+ "\n");
	
	
FrequentlyAskedQuestions question3 =new FrequentlyAskedQuestions();
	
	question3.setNumber(3);
	question3.setQuestion("Yazýlým Geliþtirici Yetiþtirme Kamp programý ne kadar sürecek? "
			+ "\n");
	question3.setAnswer("Ücretsiz olarak vereceðim bu kamp 2 ay boyunca sürecek."
			+ "\n");
	
	
FrequentlyAskedQuestions question4 =new FrequentlyAskedQuestions();
	
	question4.setNumber(4);
	question4.setQuestion("Canlý yayýn sonrasý videolar, ödevler ve testler olacak mý? Olacak ise bunlara nasýl ulaþabilirim?"
			+ "\n");
	question4.setAnswer("Evet, canlý yayýn sonrasý videolar, ödevler ve testler olacak."
			+ " \n Kodlama.io 'da Yazýlým Geliþtirici Yetiþtirme Kampýnýn içinde bulunan ders programýnýza ekleyeceðiz."
			+ "\n");
	
	
	
FrequentlyAskedQuestions question5 =new FrequentlyAskedQuestions();
	
	question5.setNumber(5);
	question5.setQuestion("Canlý yayýna katýlamayacak kiþilerin, dersleri herhangi bir platform üzerinden "
			+ "takip etme, tekrarýný izleme gibi bir þansý olacak mý? "
			+ "\n");
	question5.setAnswer(" Evet, canlý yayýndan sonra kodlama.io 'ya ekleyeceðiz. "
			+ "\n Katýlamadýðýnýz veya tekrar izlemek istediðiniz yayýnlara kodlama.io 'dan ulaþabilirsiniz."
			+ "\n");
	
	
	
FrequentlyAskedQuestions question6 =new FrequentlyAskedQuestions();
	
	question6.setNumber(6);
	question6.setQuestion("Yazýlým Geliþtirici Yetiþtirme Kampýndan en büyük verimi nasýl alabilirim?"
			+ " \n Kamp sýrasýnda neler yapmamý önerirsiniz?"
			+ "\n");
	question6.setAnswer("1-Ýki ekranda takip etmeye çalýþýn."
			+ "2-Ýkinci ekran yoksa? Bu durumda bilgisayar ekranýnýzý ikiye bölebilirsiniz."
			+ "\n "
			+ "Windows + Sol Yön tuþuyla mevcut ekraný sola, Windows + sað yön tuþu ikilisiyle de mevcut diðer ekraný saða atabilirsiniz."
			+ "(Öncesinde deneyiniz.)"
			+ "\n"
			+ "3-Ne kurmalýyým? Eðitimin ilk günü için bir þey kurmanýz gerekmiyor."
			+ "\n "
			+ " Online editör kullanacaðýz."
			+ "\n"
			+ " Repl.it sitesinden bir hesap açmanýz yeterlidir. Ýkinci gün itibariyle Visual Studio kullanacaðýz.");
	
	
	System.out.println(question1.getQuestion() + question1.getAnswer());
	System.out.println(question2.getQuestion() + question2.getAnswer());	
	System.out.println(question3.getQuestion() + question3.getAnswer());
	System.out.println(question4.getQuestion() + question4.getAnswer());
	System.out.println(question5.getQuestion() + question5.getAnswer());
	System.out.println(question6.getQuestion() + question6.getAnswer());
	 break;
	
case 3 :
	
	CampPreparation notice1=new CampPreparation() ;
		notice1.setNotice("        YAZLIM GELÝÞTÝRÝCÝ YETÝÞTÝRME PROGRAMIMIZA ÇOK AZ KALDI.                            "
				+ "\n ");
		notice1.setDetails("Programdan en büyük verimi almanýz için þimdiden önlemler almanýzý "
				+ "ve hazýrlýk yapmanýzý önereceðim tüyolarý bu sayfada toplamaya karar verdim."
				+ "\n");
		
		
		CampPreparation notice2=new CampPreparation() ;
		notice2.setNotice("        PAYLAÞMAK ÝSTÝYORUM!                  "
				+ "\n");
		notice2.setDetails("Bu projeye gösterilen ilginin büyüklüðünü açýkçasý beklemiyordum."
				+ "Þimdiden 30.000 kaydý geçtik."
				+ "Bu da demek oluyor ki muhtemelen Türkiye'de bugüne kadar yapýlmýþ en kalabalýk "
				+ "profesyonel yazýlým geliþtirme eðitimini yapacaðýz."
				+ "\n Öðrencilerimin heyecaný beni en az onlar kadar motive ediyor. "
				+ " Ben ve ekibim çok iyi hazýrlanýyoruz."
				+ "\n");
		
		
		CampPreparation notice3=new CampPreparation() ;
		notice3.setNotice("        ÝKÝ EKRANDAN TAKÝP ETMEYE ÇALIÞIN!        "
				+ "\n");
		notice3.setDetails("Bu ekranlardan birinde beni izlerken diðerinde kod yazýp"
				+ "soru cevap platformumuzdan destek alabilirsiniz. "
				+ " Yardýmcý ekran tablet, monitör veya evdeki HDMI destekli TV olabilir."
				+ "\n");
	
	
		CampPreparation notice4=new CampPreparation() ;
		notice4.setNotice("        ÝKÝNCÝ EKRAN YOKSA;              "
				+ "\n ");
		notice4.setDetails("Bu durumda bilgisayar ekranýnýzý ikiye bölebilirsiniz. "
				+ "\n Windows + Sol Yön tuþuyla mevcut ekraný sola,"
				+ " Windows + sað yön tuþu ikilisiyle de mevcut diðer ekraný saða atabilirsiniz. "
				+ "\n Öncesinde deneyiniz."
				+ "\n ");
		
		System.out.println(notice1.getNotice()+notice1.getDetails());
		System.out.println(notice2.getNotice()+notice2.getDetails());
		System.out.println(notice3.getNotice()+notice3.getDetails());
		System.out.println(notice4.getNotice()+notice4.getDetails());
		
		 break;
case 4:
		
		MyCourse courseName=new MyCourse();
		courseName.setName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT) ");
		courseName.setPercentageOfCompletion(0.69);
		courseName.setTeacher("Engin Demiroð");
		
		System.out.println(courseName.getName());
		System.out.println(courseName.getPercentageOfCompletion());
		System.out.println(courseName.getTeacher());
		
		 break;
			
		
}	
}
}
