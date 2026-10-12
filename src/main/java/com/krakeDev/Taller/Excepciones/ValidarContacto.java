package com.krakeDev.Taller.Excepciones;

public class ValidarContacto {

	public static void validarTelefono(String telefono) throws IllegalArgumentException {

		if (telefono == null || !telefono.matches("\\d{10}")) {

			throw new IllegalArgumentException("El telefono debe tener 10 digitos");
		}
	}
}