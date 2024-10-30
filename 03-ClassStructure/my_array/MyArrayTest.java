package my_array;

public class MyArrayTest {
        public static void main(String[] args) {
            int[] numbers1 = {15,1,7,1,467,253,127};
            int[] numbers2 = {65,12,776,341,783};

            int[][] numbers3 ={{65,12,776,341,783},
                               {65,12,12,341,24},
                               {12,12,776,341,783},
                               {65,12,76,341,783}
                                };                  


            System.out.println(MyArray.even(numbers1));

            System.out.println(MyArray.positiveOdd(numbers1));

            System.out.println(MyArray.reverse(numbers1));

            System.out.println(MyArray.compare(numbers1, numbers2));

            System.out.println(MyArray.different(numbers1, numbers2));

            System.out.println(MyArray.exist(467,numbers1));

            System.out.println(MyArray.secondMax(numbers1));

            System.out.println(MyArray.lastColumn(numbers3));

            System.out.println(MyArray.swap(numbers3));

            System.out.println(MyArray.two2one(numbers3));

    }
}
