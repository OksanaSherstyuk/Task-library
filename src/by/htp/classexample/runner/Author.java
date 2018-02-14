package by.htp.classexample.runner;

// в книге есть несколько авторов - поэтому отношение авторов к книге - композици€
// есть еще агрегаци€, надо почитать, и про наследование, 
//это все отношени€ между классами

import java.util.Date;

public class Author {

	String name;
	String surname;
	Date birthDate;
	
	public Author() {
		
	}
	
	public Author(String name, String surname, Date date) {
		this.name = name;
		this.surname = surname;
		this.birthDate = date;
				
	}
	@Override
	public String toString() {
		return "»м€: " + name + " ‘амили€: " + surname + " ƒата рождени€: " + birthDate;
	}
	
}
