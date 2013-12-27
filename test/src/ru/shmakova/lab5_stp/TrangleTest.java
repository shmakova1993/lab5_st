package ru.shmakova.lab5_stp;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class TrangleTest {
	@Test
         public void testType(){
			System.out.println("Тестируем класс Треугольник");
			Trangle t = new Trangle(1,1,1,1, "Trangle");
			assertEquals("Trangle",t.name);
		} 
         @Test
	 public void testMethod(){
			System.out.println("Тестируем метод getPol()");
			Trangle t = new Trangle(4,3,4,5, "Square");
			assertEquals(6,t.getPol(),0.01);			
		}
    }
