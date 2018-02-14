package by.htp.classexample.runner;

public class Book {

	String title;
	int year;
	private Author[] authors; //массив авторов. на случай если их несколько
	//могу работать с классом авторов только внутри пол€ этого
	private int authorCounter;
	
	public Book() {
		
	}
	
	public Book(String title, int years) {
		
		this.title = title;
		this.year = years;
		
	}
	
	public void setAuthors(Author[]authors) {
		if (authors != null) {
			this.authors = authors;
		}
	}
	
	public Author [] getAuthors () {
		return this.authors;
		
	}
		
		public void setTitle(String title) {
			this.title = title;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getYear() {
			return this.year;
		}
		
		public void addAuthor (Author author) {
			
			if(this.authors != null) {
				if(authorCounter < authors.length) {
					authors[authorCounter] = author;
					authorCounter++;
				}else {
					Author[] authors = new Author[this.authors.length+10];
					for(int i = 0; i < this.authors.length; i++) {
						authors[i] = this.authors[i];
											
					}
					
					this.authors = authors;
					this.authors[authorCounter] = author;
					authorCounter++;
				}
					
				}else {
					this.authors = new Author[10];
					this.authors [authorCounter]= author;
					authorCounter++;
				}
			} 
			@Override
			public String toString() {
				
				String authorsList="";
				for(int i = 0; i < authors.length; i++) {
					authorsList = authorsList + authors[i] +"\n";
				}
				
				return "Ќазвание: " + title + " √од: " + year + " јвторы: " + authorsList;
			}
		}
		

