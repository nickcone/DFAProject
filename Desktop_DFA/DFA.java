//Nicholas Cone Project 1 CIS/MTH465
import java.io.*; 
import java.util.*;
public class DFA
{
    // instance variables - replace the example below with your own
    int x;
    /**
     * Constructor for objects of class DFA
     */
    public DFA()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String[] args)throws Exception 
    { 
        File file = new File("C:\\Users\\nicho\\Desktop\\DFA\\val.txt");
        String content;
        StringBuilder fileContents = new StringBuilder((int)file.length());        

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + System.lineSeparator());
            }
            content = fileContents.toString();
        }
        System.out.println("original:"+content);
        String str = java.util.Arrays.toString(content.split("(?<=\\G.{3})"));
        str = str.replaceAll("\\p{P}","");

        String[] splitArray = str.split(" ");
        int[] iarray = new int[splitArray.length];
        for(int i=0; i < splitArray.length -1; i++){
            try {
                iarray[i] = Integer.parseInt(splitArray[i]);
            } catch (NumberFormatException e) {
                return;
            }
            //System.out.println("arraynum:" + i +"  arraycontents: "+ iarray[i]);
        }
        Arrays.copyOf(iarray, iarray.length-1);
        System.out.println("arraytotallength: " + (iarray.length-1));
        int state = 1;
        for(int a=0; a < iarray.length; a++){
            System.out.println("Step: "+a+" CurrentState: "+state + " input: "+ iarray[a]);
            //State 1
            if(state==1){
                if(iarray[a]==119){
                    state=2;
                }
                else if(iarray[a]==105){
                    state=8;
                }
                else if(iarray[a]!=119 && iarray[a]!=105 && iarray[a]!=0){
                    state=1;
                }
            }
            //State 2
            else if(state == 2){
                if(iarray[a]==119){
                    state=2;
                }
                else if(iarray[a]==105){
                    state=8;
                }
                else if(iarray[a]==104){
                    state=3;
                }
                else if(iarray[a]!=104 && iarray[a]!=0){
                    state=1;
                }
            }
            //State 3
            else if(state == 3){
                if(iarray[a]==119){
                    state=2;
                }
                else if(iarray[a]==105){
                    state=4;
                }
                else if(iarray[a]!=105 && iarray[a]!=0){
                    state=1;
                }
            }
            //State 4
            else if(state == 4){
                if(iarray[a]==119){
                    state=2;
                }
                else if(iarray[a]==105){
                    state=8;
                }
                else if(iarray[a]==108 ){
                    state=5;
                }
                else if(iarray[a]==102){
                    state=9;
                }
                else if(iarray[a]!=108 && iarray[a]!=102 && iarray[a]!=0){
                    state=1;
                }
            }
            //State 5
            else if(state==5){
                if(iarray[a]==119){
                    state=2;
                }
                else if(iarray[a]==105){
                    state=8;
                }
                else if(iarray[a]==101){
                    state=6;
                }
                else if(iarray[a]!=101 && iarray[a]!=0){
                    state=1;
                }
            }
            // State 6
            else if(state==6){
                if(iarray[a]==105){
                    state=7;
                }
                else if(iarray[a]==119){
                    state=24;
                }
                else if(iarray[a]!=105 && iarray[a]!=119 && iarray[a]!=0){
                    state=6;
                }
            }
            //State 7
            else if(state==7){
                if(iarray[a]==119){
                    state=24;
                }
                else if(iarray[a]==105){
                    state=7;
                }
                else if(iarray[a]==102){
                    state=14;
                }
                else if(iarray[a]!=102 && iarray[a]!=0){
                    state=6;
                }
            }
            //State 8
            else if(state==8){
                if(iarray[a]==119){
                    state=2;
                }
                else if(iarray[a]==105){
                    state=8;
                }
                else if(iarray[a]==102){
                    state=9;
                }
                if(iarray[a]!=102 && iarray[a]!=0){
                    state=1;
                }
            }
            //State 9
            else if(state==9){
                if(iarray[a]==105){
                    state=15;
                }
                else if(iarray[a]==119){
                    state=10;
                }
                else if(iarray[a]!=105 && iarray[a]!=119 && iarray[a]!=0){
                    state=9;
                }
            }
            //State 10
            else if(state==10){
                if(iarray[a]==119){
                    state=10;
                }
                else if(iarray[a]==105){
                    state=15;
                }
                else if(iarray[a]==104){
                    state=11;
                }
                else if(iarray[a]!=104 && iarray[a]!=0){
                    state=9;
                }
            }
            //State 11
            else if(state==11){
                if(iarray[a]==119){
                    state=10;
                }
                else if(iarray[a]==105){
                    state=12;
                }
                else if(iarray[a]!=105 && iarray[a]!=0){
                    state=9;
                }
            }
            //State 12
            else if(state==12){
                if(iarray[a]==119){
                    state=10;
                }
                else if(iarray[a]==105){
                    state=15;
                }
                else if(iarray[a]==102){
                    state=1;
                }
                else if(iarray[a]==108){
                    state=13;
                }
                else if(iarray[a]!=102 && iarray[a]!=108 && iarray[a]!=0){
                    state=9;
                }
            }
            //State 13
            else if(state==13){
                if(iarray[a]==119){
                    state=10;
                }
                else if(iarray[a]==105){
                    state=15;
                }
                else if(iarray[a]==101){
                    state=14;
                }
                else if(iarray[a]!=101 && iarray[a]!=0){
                    state=9;
                }
            }
            //State 14
            else if(state==14){
                if(iarray[a]==119){
                    state=19;
                }
                else if(iarray[a]==105){
                    state=20;
                }
                else if(iarray[a]!=119 && iarray[a]!=105 && iarray[a]!=0){
                    state=14;
                }
            }
            //State 15
            else if(state==15){
                if(iarray[a]==119){
                    state=10;
                }
                else if(iarray[a]==105){
                    state=15;
                }
                else if(iarray[a]==102){
                    state=1;
                }
                else if(iarray[a]!=102 && iarray[a]!=0){
                    state=9;
                }
            }
            //Sate 16
            else if(state==16){
                if(iarray[a]==119){
                    state=19;
                }
                else if(iarray[a]==105){
                    state=20;
                }
                else if(iarray[a]==101){
                    state=9;
                }
                else if(iarray[a]!=101 && iarray[a]!=0){
                    state=14;
                }
            }
            //State 17
            else if(state==17){
                if(iarray[a]==119){
                    state=19;
                }
                else if(iarray[a]==105){
                    state=20;
                }
                else if(iarray[a]==108){
                    state=16;
                }
                else if(iarray[a]==102){
                    state=6;
                }
                else if(iarray[a]!=102 && iarray[a]!=108 && iarray[a]!=0){
                    state=14;
                }
            }
            //State 18
            else if(state==18){
                if(iarray[a]==119){
                    state=19;
                }
                else if(iarray[a]==105){
                    state=17;
                }
                else if(iarray[a]!=105 && iarray[a]!=0){
                    state=14;
                }
            }
            //State 19
            else if(state==19){
                if(iarray[a]==119){
                    state=19;
                }
                else if(iarray[a]==105){
                    state=20;
                }
                else if(iarray[a]==104){
                    state=18;
                }
                else if(iarray[a]!=104 && iarray[a]!=0){
                    state=14;
                }
            }
            //State 20
            else if(state==20){
                if(iarray[a]==119){
                    state=19;
                }
                else if(iarray[a]==105){
                    state=20;
                }
                else if(iarray[a]==102){
                    state=6;
                }
                else if(iarray[a]!=102 && iarray[a]!=0){
                    state=14;
                }
            }
            //State 21
            else if(state==21){
                if(iarray[a]==119){
                    state=24;
                }
                else if(iarray[a]==105){
                    state=7;
                }
                else if(iarray[a]==101){
                    state=1;
                }
                else if(iarray[a]!=101 && iarray[a]!=0){
                    state=6;
                }
            }
            //State 22
            else if(state==22){
                if(iarray[a]==119){
                    state=24;
                }
                else if(iarray[a]==105){
                    state=7;
                }
                else if(iarray[a]==108){
                    state=21;
                }
                else if(iarray[a]==102){
                    state=14;
                }
                else if(iarray[a]!=108 && iarray[a]!=102 && iarray[a]!=0){
                    state=6;
                }
            }
            //State 23
            else if(state==23){
                if(iarray[a]==119){
                    state=24;
                }
                else if(iarray[a]==105){
                    state=22;
                }
                else if(iarray[a]!=105 && iarray[a]!=0){
                    state=6;
                }
            }
            //State 24
            else if(state==24){
                if(iarray[a]==119){
                    state=24;
                }
                else if(iarray[a]==105){
                    state=7;
                }
                else if(iarray[a]==104){
                    state=23;
                }
                else if(iarray[a]!=104 && iarray[a]!=0){
                    state=6;
                }
            }
            //System.out.println(str);
        }
        System.out.println("Final State: "+ state);
        if(state == 6 ||state == 7 ||state == 21 ||state == 22 ||state == 23 ||state == 24){
            System.out.println("Final State is ACCEPTED!");
        }else {
            System.out.println("Final State is REJECTED!");
        }
    }
}

