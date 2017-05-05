package customize_serializer_deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CustDeserializer extends StdDeserializer<BookReader> {

	protected CustDeserializer(Class<BookReader> vc) {
		super(vc);
		// TODO Auto-generated constructor stub
	}
	
	public CustDeserializer(){
		this(BookReader.class);
	}

	@Override
	public BookReader deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		long id = 0L;
		String name = null;
		String[] books = null;
		JsonToken token = null; 
		while((token = p.nextValue()) != null){
			switch(token){
			case VALUE_NUMBER_INT: if(p.getCurrentName().equals("id")){
									   id = p.getValueAsLong();
									}
									break;
			case VALUE_STRING: 
				  switch(p.getCurrentName()){
							case "name": name = p.getText();
							     break;
							case "books": books = p.getText().split(",");
							     break; 
					        default:
					        	 break;
				  }
		    default: break;
			}
		}	                  
			
		BookReader reader = new BookReader(id, name, books);
		return reader;
	}

	
}
