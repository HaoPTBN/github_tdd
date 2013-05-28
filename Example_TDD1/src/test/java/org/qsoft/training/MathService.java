package org.qsoft.training;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/28/13
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathService {
    public int methodAdd(String numbers) {
        int resultReturn = 0;
        if (numbers == null || numbers.equals("")) {
            resultReturn = 0;
        } else {
            try {
                String[] arrayString = numbers.split(",");
                int index = arrayString.length;
                for (int i = 0; i < index; i++) {
                    resultReturn += Integer.valueOf(arrayString[i]);
                }
            } catch (Exception e) {
                resultReturn = -1;
            }
        }
        return resultReturn;
    }
}
