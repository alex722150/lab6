import  java.util.HashMap ;
import  java.util.List ;
import  java.util.ArrayList ;
������  java.util.Random ;
import  java.util.Collections ;
��������  �����  A {
    HashMap < Integer , String > a =  new  HashMap <> ();
    ��������� ����   =  �����  ��������� ();
    public  void  mapping () {
        ��� ( int i =  0 ; i < 10 ; i ++ ) {
            � . ������� (�, random_name ());
        }
    }

    public  String  random_name () {
        String name =  " abcdrfghijklmopqrstuvwxyz " ;
        String names =  " " ;
        for ( int i =  0 ; i < rand . nextInt ( 10 ); i ++ ) {
            ����� + = ��� . charAt (���� . nextInt ( 10 ));
        }
        ������� �����;
    }

    public  void  outall () {
        ������� . �� . println (a . values ??());
    }
    public  void  out ( int  number ) {
        � . �������� (�����);
    }
}