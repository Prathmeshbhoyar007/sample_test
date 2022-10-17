
package exercise;

public class ArrayExercise {
    /**
     * @param args
     */
    public static void main(String[] args){
        int [] ages = new int[5];
        // ages[0] = 10;
        // ages[1] = 20;
        // ages[2] = 30;
        // ages[3] = 40;
        // ages[4] = 50;
        for(int i=0; i<ages.length; i++){
            ages[i]= (i+1)*10;
        }

        // how to traverse array elements

        for(int i=0; i < ages.length; i++){
            System.out.println(i + "=" + ages[i]);
        }

        String[] months = {"January", "February", "March","April","May","June", "July","August","September","Octomber","Novenber","December"};
        for(int i=0; i<months.length; i++){
            System.out.println(months[i]);
        }
    }
}
