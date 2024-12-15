package springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        Student s1 =(Student) con.getBean("stu1");
        System.out.println(s1);
    }
}
