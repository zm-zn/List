import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.*;

/**
 * Create by zm on 2019/10/29 16:23
 */
public class Test3 {
    public static void main(String[] args) {
     Map<Integer,String> map = new HashMap<>();
     map.put(1,"hejjo");
     //当key值再次重复时，再次put变为相应value的更新操作，key不存在返回null
     map.put(1,"Hello");
     map.put(2,"bitt");
     map.put(4,"java");
     map.put(3,"he");
     //取得当前map 中的所有key值
     Set<Integer> keyset =map.keySet();
     Iterator<Integer> interator= keyset.iterator();
     while (interator.hasNext())
        System.out.println(interator.next());

        for (Integer i:keyset
             ) {
            System.out.println(map.get(i));
        }

    }




}
