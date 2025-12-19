public class Helper {
    int x = 0;

    public void passedValue( int val){
        System.out.println("value passed to "+ val);
        x = val;
    }

    public void modifiedInClass(){
        x += 2;
        System.out.println("value after modificaiton in class: "+ x);
    }
}