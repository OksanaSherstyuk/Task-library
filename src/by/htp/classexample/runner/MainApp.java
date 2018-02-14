package by.htp.classexample.runner;
// все пол€ экземпл€ры класса должны всегда быть приватными
// (надо закрыать доступ)
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MainApp {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		//ошибки бывают: компил€ции и времени выполнени€. еще бывают провер€емые и непровер€емые ошибки
		
		// это обработка исключительных ситуаций (потенциально опасна€ ситуаци€)
		Date date1 = df.parse("13-01-2001");
		Date date2 = df.parse("13-06-1903");
		Date date3 = df.parse("13-07-1923");
		Date date4 = df.parse("13-08-1993");
		Date date5 = df.parse("13-09-1933");
				
		Author auth1 = new Author("NameAuthor1", "SurnameAuthor1", date1);
		Author auth2 = new Author("NameAuthor2", "SurnameAuthor2", date2);
		Author auth3 = new Author("NameAuthor3", "SurnameAuthor3", date3);
		Author auth4 = new Author("NameAuthor4", "SurnameAuthor4", date4);
		Author auth5 = new Author("NameAuthor5", "SurnameAuthor5", date5);
		
		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 1950);
		Book book3 = new Book("Book3", 2017);
		
		Book book12 = book1;
		//book1.author = new Author[] {auth1, auth2};
		
		Author[] authors = new Author[] {auth1, auth2};
		book1.setAuthors(authors);
		
		book2.addAuthor(auth1);	
		book2.addAuthor(auth2);
		book2.addAuthor(auth3);	
		book2.addAuthor(auth4);	
		book2.addAuthor(auth5);	
		
		System.out.println(book2);
	}

}
