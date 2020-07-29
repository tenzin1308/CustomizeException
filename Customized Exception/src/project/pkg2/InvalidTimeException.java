package project.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tenzintashi
 */
public class InvalidTimeException extends Exception {
    private String message;
    public InvalidTimeException(String m){
        super(m);
    }
}
