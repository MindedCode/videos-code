/******************************************************************************
Q --- Make a program that takes the radius of a circle as input, calculates its radius 
and area and prints it as output to the user.

r = C/2 pi
------

Area of the circle = 2 × circumference

We Know, 
Area of the circle = π r2
Circumference = 2πr

Therefore,

=> π r2 = 2×2×π×r

=> r = 4
--------------------------------------------------------------------------------
Given: Radius = 12 cm.

Area of circle = π r2
                            = 3.14  × (12)2

A = 452.6 cm2

Now Circumference of circle,

C = 2πr
C = 2 × 3.14 × 12

Circumference = 75.36 cm

Therefore the area of circle is  452.6 cm2 and circumference of circle is 75.36 cm

*******************************************************************************/

// Code here :
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        final float PI = 3.14f;
        float circumfere = 2*PI*radius; 
        
        float area = PI*radius*radius;
        System.out.println("the area of circle =>" + area + " cm2");
        System.out.println("the circumference of circle => " + circumfere + " cm" );
	}
}

**//Output of the program :**

12
the area of circle =>452.16 cm2
the circumference of circle => 75.36 cm


