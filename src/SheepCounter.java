public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int result = 0;
        for (Boolean value : arrayOfSheeps){
            if (value!=null && value){
                result += 1;
            }
        }
        return result;
    }
}
