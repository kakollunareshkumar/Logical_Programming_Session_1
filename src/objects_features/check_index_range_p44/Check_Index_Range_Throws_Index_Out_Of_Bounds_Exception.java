package objects_features.check_index_range_p44;

import java.util.Objects;

public class Check_Index_Range_Throws_Index_Out_Of_Bounds_Exception {

        private static final int X_UPPER_BOUND = 11;
        private static final int Y_UPPER_BOUND = 16;
        private final int x;
//Old Approach
//        public Check_Index_Range_Throws_Index_Out_Of_Bounds_Exception(int x) {
//
//            if (x < 0 || x >= X_UPPER_BOUND) {
//                throw new IndexOutOfBoundsException("...");
//            }
//
//            this.x = x;
//        }

//        public int xMinusY(int y) {
//
//            if (y < 0 || y >= x) {
//                throw new IndexOutOfBoundsException("...");
//            }
//
//            return x - y;
//        }
//
//        public static int oneMinusY(int y) {
//
//            if (y < 0 || y >= Y_UPPER_BOUND) {
//                throw new IndexOutOfBoundsException("...");
//            }
//
//            return 1 - y;
//        }

    public static void main(String[] args) {
        Check_Index_Range_Throws_Index_Out_Of_Bounds_Exception c = new Check_Index_Range_Throws_Index_Out_Of_Bounds_Exception(5);
        oneMinusY1(17);
    }
    public   Check_Index_Range_Throws_Index_Out_Of_Bounds_Exception(int x) {

        this.x = Objects.checkIndex(x, X_UPPER_BOUND);
    }

    public int xMinusY1(int y) {
//New Approach
        Objects.checkIndex(y, x);

        return x - y;
    }

    public static int oneMinusY1(int y) {

        Objects.checkIndex(y, Y_UPPER_BOUND);

        return 1 - y;
    }

}

 //   Starting with JDK 9, the code can be rewritten to use the Objects.checkIndex() method. This method verifies whether the
//   given index is in the range [0, length] and returns the given index in this range or throws IndexOutOfBoundsException


