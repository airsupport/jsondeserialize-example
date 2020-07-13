package jsondeserialize.example.objects;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = Foo.Builder.class)
public interface Foo {

	class Builder extends Foo_Builder {
	}

	int foosInt();

	String foosString();

	double foosDouble();
}
