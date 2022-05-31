package example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
public class Start {
    public static void main(String[] args) throws IOException {
       // foo(null);
        try{
            System.out.println("ONE");
            throw new FileNotFoundException();
        }
        catch(FileNotFoundException e){
            System.out.println("TWO");
            throw new IOException();
        }catch (IOException e){
            System.out.println("THREE");
            e.printStackTrace();
        }
    }

    private static void foo(Object o) {
        System.out.println("Object impl");
    }
    private static void foo(String s) {
        System.out.println("String impl");
    }

}
