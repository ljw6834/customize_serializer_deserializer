package customize_serializer_deserializer;

import java.io.IOException;
import java.util.StringJoiner;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustSerializer extends StdSerializer<BookReader> {
    
	public CustSerializer(){
		this(BookReader.class);
	}
	
	public CustSerializer(Class<BookReader> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(BookReader value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeNumberField("id", value.getId());
		gen.writeStringField("name",value.getName());
		StringJoiner joiner = new StringJoiner(",");
		for(String s: value.getBooks()){
			joiner.add(s);
		}
		gen.writeStringField("books", joiner.toString());
		gen.writeEndObject();
	}
	
	

}
