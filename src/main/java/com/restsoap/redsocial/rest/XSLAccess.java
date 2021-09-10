package com.restsoap.redsocial.rest;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(
		value="xsl",
		produces="application/xml"
)
@RestController
public class XSLAccess {
	
	@GetMapping(
	  value = "/Administrador"
	)
	public byte[] administrador () throws IOException {
		InputStream in = getClass()
				.getResourceAsStream("/Administrador.xsd");
		return in.readAllBytes();
	}
	
}