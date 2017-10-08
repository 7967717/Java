package core._4Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RomanR on 18-Jul-14.
 */
public class App05 {
    public static void main(String[] args) {

        DTO dto0 = new DTO("title DTO#1", "field DTO#1", "comment DTO#1");
        DTO dto1 = new DTO("title DTO#1", "field DTO#2", "comment DTO#2");
        DTO dto2 = new DTO("title DTO#1", "field DTO#3", "comment DTO#3");
        DTO dto3 = new DTO("title DTO#1", "field DTO#4", "comment DTO#4");
        DTO dto4 = new DTO("title DTO#5", "field DTO#5", "comment DTO#5");
        DTO dto5 = new DTO("title DTO#5", "field DTO#6", "comment DTO#6");
        DTO dto6 = new DTO("title DTO#7", "field DTO#7", "comment DTO#7");

        List<DTO> dtoList1 = new ArrayList<>();
        dtoList1.add(dto0);
        dtoList1.add(dto1);
        dtoList1.add(dto2);
        dtoList1.add(dto3);

        List<DTO> dtoList2 = new ArrayList<>();
        dtoList2.add(dto4);
        dtoList2.add(dto5);

        List<DTO> dtoList3 = new ArrayList<>();
        dtoList3.add(dto6);




        System.out.println(dtoList1);
        System.out.println(dtoList2);
        System.out.println(dtoList3);

        //        int index = 1;
//        for (DTO dto : dtoList) {
//            dto.s1 = "title DTO #" + index;
//            dto.s2 = "field DTO #" + index;
//            dto.s3 = "comment DTO #" + index;
//            index++;
//        }
//
//        dtoList.get(1).s1 = "title DTO #1";
//        dtoList.get(2).s1 = "title DTO #1";
//        dtoList.get(6).s1 = "title DTO #6";

//        Map<String,Integer> map = new LinkedHashMap<>();
//        for (int i = 0; i < dtoList.size(); i++) {
//            String word=dtoList.get(i).s1;
//            if (!map.containsKey(word)){
//                map.put(word,1);
//            } else {
//                map.put(word, map.get(word) +1);
//            }
//        }
//
//        System.out.println(map);
//
//
//        for (DTO dto : dtoList) {
//            System.out.println("-" + dto.s1 + "--" + dto.s2 + "--" + dto.s3 + "-");
//        }

//        Map<String, List<DTO>> dtoMap = new LinkedHashMap<>();
//        for (DTO dto : dtoList) {
//            List<DTO> list = new ArrayList<>();
//            list.add(dto);
//            dtoMap.put(dto.s1, list);
//
//        }


//        System.out.println(dtoMap);
    }
}

class DTO {
    String s1;
    String s2;
    String s3;

    DTO(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "- " + s1 + '\'' +
                " -- " + s2 + '\'' +
                " -- " + s3 + '\'' +
                " -";
    }
}
