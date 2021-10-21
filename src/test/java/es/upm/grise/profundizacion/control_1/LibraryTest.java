package es.upm.grise.profundizacion.control_1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class LibraryTest {
	
	@Test
	public void DuplicatedBookExceptionTest() {
		
		
		assertThrows(DuplicatedBookException.class,()-> {} );
	    
	}

	@Test
	public void addBookTest() {
		Book libro = new Book(null);
		Library library = new Library();
		ArrayList<Book> books;
		
	
		
	    
	}
	
	@Test
	public void removeBookTest() {
		Book libro = new Book(null);
		Library library = new Library();
		ArrayList<Book> books;
		
	    
		//assertNull(, "el libro no está en la librería");
	    
	}
	
	@Test
	public void getBookTest() {
		ArrayList<Book> books = new ArrayList<Book>();
		Book libro = new Book("hola");
		books.add(libro);
		Library library = new Library();
		
		//assertNotNull(library.getBook(libro.getTitle()),"se ha encontrado el libro");
		
	   
	    
	}
	
	@Test
	public void EmptyLibraryTest() {
		
		
		
		assertThrows(EmptyLibraryException.class,()-> {});
		
		
	    
	}
	@Test
	public void NonExistingBookExceptionTest() {
		
		
		
		assertThrows(NonExistingBookException.class,()-> {});
		
		
	    
	}
	
}
