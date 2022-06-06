package com.sapient.asde.ui;

public class SumAndAverage {
    public static void main(String[] args){
        int l=args.length,sum=0;
        try{
            if(l==0){
                throw new IllegalArgumentException("");
            }
            for (int i = 0; i < l; i++)
                sum += Integer.parseInt(args[i]);
            System.out.println("Sum of the command line array input is : " + sum);
            System.out.println("Average of the command line array input is : " +(double)sum / l);
        }

        catch(NumberFormatException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
