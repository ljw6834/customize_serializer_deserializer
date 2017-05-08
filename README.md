
# customize_serializer_deserializer
This project shows how to use customized serializer and deserializer. The java object is serialized into Json object, then deserialized into Java object. 

Using default json serializer, the output json string is like this:
<p>{"id":1,"name":"Mary","books":["book1","book2","book3"]}</p>
<p>As you can see above Json, "books" are displayed as an array.</p>
Using customized serializer, "books" are displayed as a string without the square bracket:
<p>{"id":1,"name":"Mary","books":"book1,book2,book3"}</p>




