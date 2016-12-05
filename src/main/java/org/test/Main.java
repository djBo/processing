package org.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import processing.core.PApplet;

public class Main {

	public static void main(String[] args) {
		Method[] methods = PApplet.class.getDeclaredMethods();
		Field[] fields = PApplet.class.getDeclaredFields();

		for (Field field : fields) {
			if (Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
				printParentFieldCalls(field);
			}
		}

		for (Method method : methods) {
			if (Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers())) {
				printParentMethodCall(method);
			}
		}

	}

	static void printParentMethodCall(Method m) {
		Class<?> returnType = m.getReturnType();
		Integer argCount = m.getParameterCount();
		Parameter[] params = m.getParameters();
		Class<?>[] types = m.getParameterTypes();

		String method = "public final ";
		method += returnType.getName() + " ";
		method += m.getName() + "(";
		for (int i = 0; i < argCount; i++) {
			method += params[i];
			if (i != (argCount-1)) {
				method += ", ";
			}
		}
		method += ") {\r\n\t";
		if (!returnType.equals(void.class)) {
			method += "return ";
		}
		method += "parent." + m.getName() + "(";
		for (int i = 0; i < argCount; i++) {
			method += params[i].getName();
			if (i != (argCount-1)) {
				method += ", ";
			}
		}
		method += ");\r\n}\r\n";

		System.out.println(method);

	}

	static void printParentFieldCalls(Field f) {
		String method = "public final " + f.getType().getName() + " _" + f.getName() + "() {\r\n\treturn parent." + f.getName() + ";\r\n}\r\n\r\n" +
						"public final void _" + f.getName() + "(" + f.getType().getName() + " value) {\r\n\tparent." + f.getName() + " = value;\r\n}\r\n";


		System.out.println(method);
	}
}
