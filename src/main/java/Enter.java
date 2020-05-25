import com.test.*;
import com.test.aop.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.type.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Enter {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        Man man = (Man)context.getBean("student");
        man.say();
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.test");
//        MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
//        publisher.publish("testEvent");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiredBean.class);
//        Person person1 = (Person)context.getBean("person1");
//        System.out.println(person1);
//        Person person2 = (Person)context.getBean("person2");
//        System.out.println(person2);
//        ApplicationContext context = new AnnotationConfigApplicationContext(PeopleConfig.class);
//        metadata();
//        element();
    }

    public static void metadata() {
        System.out.println("------------------------ClassMetadata--------------------------");
        ClassMetadata classMetadata = new StandardClassMetadata(MetaDataDemo.class);
        System.out.println(classMetadata.getClassName()); //com.test.MetaDataDemo
        System.out.println(classMetadata.hasSuperClass()); //true：除了Object以外应该都是true
        System.out.println(classMetadata.isAnnotation()); //false：该类本身并不是一个注解

        System.out.println("------------------------AnnotationMetadata--------------------------");
        AnnotationMetadata annotationMetadata = new StandardAnnotationMetadata(MetaDataDemo.class);
        System.out.println(annotationMetadata.getAnnotationTypes());  //[org.springframework.context.annotation.Configuration]
        System.out.println(annotationMetadata.getMetaAnnotationTypes(Configuration.class.getName()));  //[org.springframework.stereotype.Component]
        System.out.println(annotationMetadata.isAnnotated( Configuration.class.getName()));  //true：注意这里与上面ClassMetadata.isAnnotation()的不同！
        System.out.println(annotationMetadata.hasAnnotation(Configuration.class.getName()));  //true
        System.out.println(annotationMetadata.hasAnnotation(Controller.class.getName()));   //false
        System.out.println(annotationMetadata.hasMetaAnnotation(Configuration.class.getName()));  //false：注意，MetaAnnotation是Component而不是Configuraion

        annotationMetadata.getAnnotatedMethods(Autowired.class.getName()).forEach(methodMetadata -> {
            System.out.println(methodMetadata.getClass()); // class org.springframework.core.type.StandardMethodMetadata
            System.out.println(methodMetadata.getMethodName()); // test1 & test2
            System.out.println(methodMetadata.getReturnTypeName()); // java.lang.String
        });


        System.out.println("------------------------MethodMetadata--------------------------");
        Method method1 = null;
        try {
            Class cl = Class.forName("com.test.MetaDataDemo");
            method1 = cl.getDeclaredMethod("test1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if(method1 != null){
            MethodMetadata methodMetadata = new StandardMethodMetadata(method1);
            System.out.println(methodMetadata.getMethodName()); //test1
            System.out.println(methodMetadata.getReturnTypeName()); //java.lang.String
            System.out.println(methodMetadata.isOverridable()); //false
        }


    }

    public static void element(){
        System.out.println("------------------------AnnotationElement--------------------------");
        RequestMapping requestMapping = AnnotatedElementUtils.findMergedAnnotation(AnnotatedElementMemo.class, RequestMapping.class);
        System.out.println(Arrays.toString(requestMapping.value()));
        System.out.println(Arrays.toString(requestMapping.headers()));
        System.out.println(Arrays.toString(requestMapping.params()));
    }
}
