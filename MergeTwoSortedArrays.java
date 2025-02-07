package org.mac.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArrays {

    public static void main(String[] args)
    {
         List<List<Integer>> list= Arrays.asList(Arrays.asList(1,3,5,7),Arrays.asList(2,4,6,8));
        List<Integer> list3=list.stream().flatMap(list1->list1.stream()).sorted().collect(Collectors.toList());
        System.out.println(list3);

    }


}
