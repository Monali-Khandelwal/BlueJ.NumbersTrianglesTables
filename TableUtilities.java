 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder str = new StringBuilder();
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                String val = String.format("%3d |", i*j);
                str = str.append(val);
            }
            str.append("\n");
        }
    
        return str.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder str = new StringBuilder();
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                String val = String.format("%3d |", i*j);
                str = str.append(val);
            }
            str.append("\n");
        }
    
        return str.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder str = new StringBuilder();
        for (int i=1; i<=tableSize; i++){
            for (int j=1; j<=tableSize; j++){
                String val = String.format("%3d |", i*j);
                str = str.append(val);
            }
            str.append("\n");
        }
    
        return str.toString();
    }
}
