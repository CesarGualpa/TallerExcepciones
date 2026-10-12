package com.krakeDev.Taller.Excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	private static final Logger log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {

		String telefono = "0981234567";

		try {

			ValidarContacto.validarTelefono(telefono);

			GuardarContacto.guardarContacto(
					"Maria",
					"Gomez",
					telefono
			);

			LeerContacto.leerContactos();

			log.info("Proceso completado correctamente");

		} catch (IllegalArgumentException e) {

			log.error("Telefono invalido: " + e.getMessage());
		}
	}
}