package by.htp.classexample.runner;

// � ����� ���� ��������� ������� - ������� ��������� ������� � ����� - ����������
// ���� ��� ���������, ���� ��������, � ��� ������������, 
//��� ��� ��������� ����� ��������

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
		return "���: " + name + " �������: " + surname + " ���� ��������: " + birthDate;
	}
	
}
