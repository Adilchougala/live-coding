package com.gblogdemoapp.collections;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterA {
    public static void main(String[] args) {

        //1) GIVE ME ONLY EVEN NUMBER IN A LIST
        /*List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);*/


        //2) GIVE ME ONLY ODD NUMBER IN A LIST
      /*List<Integer> odd = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
     List<Integer> oddNumbers = odd.stream().filter(d->d%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers);*/

       //3) GIVE ME THOSE SAME NAME
      /*List<String> name = Arrays.asList("mike","adam","stallin","adil","mike","thyson","adil");
      List<String> names = name.stream().filter(n->n.equals("mike")).collect(Collectors.toList());
        System.out.println(names);*/


        //4) GIVE THOSE NAME WHOS NAME STARTSWITH SMALL "a"
      /*List<String> start = Arrays.asList("adil","mike","altaf","stallin","thyson","adam");
    List<String> startsWith = start.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(startsWith);*/

        //5) GIVE THOSE NAME WHOS NAME STARTSWITH CAPITAL "A"
     /*List<String> starts = Arrays.asList("Adil","Mike","Altaf","Stallin","Thyson","adam");
  List<String> startWith = starts.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(startWith);*/


        //6) GIVE THOSE NAME WHOS NAME ENDSWITH SMALL "a"
       /*List<String> end =Arrays.asList("Adil","Mikea","Altaf","Stallina","Thysona","adam");
        List<String> endsWith = end.stream().filter(e -> e.endsWith("a")).collect(Collectors.toList());
        System.out.println(endsWith);*/


        //7) GIVE ME THOSE NAME WHERE IN A WORD JAVA IS PRESENT
        List<String> contains = Arrays.asList("javascript","java","python","htlm","javaworld","ajava");
      List<String> contain =  contains.stream().filter(c->c.contains("java")).collect(Collectors.toList());
        System.out.println(contain);
    }

}
