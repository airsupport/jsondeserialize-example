package jsondeserialize.example.objects;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jsondeserialize.example.builders.Foo_Builder;

@JsonDeserialize(builder = Foo.Builder.class)
public interface Foo {

	class Builder extends Foo_Builder {
	}

	int foosInt();

	String foosString();

	double foosDouble();
}
