//Structues --> it is a collection of diff datatypes

struct person{
    int age;
    char name[25];
    float height;
    double members;
} ;//p1 , p2 ;
struct person p1, p2;

//union --> same as structures, only diff is calucting size
// consider heighest size and prints 

union person{
    int age;
    char name[25];
    float height;
    double members;
} /p1 , p2 ;   // o/p:- 25


//pointers-->pointers are simple address vairables

// pointer is also a variable , but it stores the address of some other variable or address of a memory location.
//memory  numbers are stored in hexadecimal system

//int a ;   a--10
//int a=*p; int *p-- 2000 +4 ----2000-2004-2008-2012
//int c = 
//null pointer --> it points to nothing eg:- int y=null;
