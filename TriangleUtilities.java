 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String star = "";
        for (int i=1; i<=numberOfStars; i++){
            star = star + "*";
        }
        return star;
    }
    
    public static String getTriangle(int numberOfRows) {
        String tri = "";
        for (int i=0; i<numberOfRows; i++){
            tri = tri + "*";
            
        }
            tri = tri + "\n";
        return tri;
    }


    public static String getSmallTriangle() {
        String result = getTriangle(4);
        return result;
    }

    public static String getLargeTriangle(int numberOfRows) {
        String result = getTriangle(9);
        return result;
    }
}
