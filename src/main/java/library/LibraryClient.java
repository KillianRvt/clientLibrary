package library;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import business.ILibrary;
import business.dao.BookDAO;

import business.data.Book;

public class LibraryClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9998/ws/library?wsdl");
		QName qname = new QName("http://webservice.business/", "LibraryImplService");
		
		Service service = Service.create(url,qname);
		
		ILibrary hello = service.getPort(ILibrary.class);
		hello.getBookDAO();
		BookDAO.getAllBooks();
	}

}
