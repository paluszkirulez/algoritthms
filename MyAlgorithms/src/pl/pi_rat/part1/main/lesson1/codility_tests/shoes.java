package pl.pi_rat.part1.main.lesson1.codility_tests;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class shoes {
    public static void main(String[] args) {
        String shoes = "RLRRLLRLRRLL";
        System.out.println(solution(shoes));
    }
    static public int solution(String S) {
        char[] charArray = S.toCharArray();
        //System.out.println(Arrays.toString(charArray));
        //List<Character> init = new ArrayList<>();
        int endSize =0;
        int startSize =0;
        int resultN = 0;
        char initChar = 'L';
        char endChar;
        for(int i =0;i<charArray.length;i++){
           // System.out.println(charArray.length);
            //init.add(charArray[i]);
            //startSize=1;

            if(startSize==0) {
                initChar = charArray[i];
                    for (int r = i; r < charArray.length; r++) {

                        if (charArray[i] == charArray[r]) {
                            startSize += 1;
                        } else {
                            i = r;
                            break;
                        }
                    }
                }

            //startSize = init.size();
            endChar = (initChar=='L')?'R':'L';
            if(charArray[i] == endChar){
                for(int r = i;r<charArray.length;r++){
                    if( charArray[r] == endChar){
                        endSize+=1;
                        if(endSize==startSize){
                            resultN+=1;
                            endSize=0;
                            startSize=0;
                            break;
                        }
                    }
                    else {
                        endSize=0;
                        break;
                    }

                }
            }



        }
        return resultN;
    }
}
