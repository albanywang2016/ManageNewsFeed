package tech.japan.news.deletebadmessage.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leiwang on 3/25/17.
 */

public class VerticalText {

    private static final int DEFAULT_COLUMN_SPACING = 2;


    public static String makeVerticalText(String lines, int num_words_per_line) {

        String results = "";
        int max_words_per_line = 0;
        StringBuffer sb = new StringBuffer();
        List<String> myList = new ArrayList<String>(Arrays.asList(lines.split("")));


        int length = myList.size();
        int num_of_lines = length % num_words_per_line + 1;
        if(num_of_lines > 1){
            max_words_per_line = num_words_per_line;
            List<StringBuffer> sbArray = new ArrayList<>();


            for(int i = 0; i< num_of_lines; i+=num_words_per_line){
                List<String> subList = null;

                if(i+num_words_per_line < length){
                    subList = myList.subList(i, i+num_words_per_line);
                }else{
                    subList = myList.subList(i, length);
                }

                for(int j=0; j<length; j++){
                    String item = subList.get(j);
                    sb.append(item + '\n');
                }
                sbArray.add(i, sb);
            }
            return sbArray.toString();

        }else{
            max_words_per_line = length;
            for(int j=0; j<length; j++){
                String item = myList.get(j);
                sb.append(item + '\n');
            }
            return sb.toString();
        }


    }
}
