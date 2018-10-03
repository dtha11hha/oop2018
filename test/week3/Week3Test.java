package week3;
import org.junit.Assert;
import org.junit.Test;

public class week3Test {

    @Test
    public void Test() {


        // TODO: Viết 5 testcase cho phương thức max()
        Assert.assertEquals(8,Week3.max(6,8));
        Assert.assertEquals(10,Week3.max(1,10));
        Assert.assertEquals(7,Week3.max(3,7));
        Assert.assertEquals(-5,Week3.max(-10,-5));
        Assert.assertEquals(100,Week3.max(-17,100));
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        int arr1 [] = {-1,5,6,3,8,10};
        int arr2 [] = {31,27,10,54,67};
        int arr3 [] = {1,3,5,340,87,100,23,83};
        int arr4 [] = {8,-2,23,45,15,61,430};
        int arr5 [] = {10,33,64,20124,22,7457,88,9459};
        Assert.assertEquals(-1,Week3.minOfArray(arr1));
        Assert.assertEquals(10,Week3.minOfArray(arr2));
        Assert.assertEquals(1,Week3.minOfArray(arr3));
        Assert.assertEquals(-2,Week3.minOfArray(arr4));
        Assert.assertEquals(10,Week3.minOfArray(arr5));
        // TODO: Viết 5 testcase cho phương thức calculateBMI()
        double weight1=60,height1=1.71,weight2=40,height2=1.85,weight3=100,height3=1.4,weight4=50,height4=1.6,weight5=200,height5=2.5;
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(weight1,height1)); //20.51
        Assert.assertEquals("Thieu Can",Week3.calculateBMI(weight2,height2)); //11.68
        Assert.assertEquals("Beo Phi",Week3.calculateBMI(weight3,height3)); //51.02
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(weight4,height4)); //19.53
        Assert.assertEquals("Beo Phi",Week3.calculateBMI(weight5,height5)); //32
    }
}
