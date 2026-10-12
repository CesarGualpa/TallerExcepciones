package com.krakeDev.Taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

	public static void leerContactos() {

		BufferedReader lector = null;

		try {

			FileReader archivo = new FileReader("contactos.txt");

			lector = new BufferedReader(archivo);

			for (String linea = lector.readLine(); linea != null; linea = lector.readLine()) {

				log.info(linea);
			}

			log.info("Archivo leido correctamente");

		} catch (FileNotFoundException e) {

			log.error("El archivo no fue encontrado", e);

		} catch (IOException e) {

			log.error("Ocurrio un error al leer el archivo", e);

		} finally {

			if (lector != null) {

				try {

					lector.close();

				} catch (IOException e) {

					log.error("Error al cerrar el archivo", e);
				}
			}
		}
	}
}