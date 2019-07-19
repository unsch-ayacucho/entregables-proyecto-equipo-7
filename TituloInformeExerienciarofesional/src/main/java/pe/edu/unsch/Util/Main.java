package pe.edu.unsch.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BCryptPasswordEncoder a = new BCryptPasswordEncoder();
        System.out.println(a.encode("bachiller"));


    }

    public static String cambiarNombre(String file, String user) {
        String filen = file.replace(" ", "");
        String[] parts = filen.split(Pattern.quote("."));
        String part1 = parts[0]; // 123
        String extension = parts[1]; // 654321
        SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss S");
        Date fechaEntrada = new Date();
        String fecha = formatEntrada.format(fechaEntrada).replace(" ", "");
        String f = fecha.replace("/","");
        return user+"_"+f.replace(":","")+"."+extension;
    }


}
