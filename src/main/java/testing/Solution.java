package testing;

import java.util.Scanner;

class Solution
{
    public void solution( int N )
    {
        //
        // write your logic here and print the desired output
        //
        int size = 2 * N - 1;
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while( N != 0 )
        {
            for( int i = front; i <= back; i++ )
            {
                for( int j = front; j <= back;
                     j++ )
                {
                    if( i == front || i == back ||
                        j == front || j == back )
                    {
                        a[i][j] = N;
                    }
                }
            }
            ++front;
            --back;
            --N;
        }
        print( a, size );
    }

    public static void print( int arr[][], int size )
    {
        for( int i = 0; i < size; i++ )
        {
            for( int j = 0; j < size; j++ )
            {
                System.out.print( arr[i][j] );

            }
            System.out.println();
        }
    }
}

// Following is the part of the program and is provided as an assistance to read the input.
class Main
{
    public static void main( String[] args ) throws InterruptedException
    {
        Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        Solution s = new Solution();
        s.solution( N );
    }
}

