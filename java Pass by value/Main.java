class Main{
    public static void main(String[] args){
        Helper h = new Helper();
        int z = 7;
        // now, i'd pass this value to h object, i'll modify this in using modifiedValue in object method.
        h.passedValue( z);
        h.modifiedInClass();
        System.out.println(" z var. current value in Main: "+z);
    }
}