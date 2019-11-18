import java.util.ArrayList;
import java.util.List;

/**
 * Create by zm on 2019/10/29 12:25
 * 对于List接口的使用
 */
public class TestDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//声明并且初始化list接口
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println(list.contains(3));//表示是否包含此元素
        System.out.println(list.size());//存在的元素个数
        System.out.println(list.remove(3));//表示将第四个元素删除,并且返回删除的元素
        System.out.println(list.get(2));//获取第三个元素
        System.out.println(list.set(2,7));//将第三个元素的值修改为7，并且返回修改之前的值
        System.out.println(list);
    }
}
