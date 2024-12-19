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
        ApplicationContext con = new ClassPathXmlApplicationContext("springCore/config.xml");
        Student s1 =(Student) con.getBean("stu1");
        Student s2 = (Student) con.getBean("stu2");
        Student s3 = (Student) con.getBean("stu3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }
}
