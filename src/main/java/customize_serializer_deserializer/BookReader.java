package customize_serializer_deserializer;

import java.util.Arrays;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = CustSerializer.class)
@JsonDeserialize(using = CustDeserializer.class)
public class BookReader {
	
	private long id; 
	private String name; 
	private String[] books;
	
	
	
	public BookReader(long id, String name, String[] books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Reader [id=" + id + ", name=" + name + ", books=" + Arrays.toString(books) + "]";
	}
	
	

}
