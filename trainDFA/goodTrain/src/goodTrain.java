/**
 * Created by Song on 1/16/17.
 */
public class goodTrain {

    public static void main(String[] args) {
        String inputTrain = "EETTTTG"; //input string
        System.out.print(goodTrainRecognizer(inputTrain)); //show result
    }

    private static String goodTrainRecognizer(String inputTrain) {
        int state = 0; //start with state 0.
        String success = "OK"; //success message!
        String fail = "not OK"; //fail message!
        for (int i = 0; i < inputTrain.length(); i++) {
            char letter = inputTrain.charAt(i); //get every character in the string.
            switch (state) { //follow by the dfa diagram.
                case 0:
                    if (letter == 'E') {
                        state = 1;
                    }
                    else {
                        return fail;
                    }
                    break;
                case 1:
                    if (letter == 'E' || letter == 'T') {
                        state = 2;
                    }
                    else {
                        return fail;
                    }
                    break;
                case 2:
                    if (letter == 'T') {
                        state = 3;
                    }
                    else {
                        return fail;
                    }
                    break;
                case 3:
                    if (letter == 'T') {
                        state = 3;
                    }
                    else if (letter == 'G') {
                        state = 4;
                    }
                    else {
                        return fail;
                    }
                    break;
                case 4:
                    return fail;
                default:
                    break;
            }
        }

        if (state == 4) {
            return success;
        }
        else {
            return fail;
        }
    }
}
