package com.krakeDev.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {

	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

	public static void guardarContacto(String nombre, String apellido, String telefono) {

		FileWriter escritor = null;

		try {

			escritor = new FileWriter("contactos.txt", true);

			escritor.write(nombre + "\n");
			escritor.write(apellido + "\n");
			escritor.write(telefono + "\n");

			log.info("Contacto guardado correctamente");

		} catch (IOException e) {

			log.error("Error al guardar el contacto", e);

		} finally {

			if (escritor != null) {

				try {

					escritor.close();

				} catch (IOException e) {

					log.error("Error al cerrar el archivo", e);
				}
			}
		}
	}
}