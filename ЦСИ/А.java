import  java.util.HashMap ;
import  java.util.List ;
import  java.util.ArrayList ;
импорт  java.util.Random ;
import  java.util.Collections ;
открытый  класс  A {
    HashMap < Integer , String > a =  new  HashMap <> ();
    Случайный ранд   =  новый  Случайный ();
    public  void  mapping () {
        для ( int i =  0 ; i < 10 ; i ++ ) {
            а . ставить (я, random_name ());
        }
    }

    public  String  random_name () {
        String name =  " abcdrfghijklmopqrstuvwxyz " ;
        String names =  " " ;
        for ( int i =  0 ; i < rand . nextInt ( 10 ); i ++ ) {
            имена + = имя . charAt (ранд . nextInt ( 10 ));
        }
        вернуть имена;
    }

    public  void  outall () {
        Система . из . println (a . values ??());
    }
    public  void  out ( int  number ) {
        а . получить (номер);
    }
}