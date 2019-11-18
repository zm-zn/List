import java.util.*;

/**
 * Create by zm on 2019/10/29 12:39
 * 自定义类型的使用
 */

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        //自反性
        if (obj ==this){
            return true;

            //非空性
        }else if (obj==null){
            return false;
        } else if (!(obj instanceof Person)) {
            return false;
        }
        Person per = (Person) obj;
        return per.age.equals(this.age)&&per.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age,name);//Objects表示所有类的父类提供若干个工具方法
    }
}

public class Test {
    public static void main(String[] args) {

        //保存自定义的Person对象
        Set<Person> set = new HashSet<>();  //此时实现了Comparator接口，传入了比较器，调用覆写过的compare方法
        set.add(new Person("张三",19));
        set.add(new Person("李四",18));
        set.add(new Person("张三",19));


        System.out.println(set);

    }
}
