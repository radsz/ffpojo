package com.github.ffpojo.metadata.positional.annotation.extra;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.github.ffpojo.metadata.positional.PaddingAlign;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface IntegerPositionalField {
	int initialPosition();
	int finalPosition();
	PaddingAlign paddingAlign() default PaddingAlign.RIGHT;
	char paddingCharacter() default ' ';
	boolean trimOnRead() default true;

}
