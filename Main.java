import java.util.Random;

public class Main {

    public static int rolledTrue = 0 ;
    public static int rolledFalse = 0;
    public static Random roll = new Random();
    public static double total = 100000;


    public static void main(String[] args) {
        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();
    }

    public static void scenario1(){

        for(int i = 0; i <= total; i++){
           int rollValue = roll.nextInt(6)+1;
           if((rollValue == 1)||(rollValue == 3)||(rollValue == 5)){rolledTrue++;}
           else{rolledFalse++;}
        }
        System.out.println("Count of True: "+rolledTrue);
        System.out.println("Count of False: "+ rolledFalse);
        System.out.println("Condition Reached: "+((float)rolledTrue/(float)total)*100+"%");
    }
    // Scenario Prediction

    public static void scenario2(){
        rolledTrue=0;
        rolledFalse=0;
        for(int i = 0; i <= total; i++){
            int rollValue = roll.nextInt(10)+1;
            if((rollValue == 2)||(rollValue == 4)||(rollValue >= 5)){rolledTrue++;}
            else{rolledFalse++;}
        }
        System.out.println("Count of True: "+rolledTrue);
        System.out.println("Count of False: "+ rolledFalse);
        System.out.println("Condition Reached: "+((float)rolledTrue/(float)total)*100+"%\n");
    }
    // Scenario Prediction
    public static void scenario3(){
        rolledTrue=0;
        rolledFalse=0;
        for(int i = 0; i <= total; i++){
            int rollValue = roll.nextInt(6)+1;
            if((rollValue == 2)||(rollValue == 4)||(rollValue == 6)){
                int rollValue2 = roll.nextInt(6)+1;
                if((rollValue2 == 1)||(rollValue2 == 3)||(rollValue2 == 5)){rolledTrue++;}
                else{rolledFalse++;}
            }
            else{rolledFalse++;}
        }
        System.out.println("Count of True: "+rolledTrue);
        System.out.println("Count of False: "+ rolledFalse);
        System.out.println("Condition Reached: "+((float)rolledTrue/(float)total)*100+"%\n");

    }
    // Scenario Prediction
    public static void scenario4(){
        rolledTrue=0;
        rolledFalse=0;
        for(int i = 0; i <= total; i++){
            int rollValue = roll.nextInt(6)+1;
            if((rollValue == 1)||(rollValue == 2)) {
                int rollValue2 = roll.nextInt(6) + 1;
                if ((rollValue2 == 3) || (rollValue2 == 4)) {
                    int rollValue3 = roll.nextInt(6) + 1;
                    if ((rollValue3 == 5) || (rollValue3 == 6)) {
                        rolledTrue++;
                    } else {
                        rolledFalse++;
                    }
                }
                else{rolledFalse++;}
            }
            else{rolledFalse++;}
        }
        System.out.println("Count of True: "+rolledTrue);
        System.out.println("Count of False: "+ rolledFalse);
        System.out.println("Condition Reached: "+((float)rolledTrue/(float)total)*100+"%\n");

    }
    // Scenario Prediction
    public static void scenario5(){
        rolledTrue=0;
        rolledFalse=0;
        for(int i = 0; i <= total; i++){

            int rollValue = roll.nextInt(6)+1;
            int rollValue2 = roll.nextInt(6) + 1;
            int rollValue3 = roll.nextInt(6) + 1;
            int rollValue4 = roll.nextInt(6) + 1;

            if(rollValue>0){
                if (rollValue != rollValue2) {
                    if ((rollValue != rollValue3)&&(rollValue2 != rollValue3)) {
                        if((rollValue != rollValue4)&&(rollValue2 != rollValue4)&&(rollValue3!=rollValue4)){
                            rolledTrue++;
                        }
                        else{rolledFalse++;}
                    } else {
                        rolledFalse++;
                    }
                }
                else{rolledFalse++;}
            }
            else{rolledFalse++;}
        }
        System.out.println("Count of True: "+rolledTrue);
        System.out.println("Count of False: "+ rolledFalse);
        System.out.println("Condition Reached: "+((float)rolledTrue/(float)total)*100+"%\n");

    }
    // Scenario Prediction


}
