package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentReader {

    private final static Logger log = LoggerFactory.getLogger(StudentReader.class);

    public void printStudent(){
        log.info("Escribe el nif del estudiante");
        String nif = ;
        log.info("Escribe el nombre del estudiante");
        String name= ;
        log.info("Escribe los apellidos del estudiante");
        String surnames ;
        log.info(nif, name, surnames);

    }
}
