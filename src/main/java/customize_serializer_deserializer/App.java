package customize_serializer_deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class App {

	public static void main(String[] args) {
		String[] books = {"book1", "book2", "book3"};
		BookReader reader = new BookReader(1L, "Mary", books);
//		SimpleModule module = new SimpleModule();
//		module.addSerializer(new CustSerializer(BookReader.class));
//		module.addDeserializer(BookReader.class, new CustDeserializer(BookReader.class));
		ObjectMapper mapper = new ObjectMapper();
//		mapper.registerModule(module);
		
		System.out.println("-----serialize Java to Json------\n");
		String jsonReader = null;
		try {
			 jsonReader = mapper.writeValueAsString(reader);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonReader + "\n");
		
//		System.out.println("-----deserialize Json to Java------\n");
//		BookReader readerFromJson = null;
//		try {
//			 readerFromJson = mapper.readValue(jsonReader, BookReader.class);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(readerFromJson.toString());
	}

}
