
import java.lang.reflect.*;
public class Main1 {


    public static void main(String[] args) {
        Class<?> aclass = MyClass.class;
        printClassInfo(aclass);
    }
    public static void printClassInfo(Class<?> aclass){
        System.out.println("Інформація про клас: " + aclass.getName());

        System.out.println("Модифікатори доступу: " + Modifier.toString(aclass.getModifiers()));
Field[] fields = aclass.getDeclaredFields();
System.out.println("Поля класу: ");
for (Field field : fields) {

    System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());
}
    Constructor<?>[] constructors = aclass.getDeclaredConstructors();
System.out.println("Конструктор класу: ");
for(Constructor<?> constructor : constructors){
    System.out.println(Modifier.toString(constructor.getModifiers()) + " "+ constructor.getName() + parameterList(constructor.getParameterTypes()));


}


Method[] methods = aclass.getDeclaredMethods();
System.out.println("Методи класу: ");
for (Method method : methods){
    System.out.println(Modifier.toString(method.getModifiers())+ " "+ method.getReturnType().getName()+ " "+ method.getName() + parameterList(method.getParameterTypes()));


}



    }
    public static String parameterList(Class<?>[] parameterTypes){
        StringBuilder stringB = new StringBuilder("(");
        for(int x = 0; x< parameterTypes.length;x++){
            stringB.append(parameterTypes[x].getName());
            if(x<parameterTypes.length - 1){
                stringB.append(", ");



            }





        }
        stringB.append(")");
        return stringB.toString();




    }

}
class MyClass{


    public int publicfield;
    protected String protectedfield;
    private double privatefield;

    public MyClass(int numbers, String words, double numbersD){
        this.publicfield=numbers;
        this.protectedfield=words;
        this.privatefield=numbersD;


    }
    private void privateMethod(){
        System.out.println("PrivateMethod");
    }
    public void publicMethod(){
        System.out.println("PublicMethod");


    }
    protected void protectedMethod(){


        System.out.println("ProtectedMethod");
    }








}